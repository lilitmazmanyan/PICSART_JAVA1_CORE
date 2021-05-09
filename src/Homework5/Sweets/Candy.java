package Homework5.Sweets;

import java.time.LocalDate;

public abstract class Candy extends Sweet {
    private boolean isChocolate;

    public Candy(int price, LocalDate dateOfIssue, int shelfLifeInMonths, int weightOfUnit) {
        super(price, dateOfIssue, shelfLifeInMonths, weightOfUnit);
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    public void setChocolate(boolean chocolate) {
        isChocolate = chocolate;
    }

    @Override
    public void wrap() {
        System.out.println("Wrapped carefully");
    }
}
