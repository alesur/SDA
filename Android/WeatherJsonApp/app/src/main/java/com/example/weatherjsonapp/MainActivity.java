package com.example.weatherjsonapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    // we"ll make HTTP request to this URL to retrieve weather conditions
    //"http://api.openweathermap.org/data/2.5/weather?q=vilnius,lt&appid=xxxxxxxxxYourAPI_Keyxxxxxxxxxxxx&units=metric";

    String weatherWebserviceURL = "http://api.openweathermap.org/data/2.5/weather?";
    String param1= "q=";
    String param2= "&appid=921a10fcda24380b8f0a8653172fa036";
    String param3= "&units=metric";

    ProgressDialog pDialog;
    TextView temperature, desc, main, location;
    ImageView weatherBackground, ikonka, forIcon;
    JSONObject jsonObj;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        temperature = (TextView) findViewById(R.id.temperature);
        desc = (TextView) findViewById(R.id.desc);
        main = (TextView) findViewById(R.id.main);
        location = (TextView) findViewById(R.id.txtLocation);
        weatherBackground = (ImageView) findViewById(R.id.weatherbackground);
        ikonka = (ImageView) findViewById(R.id.ikonka);

        //forIcon  = (ImageView) findViewById(R.id.imageView1);


        // prepare the loading Dialog
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait while retrieving the weather condition ...");
        pDialog.setCancelable(false);

        // Check if Internet is working
        if (!isNetworkAvailable(this)) {
            Toast.makeText(this, "Please check your Internet connection", Toast.LENGTH_LONG).show();
        }
        else{
            pDialog.show();
            mainStuff();
        }

    }//onCreate Ended

    private void mainStuff() {
        // make HTTP request to retrieve the weather
        weatherWebserviceURL = weatherWebserviceURL + param1+"Vilnius" +param2+param3;

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                weatherWebserviceURL, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {

                    Log.e("RESPONSE", response.toString());

                    jsonObj = (JSONObject) response.getJSONArray("weather").get(0);
                    Log.e("WEATHER", jsonObj.toString());
                    Log.e("XXXXX", "xxxxxxxxxxxxxxxxxx");


                    //Working with the WEATHER array that is one of the parts of Response
                    String mainStr = jsonObj.getString("main");
                    String descStr = jsonObj.getString("description");
                    Log.e("======","Main | Description");
                    Log.e("======",   mainStr + "|" + descStr);
                    main.setText(mainStr);
                    desc.setText(descStr);
                    Log.e("XXXXX", "xxxxxxxxxxxxxxxxxx");
                    String icon = jsonObj.getString("icon");//for later
                    Log.e("ICON", icon);
                    String imageView = "https://openweathermap.org/img/w/" + icon + ".png";
                    Log.e("XXXXX", "xxxxxxxxxxxxxxxxxx");
                    Picasso.get().load(imageView).into(ikonka);




                    //temperature that is a part of another "MAIN" object also present in the Response(not the main in weather)
                    JSONObject jsonObjectMain = response.getJSONObject("main");
                    Log.e("MAIN", jsonObjectMain.toString());
                    String temp = jsonObjectMain.getString("temp");
                    Log.e("MAIN", "temp: " + temp);
                    temperature.setText(temp + " °C");
                    Log.e("XXXXX", "xxxxxxxxxxxxxxxxxx");

                    //Log.e("XXXX2", response.getJSONObject("wind").getString("speed") );
                    //Log.e("XXXX3", response.getJSONObject("coord").getString("lat") +"/" + response.getJSONObject("coord").getString("lon") );


                    String backgroundImage = "xxx";

                    //choose the image to set as background according to weather condition
                    if (mainStr.equals("Clouds")) {
                        backgroundImage = "https://marwendoukh.files.wordpress.com/2017/01/clouds-wallpaper2.jpg";
                    } else if (mainStr.equals("Clear")) {
                        backgroundImage = "https://ae01.alicdn.com/kf/HTB1sIXEXcnrK1RjSspkxh5uvXXaZ/Laeacco-Photo-Backgrounds-Bule-Sky-Cloudy-Sunny-Portrait-Wallpaper-Scenic-Photography-Backdrops-Photocall-Photo-Studio.jpeg_640x640.jpeg";
                    } else if (mainStr.equals("Rain")) {
                        backgroundImage = "https://marwendoukh.files.wordpress.com/2017/01/rainy-wallpaper1.jpg";
                    } else if (mainStr.equals("Snow")) {
                        backgroundImage = "https://marwendoukh.files.wordpress.com/2017/01/snow-wallpaper1.jpg";
                    }
                    Log.e("ImgURL", backgroundImage);
                    //backgroundImage = "https://marwendoukh.files.wordpress.com/2017/01/snow-wallpaper1.jpg";

                    /*InputStream in = null;
                    try {
                        in = new java.net.URL(backgroundImage).openStream();
                        Bitmap img = BitmapFactory.decodeStream(in);
                        weatherBackground.setImageBitmap(img);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }*/

                    Picasso.get().load(backgroundImage).into(weatherBackground);
                    //Picasso.get().load(backgroundImage).fit().into(weatherBackground);




                    // hide the loading Dialog
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error , try again ! ", Toast.LENGTH_LONG).show();
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("tag", "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(), "Error while loading ... ", Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                pDialog.dismiss();
            }
        });

        // Adding request to request queue
        AppController.getInstance(this).addToRequestQueue(jsonObjReq);


    }


    ////////////////////check internet connection
    public boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }





}
