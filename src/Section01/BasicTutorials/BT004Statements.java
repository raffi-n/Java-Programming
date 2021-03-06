package Section01.BasicTutorials;

/**
 * @author Raffi
 */
public class BT004Statements {

    public static void main(String[] args) {

        /*Keywords in java are int, double, System.out.println, public class, package, etc.
        * The expression portion of the code int myVariable = 50; is "myVariable = 50". */

        //These are all statements. They usually end with a semicolon.
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        /*Java continues to search for the semicolon that would end this print statement
        * even if it is not on the same line.*/
        System.out.println("This is" +
                " another" +
                " still more");


        //This is whitespace which java will ignore.
        int                  whitespace
                  =
                  20;





    }





}
