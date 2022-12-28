public class Day2 {
    public static void main (String[] args) {
        System.out.println("Today is Day2: 29 Dec");

        //Multi-variable
        int x=6;
        int y=7;
        int z=69;
        System.out.println(x+y+z);

        //One-value to multiple variable
        int l, m, n;
        l = m = n = 20;
        System.out.println(l+m+n);

        //Java Data-Types
        int myNUM = 69; //Integer
        System.out.println(myNUM);

        float myFloatNum = 2.99f; //Float
        System.out.println(myFloatNum);

        char myLetter = 'F'; //character
        System.out.println(myLetter);

        boolean myBool = true; //Boolean
        System.out.println(myBool);

        String myText = "Kap10"; //String
        System.out.println(myText);

        /* Data Types are of Two types: (a) Primitive (b) Non-primitve */
        //Non Primitve- Strings, Arrays etc

        //Boolean Data Types
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); //output is true
        System.out.println(isFishTasty); //output is false

        //Characters

        char myGrade = 'A';
        System.out.println(myGrade);

        char myVar1 = 61, myVar2 = 62, myVar3 = 63;
        System.out.println(myVar1); //=
        System.out.println(myVar2); //>
        System.out.println(myVar3); //?

        //Type Casting

        int myInt=6;
        double myDouble = myInt; //direct change int to doubler
        System.out.println(myInt);
        System.out.println(myDouble);




    }
}