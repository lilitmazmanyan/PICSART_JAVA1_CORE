package Homework5;

import Homework5.Sweets.Candies;
import Homework5.Sweets.ChocolateBars;
import Homework5.Sweets.Cookies;
import Homework5.Sweets.IceCream;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LocalDate randomDateOfIssue = LocalDate.of(2019, 8, 9);
        Cookies cookie1 = new Cookies(280, randomDateOfIssue, 1, 10);
        cookie1.setShape("round");
        Cookies cookie2 = new Cookies(250, randomDateOfIssue, 2, 15);
        cookie2.setShape("square");
        Cookies cookie3 = new Cookies(350, randomDateOfIssue, 3, 20);

        IceCream iceCream1 = new IceCream(50, randomDateOfIssue, 1, 60);
        IceCream iceCream2 = new IceCream(60, randomDateOfIssue, 3, 50);
        iceCream2.setCompany("Shant");
        IceCream iceCream3 = new IceCream(60, randomDateOfIssue, 1, 80);
        iceCream3.setCompany("Grand Candy");

        ChocolateBars candy1 = new ChocolateBars(500, randomDateOfIssue, 9, 30);
        candy1.setChocolate(true);
        ChocolateBars candy2 = new ChocolateBars(600, randomDateOfIssue, 8, 25);
        candy2.setChocolate(false);
        candy2.setFilling("Vanila");
        Candies candy3 = new ChocolateBars(900, randomDateOfIssue, 3, 25);
        //Cannot add a filling in third candy because it is a type of candy and not chocolate bar

        PresentBoxes present1 = new PresentBoxes(Arrays.asList(cookie1, candy2, iceCream1));
        PresentBoxes present2 = new PresentBoxes(Arrays.asList(cookie2, candy2, iceCream2));
        PresentBoxes present3 = new PresentBoxes(Arrays.asList(cookie3, candy3, iceCream3));


        System.out.printf("Present 1\n\tPrice: %f\n\tWeigth: %d\n",
                PresentBoxesService.calculateThePrice(present1),
                PresentBoxesService.getWeightOfPresent(present1));
        System.out.printf("Life on the shelf of Present1 is %s months",
                PresentBoxesService.lifeOnShelf(present1));

        System.out.println("\n---------------------------------------------");

        System.out.printf("Present 2\n\tPrice: %f\n\tWeigth: %d\n",
                PresentBoxesService.calculateThePrice(present2),
                PresentBoxesService.getWeightOfPresent(present2));
        System.out.printf("Life on the shelf of Present2 is %s months",
                PresentBoxesService.lifeOnShelf(present2));

        System.out.println("\n---------------------------------------------");

        System.out.printf("Present 3\n\tPrice: %f\n\tWeigth: %d\n",
                PresentBoxesService.calculateThePrice(present3),
                PresentBoxesService.getWeightOfPresent(present3));
        System.out.printf("Life on the shelf of Present3 is %s months",
                PresentBoxesService.lifeOnShelf(present3));
    }

}

