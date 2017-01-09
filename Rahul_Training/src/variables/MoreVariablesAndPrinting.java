package variables;

public class MoreVariablesAndPrinting {

	public static void main( String[] args )
    {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = "Rahul Kumar";
        myAge = 31;     // not a lie
        myHeight = 70;  // inches
        myWeight = 90; // kgs
        myEyes = "Black";
        myTeeth = "White";
        myHair = "Black";

        System.out.println( "Let's talk about " + myName + "." );
        System.out.println( "He's " + myHeight + " inches tall." );
        System.out.println( "He's " + myWeight + " kilos heavy." );
        System.out.println( "Actually, that's quite heavy." );
        System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
        System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
            + " I get " + (myAge + myHeight + myWeight) + "." );
    }
}
