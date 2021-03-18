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

    public int getRandomNumberUsingNextInt(int min, int max){

        Random random = new Random();
        return random.nextInt(max-min) + min;
    }


    public static void main(String[] args) {

        System.out.println("Hello World");

        Die die = new Die();
        System.out.println("Zahl:" + die.number);

    

        

    } 

}