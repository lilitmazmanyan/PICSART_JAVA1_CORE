package Homework5;

import java.util.ArrayList;

public class PresentBoxes implements Wrapable {

    private ArrayList<Sweets> present;

    public PresentBoxes(ArrayList<Sweets> presents) {
        this.present = presents;
    }

    public ArrayList<Sweets> getPresent() {
        return present;
    }

    @Override
    public void wrap() {
        System.out.println("Wrapped with a red ribbon with a red bow on the top");
    }
}
