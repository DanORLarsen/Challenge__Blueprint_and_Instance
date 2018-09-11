import java.awt.*;

public class Phone {
    String PhoneModel;
    Color PhoneColor;
    double PhoneHeight;
    String PhoneCall;

    public Phone(
            String inputPhoneModel,
            Color inputPhoneColor,
            double inputPhoneHeight,
            String inputPhoneCall)

    {this.PhoneModel = inputPhoneModel;
     this.PhoneColor = inputPhoneColor;
     this.PhoneHeight = inputPhoneHeight;
     this.PhoneCall = inputPhoneCall;
    }
    public void changePhoneColor(Color newPhoneColor) {

        this.PhoneColor = newPhoneColor;

}}
