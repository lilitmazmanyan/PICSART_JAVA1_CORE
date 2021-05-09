package Homework5;

import Homework5.Sweets.Candy;
import Homework5.Sweets.ChocolateBar;
import Homework5.Sweets.Cookie;
import Homework5.Sweets.IceCream;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LocalDate randomDateOfIssue = LocalDate.of(2019, 8, 9);
        Cookie cookie1 = new Cookie(280, randomDateOfIssue, 1, 10);
        cookie1.setShape("round");
        Cookie cookie2 = new Cookie(250, randomDateOfIssue, 2, 15);
        cookie2.setShape("square");
        Cookie cookie3 = new Cookie(350, randomDateOfIssue, 3, 20);

        IceCream iceCream1 = new IceCream(50, randomDateOfIssue, 1, 60);
        IceCream iceCream2 = new IceCream(60, randomDateOfIssue, 3, 50);
        iceCream2.setCompany("Shant");
        IceCream iceCream3 = new IceCream(60, randomDateOfIssue, 1, 80);
        iceCream3.setCompany("Grand Candy");

        ChocolateBar candy1 = new ChocolateBar(500, randomDateOfIssue, 9, 30);
        candy1.setChocolate(true);
        ChocolateBar candy2 = new ChocolateBar(600, randomDateOfIssue, 8, 25);
        candy2.setChocolate(false);
        candy2.setFilling("Vanila");
        Candy candy3 = new ChocolateBar(900, randomDateOfIssue, 3, 25);
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

