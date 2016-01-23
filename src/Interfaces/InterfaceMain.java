package Interfaces;

/**
 * Created by Raffi on 1/22/2016.
 */
public class InterfaceMain {

    public static void main(String[] args) {

        /*Using the implementation of ITelephone as a data type, you can create instances
        * of it using the same variable name.*/

        ITelephone raffisPhone;
        raffisPhone = new Phone(123456);
        raffisPhone.powerOn();
        raffisPhone.callPhone(123456);
        raffisPhone.answer();
        System.out.println("------------------");
        raffisPhone = new MobilePhone(654321);
        raffisPhone.powerOn();
        raffisPhone.callPhone(654321);
        raffisPhone.answer();

    }
}
