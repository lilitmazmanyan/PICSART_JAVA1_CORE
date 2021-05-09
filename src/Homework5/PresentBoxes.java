package Homework5;

import Homework5.Sweets.Sweet;

import java.util.ArrayList;
import java.util.List;

public class PresentBoxes implements Wrapable {

    private ArrayList<Sweet> present;

    public PresentBoxes(List<Sweet> presents) {
        this.present = new ArrayList<>(presents);
    }

    public ArrayList<Sweet> getPresent() {
        return present;
    }

    @Override
    public void wrap() {
        System.out.println("Wrapped with a red ribbon with a red bow on the top");
    }
}
