package Homework5;

import Homework5.CustomExceptions.EmptyPresentException;
import Homework5.Sweets.IceCream;
import Homework5.Sweets.Sweets;

import java.time.LocalDate;
import java.util.Iterator;

public class PresentBoxesService {

    static int getWeightOfPresent(PresentBoxes p) {
        if (p == null || p.getPresent() == null) {
            throw new EmptyPresentException();
        }
        if (p.getPresent().size() == 0) return 0;
        int weight = 0;
        for (Sweets s : p.getPresent()) {
            weight += s.getWeightOfUnit();
        }
        return weight;
    }

    static double calculateThePrice(PresentBoxes p) {
        if (p == null || p.getPresent() == null || p.getPresent().size() == 0) {
            throw new EmptyPresentException();
        }
        float sum = 0;
        Iterator<Sweets> it = p.getPresent().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof IceCream)) {
                sum += (float) it.next().getPrice() / it.next().getWeightOfUnit();
            } else sum += it.next().getPrice(); // sweet is ice cream
        }
        return (Math.ceil((sum + 300) / 100)) * 100;
    }

    static int lifeOnShelf(PresentBoxes p) {
        if (p == null || p.getPresent() == null || p.getPresent().size() == 0) {
            throw new EmptyPresentException();
        }
        int onShelf = p.getPresent().get(0).getShelfLifeInMonths();
        for (Sweets s : p.getPresent()) {
            if (s.getShelfLifeInMonths() < onShelf) {
                onShelf = s.getShelfLifeInMonths();
            }
        }
        return onShelf;
    }

    public static LocalDate calculateExpirationDate(PresentBoxes p) {
        LocalDate max = LocalDate.MAX;
        for (Sweets s : p.getPresent()) {
            if (s.calculateExpirationDate().compareTo(max) < 0) {
                max = s.calculateExpirationDate();
            }
        }
        return max;
    }

}
