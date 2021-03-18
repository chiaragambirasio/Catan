/*edges: 12
amount: 2
numbers: 1-6
*/
import java.util.Random;

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

        int [] resultarray = new int [12];

        for (int i = 0; i < 12; i++) {

            int result = throwNDice(2);
            resultarray[i] = result;

        }
        return resultarray;
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


        int sum = throwNDice(getRandomNumberUsingNextInt(0,120));


        int[] results = test();

        for (int i : results) {
            System.out.print(i + ", ");
        }

        double mean = mean(results);
        System.out.println("\nAverage:" + mean);

    } 

}