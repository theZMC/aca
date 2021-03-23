package com.aca;

public class ImmutableExample {
    public static void main(String[] args) {
        String name = "lazenby";
        changeName(name);
        System.out.println("name: " + name);
    }

    private static void changeName(String name) {
        System.out.println("changeName name: " + name);
        name = "not lazenby";
        System.out.println("changeName name: " + name);
    }
}
