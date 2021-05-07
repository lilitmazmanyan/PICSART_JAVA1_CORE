package Homework5.Sweets;

import java.time.LocalDate;

public class ChocolateBars extends Candies {
    private String filling;

    public ChocolateBars(int price, LocalDate dateOfIssue,int shelfLifeInMonths, int weightOfUnit) {
        super(price, dateOfIssue, shelfLifeInMonths, weightOfUnit);
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

}
