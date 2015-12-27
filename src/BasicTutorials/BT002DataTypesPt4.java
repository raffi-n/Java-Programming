package BasicTutorials;

/**
 * Created by Raffi on 12/24/2015.
 */
public class BT002DataTypesPt4 {

    public static void main(String[] args) {

        //byte, short, int, long
        //float,double char, boolean


        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to " + myString);

        //Treated as text but java merges it into 250.5549.95 because they are both String
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        //Treated as text but java merges 1050 because it recognized the int value
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
    }
}