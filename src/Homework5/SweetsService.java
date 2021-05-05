package Homework5;

public class SweetsService {

    static int getWeightOfPresent(PresentBoxes p) {
//    static int getWeightOfPresent(PresentBoxes p) throws EmptyPresentException {
        if (p.getPresent() == null || p.getPresent().size() == 0) {
//            throw new EmptyPresentException();
            System.out.println("Present should not be empty");
        }
        int weight = 0;
        for (Sweets s : p.getPresent()) {
            weight += s.getWeightOfUnit();
        }
        return weight;
    }

    static double calculateThePrice(PresentBoxes p) {
        if (p == null || p.getPresent().size() == 0) {
            return 0;
        }
        float sum = 0;
        for (Sweets s : p.getPresent()) {
            if (!(s instanceof IceCream)) {
                try {
                    sum += (float) s.getPrice() / s.getWeightOfUnit();
                } catch (ArithmeticException e) {
                    System.out.println("An error occurred while calculating the price. \nPlease check the data and try again");
                }
            } else sum += s.getPrice();
        }
        return (Math.ceil((sum + 300) / 100)) * 100;

    }

    static int lifeOnShelf(PresentBoxes p) {
        int onShelf = 0;
        try {
            onShelf = p.getPresent().get(0).getShelfLifeInMonths();
            for (Sweets s : p.getPresent()) {
                if (s.getShelfLifeInMonths() < onShelf) {
                    onShelf = s.getShelfLifeInMonths();
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Present box cannot be empty");
        }
        return onShelf;
    }


}
