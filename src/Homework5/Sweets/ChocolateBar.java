package Homework5.Sweets;

import java.time.LocalDate;

public class ChocolateBar extends Candy {
    private String filling;

    public ChocolateBar(int price, LocalDate dateOfIssue, int shelfLifeInMonths, int weightOfUnit) {
        super(price, dateOfIssue, shelfLifeInMonths, weightOfUnit);
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

}
