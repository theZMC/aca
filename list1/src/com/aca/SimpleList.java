package com.aca;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {
    public void demo() {
        List<String> colors = new ArrayList<String>();
        colors.add("black");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
