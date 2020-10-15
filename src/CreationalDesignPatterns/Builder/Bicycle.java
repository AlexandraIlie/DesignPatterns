package CreationalDesignPatterns.Builder;

import java.util.LinkedList;

public class Bicycle {

    private LinkedList<String> parts;

    public Bicycle() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\n ****Product completed**** \n");

        for (int i = 0; i < parts.size(); i++)
            System.out.println(parts.get(i));
    }
}
