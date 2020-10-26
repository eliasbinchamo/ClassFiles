import java.util.Scanner;

/**
 * Lab8
 * Elias Binchamo
 */
public class Lab8 {

    public static void main(String[] args) {
        //create scanner instance to get user input
        Scanner input = new Scanner(System.in);
        //randomly generate two numbers
        int num1 = (int)(Math.random()*101);
        int num2 = (int)(Math.random()*101);

        int result, response;
        //multiply two numbers
        result = num1*num2;
        //get user response value
        System.out.println("What is "+ num1+ "x"+ num2+" ?");
        response = input.nextInt();
        //compare correct result with user response and give a response
        if(result == response){
            printGoodComment();
        }
        else{
            printBadComment();
        }
    }
    //randomly picks a positive response
    public static void printGoodComment(){
        int randNum = (int)(Math.random()*3);
        if(randNum == 0){
            System.out.println("Good Job!");
        }
        else if(randNum == 1){
            System.out.println("Exellent!");
        }
        else if(randNum == 2){
            System.out.println("Terrific");
        }
        else{
            System.out.println("Nice Work");

        }
    }
    //randomly picks a negative response
    public static void printBadComment(){
        int randNum = (int)(Math.random()*2);
        if(randNum == 0){
            System.out.println("sorry, try next time");
        }
        else if(randNum == 1){
            System.out.println("oops, you need more work");
        }
        else{
            System.out.println("hmm, it is not correct");

        }
    }
}