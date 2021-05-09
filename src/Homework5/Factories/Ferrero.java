package Homework5.Factories;

import Homework5.Helpers.FactoriesService;

public class Ferrero extends Factory {
    private Ferrero(String address, String phoneNumber) {
        super(address, phoneNumber);
    }

    private static Ferrero instance;

    public static Ferrero getInstance() {
        instance = instance != null ? instance :
                (Ferrero) new Ferrero("Italy", "395250")
                        .setFoundedId(1946)
                        .setDelivery(true)
                        .setNumberOfEmployees(110000);
        FactoriesService.addFactory(instance);
        return instance;
    }

}
