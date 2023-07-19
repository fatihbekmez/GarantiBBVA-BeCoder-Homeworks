public class SmartPhone extends Phone {

    public int storge;
    int ram;
    int camera;


    public SmartPhone(){

    }



    SmartPhone(int id, String name, int price, String phoneNumber,  int storge, int ram, int camera ){
        this.storge = storge;
        this.ram = ram;
        this.camera = camera;
        this.id = id;
        this.name = name;
        this.price = price;
        this.phoneNumber = phoneNumber;

    }
}
