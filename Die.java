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
        return random.nextInt(max-min) + min;
    }

    public static int throwTwoDice(){

        Die die1 = new Die();
        Die die2 = new Die();
        int sum = die1.number + die2.number;
        return sum;
    }

    public static int throwNDice(int n){

        System.out.println(n);
        int dicesum = 0;

        for(int i = 0; i <= n; i++){

            Die current = new Die();
            dicesum += current.number;
        }

        return dicesum;
    }
    public static void main(String[] args) {

        System.out.println("How many dice?");

        int sum = throwNDice(getRandomNumberUsingNextInt(0,1000));

        System.out.println("Your dicesum:" + sum);
    } 

}