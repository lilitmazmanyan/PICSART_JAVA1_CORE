package Homework5.Factories;

import Homework5.Helpers.FactoriesService;

public class Mars extends Factory {
    private Mars(String address, String phoneNumber) {
        super(address, phoneNumber);
    }

    private static Mars instance;

    public static Mars getInstance() {
        instance = instance != null ? instance :
                (Mars) new Mars("Washington", "136521")
                        .setFoundedId(1911)
                        .setDelivery(true)
                        .setNumberOfEmployees(35000);
        FactoriesService.addFactory(instance);
        return instance;
    }

}
