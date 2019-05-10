package com.apps.yo.forjava.Pkg222;

import com.apps.yo.forjava.Pkg111.MyClass1;

public class MyClass2 {

     public static void main(String[] args) {

          MyClass1 obj = new MyClass1();
          System.out.println("Different Package");
          //System.out.println(obj.x_pvt);
          //System.out.println(obj.x_dft);
          //System.out.println(obj.x_ptd);
          System.out.println(obj.x_pub);

     }
}
