/**
 * Elias Binchamo
 */
import java.util.Scanner;
public class HW {

    public static void main(String[] args) {
        //create input scanner
        Scanner input = new Scanner(System.in);
        //get user input using input scanner
        System.out.println("Enter a number");
        int x = input.nextInt();
        //print top diamonds
        for(int i=0; i<x*2; i+=2){
            //print spaces
            for(int n = x*2-i; n>0; n-- ){
                System.out.print(" ");
            }
            //print stars
            for(int j=0; j<i-1; j++){
                System.out.print("* ");
            }
            //go to next line
            System.out.println();
        }
        //print bottom diamonds
        for(int i = x*2-2; i>=0; i-=2){
            //print spaces
            for(int n = 2*x-i-2; n>0; n-- ){
                System.out.print(" ");
            }
            //print stars
            for(int j = 0; j <=i; j++){
                System.out.print("* ");
            }
            //go to next line
            System.out.println();
        } 
    input.close();
    }
}
