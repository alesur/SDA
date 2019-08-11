public class Dog {
    private String type;

     Dog() {
        this.setType("Homie");
    }
    Dog(String t){
      this.setType(t);
   }

    public String getType() {
        return type;
    }

    //Setter
    public void setType(String t) {
        this.type = t;
    }

}