package us.mattgreen;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static ArrayList<Talkable> zoo2 = new ArrayList<>();
    public static void addingAnimals(){
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Select the number of the animal you wish to add. \n" +
                "1. Dog\n" +
                "2. Cat");
        userInput= sc.nextInt();
        if(userInput == 0){
            System.out.println("select either 1 or 2.");
        }else if(userInput == 1){
            System.out.println("What is the Dog's name");
            String name = sc.nextLine();
            System.out.println("is the dog Freindly true or false.");
            boolean freindly = sc.nextBoolean();
            zoo2.add(new Dog(freindly,name));

        }else if(userInput == 2){
            System.out.println("What is the Cat's name");
            String name = sc.nextLine();
            System.out.println("What's the number of mice this mouse has killed?");
            int Killcount = sc.nextInt();
            zoo2.add(new Cat(Killcount,name));

        }

    }
}
