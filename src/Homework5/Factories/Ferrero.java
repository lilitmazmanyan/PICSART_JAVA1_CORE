package Homework5.Factories;

public class Ferrero extends Factory {
    private Ferrero(String address, String phoneNumber) {
        super(address, phoneNumber);
    }

    private static Ferrero instance;

    public static Ferrero getInstance() {
        return instance != null ? instance :
                (Ferrero) new Ferrero("Italy", "39525020")
                        .setFoundedId(1946)
                        .setDelivery(true)
                        .setNumberOfEmployees(110000);
    }

}
