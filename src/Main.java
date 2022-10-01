import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        int flag = 1;
        String playerA ="";
        String playerB="";
        int flagA = 1;
        int flagB = 1;
        char winner;

        Scanner sc = new Scanner(System.in);
        while(flag == 1){

            flagA = 1;
            while(flagA == 1){
                System.out.print("Enter choice (r/p/s) for player A : ");
                playerA = sc.nextLine();

                if(playerA.equalsIgnoreCase("r") || playerA.equalsIgnoreCase("p") || playerA.equalsIgnoreCase("s")){
                    flagA = 0;
                }
                else{
                    System.out.println("Plase enter valid input.");
                }
            }

            flagB = 1;
            while(flagB == 1){
                System.out.print("Enter choice (r/p/s) for player B : ");
                playerB = sc.nextLine();

                if(playerB.equalsIgnoreCase("r") || playerB.equalsIgnoreCase("p") || playerB.equalsIgnoreCase("s")){
                    flagB = 0;
                }
                else{
                    System.out.println("Plase enter valid input.");
                }
            }

            if(playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")){
                System.out.println("Rock breaks Scissor");
                winner = 'A';
            }
            else if(playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("r")){
                System.out.println("Paper covers Rock");
                winner = 'A';
            }
            else if(playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")){
                System.out.println("Scissor cuts Paper");
                winner = 'A';
            }
            else if(playerB.equalsIgnoreCase("r") && playerA.equalsIgnoreCase("s")){
                System.out.println("Rock breaks Scissor");
                winner = 'B';
            }
            else if(playerB.equalsIgnoreCase("p") && playerA.equalsIgnoreCase("r")){
                System.out.println("Paper covers Rock");
                winner = 'B';
            }
            else if(playerB.equalsIgnoreCase("s") && playerA.equalsIgnoreCase("p")){
                System.out.println("Scissor cuts Paper");
                winner = 'B';
            }
            else if(playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("r")){
                System.out.println("Rock vs Rock");
                winner = 'T';
            }
            else if(playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("p")){
                System.out.println("Paper vs Paper");
                winner = 'T';
            }
            else if(playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("s")){
                System.out.println("Scissor vs Scissor");
                winner = 'T';
            }
            else {
                winner = 'T';
            }

            if(winner == 'T'){
                System.out.println("It's a Tie!!");
            }
            else{
                System.out.println("Player "+ winner + " wins");
            }

            System.out.println("Would you like to play again ? (y/n) : ");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("n")){
                flag = 0;
            }
        }
    }
}