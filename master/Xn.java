import java.util.Scanner;

/**
 * Xn
 */
public class Xn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ELas");
    int count = 20;
    for(int i = 0; i<20; i++){
        int x = (int)(Math.random()*20);
        System.out.println(x +" + " +i + " = ");
        int result = x+i;

        int userRespone = input.nextInt();
        if(result == userRespone){
            System.out.println("Correct!");
        }
        else{
            count--;
            System.out.println("Incorrect!");
        }
    }
    System.out.println(count+" out of 20 is correct!" );
}
}