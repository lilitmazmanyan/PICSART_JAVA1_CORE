package Homework5.Factories;

import Homework5.CustomExceptions.InvalidInputException;

public abstract class Factory implements Comparable<Factory> {
    private int foundedId;
    private String address;
    private boolean hasDelivery;
    private String phoneNumber;
    private int numberOfEmployees;

    @Override
    public int compareTo(Factory o) {
        return this.foundedId - o.foundedId;
    }

    public Factory(String address, String phoneNumber) {
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public Factory setDelivery(boolean hasDelivery) {
        this.hasDelivery = hasDelivery;
        return this;
    }

    public Factory setFoundedId(int foundedId) {
        this.foundedId = foundedId;
        return this;
    }

    private Factory setAddress(String address) {
        this.address = address;
        return this;
    }

    private Factory setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^[0-9]{6}")) {
            this.phoneNumber = phoneNumber;
            return this;
        } else throw new InvalidInputException("phone number");
    }

    public Factory setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
        return this;
    }

    public int getFoundedId() {
        return foundedId;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasDelivery() {
        return hasDelivery;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String toString() {
        if (this.getClass() != null)
            return this.getClass().getName().split("\\.")[2];
        return "";
    }
}
