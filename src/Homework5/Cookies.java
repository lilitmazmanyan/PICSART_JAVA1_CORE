package Homework5;

public class Cookies extends Sweets {
    String shape;

    public Cookies(int price, int shelfLifeInMonths, int weightOfUnit) {
        super(price, shelfLifeInMonths, weightOfUnit);
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
