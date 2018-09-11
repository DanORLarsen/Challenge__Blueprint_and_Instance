import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Phone myPhone = new Phone("iPhone 7", Color.BLACK,
                16.5, "Ring Ring");

        Phone otherPhone = new Phone("Nokia 3210", Color.BLUE,
                12.2, "Bling! Bling!");


System.out.println("Random dudes phone " + otherPhone.PhoneModel);
        System.out.println("Random dudes ringtone " + otherPhone.PhoneCall);
        System.out.println("Random dudes phone hight " + otherPhone.PhoneHeight);
        System.out.println("Random dudes phone color " + otherPhone.PhoneColor + " = Blue");
otherPhone.changePhoneColor(Color.GREEN);
        System.out.println("Changing phone color on Nokia 3210");
        System.out.println("Random dudes new phone color " + otherPhone.PhoneColor + " = Green");
    }
}
