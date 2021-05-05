package Homework5;

public abstract class Sweets implements Wrapable {
    private int price;
    private int shelfLifeInMonths;
    private int weightOfUnit;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private String company;
    private double sugarInUnit;

    public Sweets(int price, int shelfLifeInMonths, int weightOfUnit) {
        this.price = price;
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

    @Override
    abstract public void wrap();

}



