package com.aca;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public void execute() {
        List<String> furniture = new ArrayList<String>();

        furniture.add("chair");
        furniture.add("table");
        furniture.add("bed");
        printList(furniture);

        furniture.add("lamp");
        furniture.add(0, "dresser");
        printList(furniture);

        furniture.add(2, "plant");
        printList(furniture);

        furniture.remove(furniture.get(furniture.size() - 1));
        printList(furniture);

        furniture.remove(furniture.get(0));
        printList(furniture);

        furniture.remove(furniture.get(1));
        printList(furniture);
    }

    public void printList(List<String> list) {
        for (String item : list) {
            System.out.print(item + ":");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListDemo demo = new ListDemo();
        demo.execute();
    }
}
