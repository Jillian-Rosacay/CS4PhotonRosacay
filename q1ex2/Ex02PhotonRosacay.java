package q1ex2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author PHOTON
 */
public class Ex02PhotonRosacay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Input name: ");
        String fullname = sc.nextLine();
        System.out.println("Hi " + fullname + "!");*/
        
        char playAgain;
        int random = (int) Math.floor(Math.random()*10) + 1;
        int guess;
        
        do{
            System.out.println("Welcome to Higher or Lower! What will you do?\n-Start game\n-Change settings\n-End application");
            String action = sc.nextLine();
            outerLoop:
            if(action.equalsIgnoreCase("start game")){
                loopA:
                for (int i=3; i>0; i--){
                    System.out.print("You have " + i + " guess(es) left. What is your guess? ");
                    guess = sc.nextInt();
                    if (i!=1){
                        if(guess == random){
                            System.out.println("You got it!");
                            break;
                        } else if(guess < random){
                            System.out.print("Guess higher! ");
                        } else{
                            System.out.print("Guess lower! ");
                        }
                    } else if(guess == random){
                            System.out.println("You got it!");
                    } else{
                        System.out.println("You lost...");
                    }
                }
                System.out.print("Play again? ");
                playAgain = sc.next().charAt(0);
                break outerLoop;
            } else if(action.equalsIgnoreCase("change settings")){
              System.out.println("What is the lower limit of the random number?");
            } else if(action.equalsIgnoreCase("end application")){
               System.out.println("Thank you for playing!");
            } else{
                System.out.println("Unknown command! Please choose from the three choices.");
                break outerLoop;
            }
        }while(playAgain == 'y' || playAgain == 'Y');
        /*do{
            
        } while (action.equalsIgnoreCase("start game"));*/
    }
}
