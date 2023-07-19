public class Main {
    public static void main(String[] args) {

        PhoneApp phoneApp = new PhoneApp();
        double result = phoneApp.calculateTotalPrice(phoneApp.array);

        System.out.println("Toplam Fiyat: " + result + " TL");

    }
}
