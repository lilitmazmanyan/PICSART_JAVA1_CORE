package Homework5;

public class ChocolateBars extends Candies{
    String filling;

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public ChocolateBars(int price, int shelfLifeInMonths, int weightOfUnit) {
        super(price, shelfLifeInMonths, weightOfUnit);
    }
}
