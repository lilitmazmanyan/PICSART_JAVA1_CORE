package Homework5.Sweets;

import java.time.LocalDate;

public class Cookie extends Sweet {
    private String shape;

    public Cookie(int price, LocalDate dateOfIssue, int shelfLifeInMonths, int weightOfUnit) {
        super(price, dateOfIssue, shelfLifeInMonths, weightOfUnit);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public void wrap() {
        System.out.println("Cookies are not wrapped;");
    }
}
