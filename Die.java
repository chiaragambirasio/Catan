/*edges: 12
amount: 2
numbers: 1-6
*/
import java.util.Random;
import java.util.Arrays;
import java.util.*;

public class Die {

    int edge = 12;
    int number;

    public Die(){

        this.number = getRandomNumberUsingNextInt(1,7);
    }

    public static int getRandomNumberUsingNextInt(int min, int max){

        Random random = new Random();
        return random.nextInt(max - min) + min;
    
    }

    public static int throwNDice(int n){

        int dicesum = 0;

        for(int i = 0; i < n; i++){

            Die current = new Die();
            dicesum += current.number;
        }

        return dicesum;
    }

    public static int[] test(){

        int [] resultarray = new int [20];

        for (int i = 0; i < 20; i++) {

            int result = throwNDice(2);
            resultarray[i] = result;

        }
        return resultarray;
    }

    public static double median(int[] arr){

        Arrays.sort(arr);
        int length = arr.length;
        double median;
        int middleindex = length / 2;

        if (length % 2 == 0) {
            median = ((double)arr[middleindex] + (double)arr[middleindex-1]) / 2;
        } else {
            median = arr[middleindex];
        }
        return median;

    }

    public static double mean(int[] arr){

        double sum = 0;
        double counter = arr.length;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

        }
        
        double mean = sum / counter;
        return mean;
    }

    public static int mode(int[] arr){

        // Sort the array
        Arrays.sort(arr);

        //find the frequency using linear traversal
        int max_count = 0;
        int mode = arr[0];
        int curr_count = 1;

        for (int i = 1; i < arr.length; i++){

            if (arr[i] == arr[i - 1]){
                curr_count++;
            }else{

                if (curr_count > max_count){
                    max_count = curr_count;
                    mode = arr[i-1];
                }else{
                    curr_count = 1;
                }
            }
        }

        if (curr_count > max_count){
            max_count = curr_count;
            mode = arr[arr.length -1];
        }

        return mode;
    }

    public static void main(String[] args) {


        int sum = throwNDice(getRandomNumberUsingNextInt(0,40));


        int[] results = test();

        System.out.println(results);
        for (int i : results) {
            System.out.print(i + ", ");
        }

        double mean = mean(results);
        System.out.println("\nMean:" + mean);

        double median = median(results);
        System.out.println("Median" + median);

        int mode = mode(results);
        System.out.println("Mode:" + mode);
    } 

}