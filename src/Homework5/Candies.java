package Homework5;

public abstract class Candies extends Sweets {
    boolean isChocolate;

    public Candies(int price, int shelfLifeInMonths, int weightOfUnit) {
        super(price, shelfLifeInMonths, weightOfUnit);
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
