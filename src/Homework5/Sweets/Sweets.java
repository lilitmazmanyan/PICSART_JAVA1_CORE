package Homework5.Sweets;

import Homework5.CustomExceptions.InvalidInputException;
import Homework5.Wrapable;

import java.time.DateTimeException;
import java.time.LocalDate;

public abstract class Sweets implements Wrapable {
    private int price;
    private final LocalDate dateOfIssue;
    private int shelfLifeInMonths;
    private int weightOfUnit;
    private String company;
    private double sugarInUnit;

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public Sweets(int price, LocalDate dateOfIssue, int shelfLifeInMonths, int weightOfUnit) {
        if (price <= 0) {
            throw new InvalidInputException("price");
        }
        if (shelfLifeInMonths <= 0) {
            throw new InvalidInputException("shelf life");
        }
        if (weightOfUnit <= 0) {
            throw new InvalidInputException("weight");
        }
        if (dateOfIssue == null || dateOfIssue.compareTo(LocalDate.now()) >= 0) {
            throw new DateTimeException("Invalid date of issue");
        }

        this.price = price;
        this.dateOfIssue = dateOfIssue;
        this.shelfLifeInMonths = shelfLifeInMonths;
        this.weightOfUnit = weightOfUnit;
    }

    public int getPrice() {
        return price;
    }

    public int getShelfLifeInMonths() {
        return shelfLifeInMonths;
    }

    public int getWeightOfUnit() {
        return weightOfUnit;
    }

    public double getSugarInUnit() {
        return sugarInUnit;
    }

    public void setSugarInUnit(double sugarInUnit) {
        this.sugarInUnit = sugarInUnit;
    }

    public LocalDate calculateExpirationDate() {
        return this.getDateOfIssue().plusMonths(this.getShelfLifeInMonths());
    }

    @Override
    abstract public void wrap();

}



