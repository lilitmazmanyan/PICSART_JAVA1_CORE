package Homework5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cookies cookie1 = new Cookies(300, 1, 10);
        cookie1.setShape("round");
        Cookies cookie2 = new Cookies(250, 2, 15);
        cookie2.setShape("square");
        Cookies cookie3 = new Cookies(350, 3, 20);

        IceCream iceCream1 = new IceCream(50, 1, 60);
        IceCream iceCream2 = new IceCream(60, 3, 50);
        iceCream2.setCompany("Shant");
        IceCream iceCream3 = new IceCream(60, 1, 80);
        iceCream3.setCompany("Grand Candy");

        ChocolateBars candy1 = new ChocolateBars(500, 9, 30);
        candy1.setChocolate(true);
        ChocolateBars candy2 = new ChocolateBars(600, 8, 25);
        candy2.setChocolate(false);
        candy2.setFilling("Vanila");
        Candies candy3 = new ChocolateBars(900, 3, 25);
        //Cannot add a filling in third candy because it is a type of candy

        PresentBoxes present1 = new PresentBoxes(new ArrayList<>() {{
            add(cookie1);
            add(iceCream1);
            add(candy1);
        }});

        PresentBoxes present2 = new PresentBoxes(new ArrayList<>() {{
            add(cookie2);
            add(candy2);
            add(iceCream2);
        }});
        PresentBoxes present3 = new PresentBoxes(new ArrayList<>() {{
            add(cookie3);
            add(iceCream3);
            add(candy3);
        }});

        System.out.printf("Present 1\n\tPrice: %f\n\tWeigth: %d\n",
                SweetsService.calculateThePrice(present1),
                SweetsService.getWeightOfPresent(present1));
        System.out.printf("Life on the shelf of Present1 is %s months",
                SweetsService.lifeOnShelf(present1));

        System.out.println("\n---------------------------------------------");

        System.out.printf("Present 2\n\tPrice: %f\n\tWeigth: %d\n",
                SweetsService.calculateThePrice(present2),
                SweetsService.getWeightOfPresent(present2));
        System.out.printf("Life on the shelf of Present2 is %s months",
                SweetsService.lifeOnShelf(present2));

        System.out.println("\n---------------------------------------------");

        System.out.printf("Present 3\n\tPrice: %f\n\tWeigth: %d\n",
                SweetsService.calculateThePrice(present3),
                SweetsService.getWeightOfPresent(present3));
        System.out.printf("Life on the shelf of Present3 is %s months",
                SweetsService.lifeOnShelf(present3));

    }

}
