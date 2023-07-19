
public class PhoneApp {

    SmartPhone motorola = new SmartPhone(1, "a1", 2, "12345", 64, 6, 48);
    SmartPhone samsung = new SmartPhone(2, "a2", 3, "12222", 64, 6, 48);
    SmartPhone apple = new SmartPhone(3, "a3", 4, "12344", 64, 6, 48);
    SmartPhone sony = new SmartPhone(4, "a4", 4, "12343", 64, 6, 4);
    SmartPhone ericsson = new SmartPhone(5, "a5", 4, "12444", 64, 6, 48);

    SmartPhone array[] = {motorola, samsung, apple, sony, ericsson};

    public Double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double toplam = 0.0;
        for (SmartPhone smartphone : smartPhoneArray) {
            toplam += smartphone.price;
        }
        return toplam;
    }
}