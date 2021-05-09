package Homework5.Sweets;

import Homework5.CustomExceptions.InvalidInputException;
import Homework5.Wrapable;

import java.time.DateTimeException;
import java.time.LocalDate;

public abstract class Sweet implements Wrapable {
    private int price;
    private String company;
    private int weightOfUnit;
    private double sugarInUnit;
    private int shelfLifeInMonths;
    private final LocalDate dateOfIssue;

    public Sweet(int price, LocalDate dateOfIssue, int shelfLifeInMonths, int weightOfUnit) {
        if (dateOfIssue == null || dateOfIssue.compareTo(LocalDate.now()) >= 0) {
            throw new DateTimeException("Invalid date of issue");
        }
        setPrice(price);
        this.dateOfIssue = dateOfIssue;
        setShelfLifeInMonths(shelfLifeInMonths);
        setWeightOfUnit(weightOfUnit);
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public int getWeightOfUnit() {
        return weightOfUnit;
    }

    public double getSugarInUnit() {
        return sugarInUnit;
    }

    public int getShelfLifeInMonths() {
        return shelfLifeInMonths;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    private void setPrice(int price) {
        if (price <= 0) {
            throw new InvalidInputException("price");
        }
        this.price = price;
    }

    private void setWeightOfUnit(int weightOfUnit) {
        if (weightOfUnit <= 0) {
            throw new InvalidInputException("weight");
        }
        this.weightOfUnit = weightOfUnit;
    }

    private void setShelfLifeInMonths(int shelfLifeInMonths) {
        if (shelfLifeInMonths <= 0) {
            throw new InvalidInputException("shelf life");
        }
        this.shelfLifeInMonths = shelfLifeInMonths;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSugarInUnit(double sugarInUnit) {
        this.sugarInUnit = sugarInUnit;
    }

    public LocalDate calculateExpirationDate() {
        return this.getDateOfIssue().plusMonths(this.getShelfLifeInMonths());
    }

}



