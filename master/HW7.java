/**
 * Elias Binchamo
 */
public class HW7 {

    public static void main(String[] args) {
        // Find mean
    double meanValue = mean(999, 10000);
    // Find standard deviation
   // double deviationValue = standardDeviation(999, 10000);

    // Display result
    System.out.println("The mean is " + meanValue);
    //System.out.println("The standard deviation is " + deviationValue);

    }
    //compute mean
    public static double mean(int boundary, int n){
        int totalNum = 0;
        int randNum = 0;
        int i = 1;
        //compute n numbers of values
        for(i = 1; i<= n; i++){
           //generate random numbers
            randNum = (int)(Math.random()*boundary);
            totalNum +=randNum;
        }
        //return values
        return totalNum/n;
        
    }
   /* public static double standardDeviation(int boundary, int n){
        int sum = 0;
        double stdeviation = 0;
        for(int i = 0; i<= boundary; i++){
            n = (int)(Math.random()*boundary);            
            sum +=(int)Math.pow(n-mean(boundary,n),2);
        }
        stdeviation = Math.pow(sum/boundary, 0.5);
        return stdeviation;
        
    }*/
}