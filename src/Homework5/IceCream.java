package Homework5;

public class IceCream extends Sweets implements Melting {
    String type;
    String filling;
    int temperature;

    public IceCream(int price, int shelfLifeInMonths, int weightOfUnit) {
        super(price, shelfLifeInMonths, weightOfUnit);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void wrap() {
        System.out.println("Wrapped in cold");
    }

    @Override
    public void melt() {
        System.out.println(temperature >= 4 ? "Already melted":"Still cool and tasty!");
    }
}
