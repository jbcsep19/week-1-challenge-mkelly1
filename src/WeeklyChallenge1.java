import java.sql.SQLOutput;
import java.util.Scanner;

public class WeeklyChallenge1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String choice1;
        String choice2;
        String choice3;
        String choice4;

        System.out.println("Choose your adventure.");
        System.out.println("Do you want to go to the Kitchen, the Patio, the Living Room, the Basement or the Gym?");
        System.out.print("Enter 'Kitchen', 'Patio', 'Living', 'Basement', or 'Gym': ");
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
        } else if (choice1.toLowerCase().equals("patio")) {
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
            } else {
                System.out.println("You entered the wrong word. You lost the game.");
            }
        } else if (choice1.toLowerCase().equals("living")) {
            System.out.println("Chose between 'Turn on TV' or 'Read'.");
            System.out.print("Enter 'TV' or 'Read': ");
            choice2 = scan.nextLine();
            if (choice2.toLowerCase().equals("tv")) {
                System.out.println("Select between 'Housewives of Atlanta' or 'Westworld' ");
                System.out.print("Enter 'Atlanta' or 'West': ");
                choice3 = scan.nextLine();
                if (choice3.toLowerCase().equals("atlanta")) {
                    System.out.println("The show rotted your brain. Sorry, you did not survive.");
                } else if (choice3.toLowerCase().equals("west")) {
                    System.out.println("Your brain did not rot. You survived.");
                } else {
                    System.out.println("You entered an incorrect word. Sorry, you lost the game.");
                }
            } else if (choice2.toLowerCase().equals("read")) {
                System.out.println("Chose between 'Magazine' or 'Book'.");
                System.out.println("Enter 'Magazine' or 'Book'");
                choice3 = scan.nextLine();
                if (choice3.toLowerCase().equals("magazine")) {
                    System.out.println("Chose between 'The Economist' or 'Mad Magazine'");
                    System.out.print("Enter 'Economist' or 'Mad': ");
                    choice4 = scan.nextLine();
                    if (choice4.toLowerCase().equals("economist")) {
                        System.out.println("You read something interesting and you survived.");
                    } else if (choice4.toLowerCase().equals("mad")) {
                        System.out.println("Mad was an iconic magazine that was killed. Sorry, it and you did not survive.");
                    } else {
                        System.out.println("You entered an incorrect word. Sorry, you lost the game.");
                    }
                } else if (choice3.toLowerCase().equals("book")) {
                    System.out.println("Chose between 'Silas Marner' or 'Java Programming'");
                    System.out.print("Enter 'Silas' or 'Java': ");
                    choice4 = scan.nextLine();
                    if (choice4.toLowerCase().equals("silas")) {
                        System.out.println("You were literally bored to death. Sorry, you did not survive.");
                    } else if (choice4.toLowerCase().equals("java")) {
                        System.out.println("You learned and got a great job. You survived.");
                    } else {
                        System.out.println("You entered an incorrect word. Sorry, you lost the game.");
                    }
                } else {
                    System.out.println("You entered an incorrect word. Sorry, you lost the game.");
                }
            } else {
                System.out.println("You entered the wrong word. Sorry, you lost the game.");
            }
        }
            else if(choice1.toLowerCase().equals("basement")){
                System.out.println("Choose between 'Go down to dark basement' or 'Change your mind about going to basement': ");
                System.out.print("Enter 'Dark' or 'Change'");
                choice3 = scan.nextLine();
                if(choice3.toLowerCase().equals("dark")){
                    System.out.println("You've seen the horror movies. Sorry, you did not survive.");
                }
                else if(choice3.toLowerCase().equals("change")){
                    System.out.println("You've seen the horror movies. You survived.");
                }
                else{
                    System.out.println("You entered the wrong word. Sorry, you lost the game.");
                }
            }
            else if(choice1.toLowerCase().equals("gym")){
                System.out.println("Choose between 'Use stationary bike' or 'Use the elliptical trainer': ");
                System.out.print("Enter 'bike' or 'trainer'");
                choice3 = scan.nextLine();
                if(choice3.toLowerCase().equals("bike")){
                    System.out.println("You were healthy. You survived.");
                }
                else if(choice3.toLowerCase().equals("trainer")){
                    System.out.println("You were healthy. You survived.");
                }
                else{
                    System.out.println("You entered the wrong word. Sorry, you lost the game.");
                }
            }
        else{
                System.out.println("You entered the incorrect word. Sorry, you lost the game.");
            }
    }
}


