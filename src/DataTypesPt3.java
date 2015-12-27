/**
 * Created by Raffi on 12/23/2015.
 */
public class DataTypesPt3 {

   public static void main(String[] args) {

      /* width 16 (2 bytes)
       char can only store one character #,A,$,^,% or a unicode character
       for unicode characters go to: unicode-table.com/en/#control-character */
       char myChar = '\u00A5'; //need to put slash and then u before unicode character 00A9
       System.out.println(myChar);


       boolean myBoolean = true;
       boolean isMale = true;

       /* Challenge
       Find code for the registered symbol on the same line as the copyright symbol and then
       create a variable of type char and assign it the unicode value for that symbol and print.
        */
       char registeredSymbol = '\u00AE';
       System.out.println(registeredSymbol);


   }
}