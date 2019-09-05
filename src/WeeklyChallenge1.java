import java.util.Scanner;

public class WeeklyChallenge1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String choice1;
        String choice2;
        String choice3;

        System.out.println("Choose your adventure.");
        System.out.println("Do you want to go t the Kitchen or to the Patio?");
        System.out.println("Enter K for Kitchen and P for Patio: ");
        choice1 = scan.next();
        if(choice1.toLowerCase().equals("k")){
            System.out.println("Open the fridge or open the cabinet?");
            System.out.println("Enter F for fridge and C for cabinet: ");
            choice2 = scan.next();
           if(choice2.toLowerCase().equals("f")) {
               System.out.println("Choose 'Drink milk' or 'Eat leftovers'. ");
               System.out.println("Enter 'D' for Drink odd milk or 'E' for Eat leftovers: ");
               choice3 = scan.next();
               if (choice2.toLowerCase().equals("d")) {
                   System.out.println("You are drinking odd milk. You did not survive");
               }
               else if(choice3.toLowerCase().equals("e")) {
                   System.out.println("You ate leftovers. You survived.");
               }
               else{
                   System.out.println("You chose the wrong letter so you lost the game.");
               }
           }
           else if(choice2.toLowerCase().equals("c")){
               System.out.println("Choose 'Eat a can of beans' or 'Take a plate'.");
               System.out.println("Enter 'E' for Eat beans or 'T' for Take a plate:  ");
               choice3 = scan.next();
               if(choice3.toLowerCase().equals("e")){
                   System.out.println("You ate healthy beans. You survived.");
               }
               else if(choice3.toLowerCase().equals("t")){
                   System.out.println("You took a plate. The plate has no food. You didn't survive.");
               }
               else{
                   System.out.println("You selected the wrong letter. You lost the game.");
               }
            else{
                   System.out.println("You selected the wrong letter. You lost the game.");
               }


             }}
            }
    }
}
