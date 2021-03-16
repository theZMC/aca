package com.aca;

import java.util.Scanner;

public class PetList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] petNames = new String[getNumberOfPets(scanner)];

        petNames = getPetNames(scanner, petNames);

        printPetNames(petNames);

        scanner.close();
    }

    private static int getNumberOfPets(Scanner scanner){
        int numberOfPets = 0;
        System.out.println("How many pets do you have?");
        numberOfPets = scanner.nextInt();
        
        scanner.nextLine();

        return numberOfPets;
    }

    private static String[] getPetNames(Scanner scanner, String[] petNames) {
        for(int i = 0; i < petNames.length; i++){
            System.out.println("\nWhat is the name of pet #" + (i+1) + "?");
            petNames[i] = scanner.nextLine();
        }

        return petNames;
    }

    private static void printPetNames(String[] petNames) {
        System.out.println("\nThese are your pets' names: ");
        for(int i = 0; i < petNames.length; i++){
            System.out.println(petNames[i]);
        }
    }
}
