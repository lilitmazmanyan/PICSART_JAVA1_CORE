package Homework5.Factories;

public class Mars extends Factory {
    private Mars(String address, String phoneNumber) {
        super(address, phoneNumber);
    }

    private static Mars instance;

    public static Mars getInstance() {
        return instance != null ? instance :
                (Mars) new Mars("Washington", "181866666")
                        .setFoundedId(1911)
                        .setDelivery(true)
                        .setNumberOfEmployees(35000);
    }

}
