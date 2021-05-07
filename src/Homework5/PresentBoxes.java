package Homework5;

import Homework5.Sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class PresentBoxes implements Wrapable {

    private ArrayList<Sweets> present;

    public PresentBoxes(List<Sweets> presents) {
        this.present = new ArrayList<>(presents);
    }

    public ArrayList<Sweets> getPresent() {
        return present;
    }

    @Override
    public void wrap() {
        System.out.println("Wrapped with a red ribbon with a red bow on the top");
    }
}
