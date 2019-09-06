import java.util.Scanner;

public class WeeklyChallenge1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String choice1;
        String choice2;
        String choice3;
        String choice4;

        System.out.println("Choose your adventure.");
        System.out.println("Do you want to go t the Kitchen or to the Patio?");
        System.out.print("Enter 'Kitchen' or 'Patio': ");
        choice1 = scan.nextLine();
        if (choice1.toLowerCase().equals("kitchen")) {
            System.out.println("Open the fridge or open the cabinet?");
            System.out.print("Enter 'Fridge' or 'Cabinet': ");
            choice2 = scan.nextLine();
            if (choice2.toLowerCase().equals("fridge")) {
                System.out.println("Choose 'Drink sour milk' or 'Eat leftovers'. ");
                System.out.print("Enter 'Drink' or 'Eat': ");
                choice3 = scan.nextLine();
                if (choice2.toLowerCase().equals("drink")) {
                    System.out.println("You drank spoiled milk. You did not survive");
                } else if (choice3.toLowerCase().equals("eat")) {
                    System.out.println("You ate leftovers. You survived.");
                } else {
                    System.out.println("You chose the wrong word so you lost the game.");
                }
            } else if (choice2.toLowerCase().equals("cabinet")) {
                System.out.println("Choose 'Eat a can of beans' or 'Take an empty plate'.");
                System.out.print("Enter 'Beans' or 'Plate': ");
                choice3 = scan.nextLine();
                if (choice3.toLowerCase().equals("beans")) {
                    System.out.println("You ate healthy beans. You survived.");
                } else if (choice3.toLowerCase().equals("plate")) {
                    System.out.println("You took a plate. The plate has no food. Sorry, you didn't survive.");
                } else {
                    System.out.println("You selected the wrong word. You lost the game.");
                }
            } else {
                System.out.println("You entered a wrong word. You lost the game.");
            }
        }
        else if(choice1.toLowerCase().equals("patio")) {
            System.out.println("Chose between 'Go to the pool' or 'Open shed'.");
            System.out.print("Enter 'Pool' or 'Shed': ");
            choice2 = scan.nextLine();
            if (choice2.toLowerCase().equals("pool")) {
                System.out.println("Select between 'Fish in the pool' and 'Swim in the pool' ");
                System.out.print("Enter 'Fish' or 'Swim': ");
                choice3 = scan.nextLine();
                if (choice3.toLowerCase().equals("fish")) {
                    System.out.println("There are no fish in the pool. Sorry, you did not survive.");
                } else if (choice3.toLowerCase().equals("swim")) {
                    System.out.println("Swimming is healthy. You survived.");
                } else {
                    System.out.println("You entered an incorrect word. Sorry, you lost the game.");
                }
            } else if (choice2.toLowerCase().equals("shed")) {
                System.out.println("Chose between 'Remove basket from shed' or 'Get weed killer from shed'.");
                System.out.println("Enter 'Basket' or 'Killer'");
                choice3 = scan.nextLine();
                if (choice3.toLowerCase().equals("basket")) {
                    System.out.println("Chose between 'Pick strawberries' or 'Pick poison ivy'");
                    System.out.println("Enter 'Strawberries' or 'Ivy': ");
                    choice4 = scan.nextLine();
                    System.out.println("You must now eat your choice.");
                    if (choice4.toLowerCase().equals("strawberries")) {
                        System.out.println("You ate strawberries and you survived.");
                    } else if (choice4.toLowerCase().equals("ivy")) {
                        System.out.println("You ate poison ivy. Sorry, you did not survive.");
                    } else {
                        System.out.println("You entered an incorrect word. Sorry, you lost the game.");
                    }
                } else if (choice3.toLowerCase().equals("killer")) {
                    System.out.println("Roundup weed killer is very toxic. Sorry, you did not survive.");
                } else {
                    System.out.println("You entered an incorrect word. Sorry, you lost the game.");
                }
            }
            else{
                System.out.println("You entered the wrong word. You lost the game.");
            }
        }
        else{
            System.out.println("You entered the incorrect word. Sorry, you lost the game.");
        }

    }
}


