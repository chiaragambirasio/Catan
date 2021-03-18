/*edges: 12
amount: 2
numbers: 1-6
*/
import java.util.Random;
import java.util.Arrays;

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

        int [] resultarray = new int [4];

        for (int i = 0; i < 4; i++) {

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

    public static void main(String[] args) {


        int sum = throwNDice(getRandomNumberUsingNextInt(0,40));


        int[] results = test();

        for (int i : results) {
            System.out.print(i + ", ");
        }

        double mean = mean(results);
        System.out.println("\nMean:" + mean);

        double median = median(results);
        System.out.println("Median" + median);

    } 

}