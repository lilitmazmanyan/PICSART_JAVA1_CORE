package Homework5.Helpers;

import Homework5.Factories.Factory;

import java.util.*;

public class FactoriesService {
    private static ArrayList<Factory> allFactoriesList = new ArrayList<>();

    public static void addFactory(Factory f) {
        allFactoriesList.add(f);
    }

    public static ArrayList<Factory> getAllFactoriesList() {
        return allFactoriesList;
    }

    public static Factory getFactoryWithMostNUmberOfEmpl() {
        Factory result = allFactoriesList.get(0);
        for (Factory factory : allFactoriesList) {
            if (factory.getNumberOfEmployees() > result.getNumberOfEmployees()) {
                result = factory;
            }
        }
        return result;
    }

    public static Factory getOldestFactory() {
        Collections.sort(allFactoriesList);
        return allFactoriesList.get(0);
    }
}
