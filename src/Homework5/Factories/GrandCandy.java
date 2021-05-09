package Homework5.Factories;

import Homework5.Helpers.FactoriesService;

public class GrandCandy extends Factory {
    private GrandCandy(String address, String phoneNumber) {
        super(address, phoneNumber);
    }

    private static GrandCandy instance;

    public static GrandCandy getInstance() {
        instance = instance == null ?
                (GrandCandy) new GrandCandy("Armenia", "374102")
                        .setFoundedId(2000)
                        .setDelivery(true)
                        .setNumberOfEmployees(6000) : instance;
        FactoriesService.addFactory(instance);
        return instance;
    }
}
