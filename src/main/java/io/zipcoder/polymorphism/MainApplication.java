package io.zipcoder.polymorphism;


import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {


        Scanner intScanner = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many pets do you have?");

        Integer numberOfPets = intScanner.nextInt();  // Read user input
        System.out.println("Number of your pets is: " + numberOfPets);  // Output user input

        ArrayList<Pets> pets= new ArrayList();

        for (int i = 0; i <numberOfPets ; i++) {
            System.out.println("What type of pet is it?");
            String typeOfPet = myObj.nextLine();


            System.out.println("What is your pet name?");
            String petName = myObj.nextLine();

            switch(typeOfPet){
                case "cat":
                    Pets cat = new Cat(petName);
                    pets.add(cat);
                    break;
                case "dog":
                    Pets dog = new Dog(petName);
                    pets.add(dog);
                    break;
                case "pig":
                    Pets pig = new Pig(petName);
                    pets.add(pig);
                    break;


        }


        }
        System.out.println("here is your pets and what they say when they speak");

        for(Pets pet :pets){
            System.out.println( pet.toString());
        }





    }


}













