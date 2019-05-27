public class Enumz {
    public static void main(String[] args) {

        System.out.println("==================normal way");
        //convert to meters
        String chosenUnitString="INCH";
        double convMeterVal=1.0;
        double convCentiMeterVal=0.01;
        double convInchVal=0.025;
        double convFootVal=0.3;


        switch(chosenUnitString) {
            case "FOOT":
                System.out.println("Foot unit is selected.... use " + convFootVal);
                break;
            case "METER":
                System.out.println("Meter unit is selected.... use " + convMeterVal);
                break;
            case "INCH":
                System.out.println("Inch unit is selected.... use " + convInchVal);
                break;
            case "CENTIMETER":
                System.out.println("Centimeter unit is selected.... use " + convCentiMeterVal);
                break;
        }//20 lines of code


        System.out.println("\n================== Enum way");
        LengthUnit chosenUnit = LengthUnit.valueOf("INCH");
        System.out.println(chosenUnit.convertToMeters());

        System.out.println("\n================== Enum way");
        LengthUnit chosenUnit2 = LengthUnit.valueOf("INCH");
        System.out.println(chosenUnit2.convertToMeters());

        System.out.println("\n================== Iteration");
        for(LengthUnit tempVar: LengthUnit.values()){
            System.out.println(tempVar + ": " + tempVar.convertToMeters());
        }

//        System.out.println("\n================== Decode");
//       // Cryptzz tempVar2 = Cryptzz.valueOf("tVxyMEb87CW0ktVxjkdsf");
//       // String temp = tempVar2.getMyCrypt();
//      //  RelationActiveEnum enumInstance = RelationActiveEnum.values()[value];
//        Cryptzz printout = Cryptzz.valueOf(Cryptzz.class, "tVxyMEb87CW0ktVxjkdsf");
//            System.out.println(printout);


        System.out.println("\n================== for complex eg.");
        Cryptzz cryptEnumVariable = Cryptzz.Iron;
        String tobeUsed = cryptEnumVariable.getMyCrypt();
        System.out.println(cryptEnumVariable + ": " + cryptEnumVariable.getMyCrypt());
    }


}

enum LengthUnit {
    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025),
    DECIMETER(0.40);

    double value;
    LengthUnit(double value) {
        this.value = value;
        System.out.println("Contructor: " + value);
    }

    double convertToMeters() {
        return value;
    }

}

enum Cryptzz {
    Iron("tVxyMEb87CW0ktVxjkdsf"),
    Ozzy("K6s28$vhCAqw4hkjuU$Qxx"),
    Pearl("vhCvfr55Aqw4xynnMEb8o157CW"),
    Audio("cxvWwyoooSkcnzuXgI7R41");

    String value;
    Cryptzz(String value) {
        this.value = value;
    }

    String getMyCrypt() {
        return value;
    }
}


