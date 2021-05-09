package Homework5.Factories;

public class GrandCandy extends Factory {
    private GrandCandy(String address, String phoneNumber) {
        super(address, phoneNumber);
    }

    private static GrandCandy instance;

    public static GrandCandy getInstance() {
        return instance != null ? instance :
                (GrandCandy) new GrandCandy("Armenia", "374101020")
                        .setFoundedId(2000)
                        .setDelivery(true)
                        .setNumberOfEmployees(6000);
    }
}
