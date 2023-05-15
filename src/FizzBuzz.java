import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {

        // Print integers one-to-100, but print “Fizz” 
        // if an integer is divisible by three, “Buzz” 
        // if an integer is divisible by five, and “FizzBuzz” 
        // if an integer is divisible by both three and five.

        // create arraylist for fun, just so that i can .get and print 
        List<String> fb = new ArrayList<>();
        List<String> f = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<Integer> ii = new ArrayList<>();

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                fb.add(Integer.toString(i));
                System.out.println("FizzBuzz");
            } 
            if (i % 3 == 0){
                f.add(Integer.toString(i));
                System.out.println("Fizz");
            }
            if (i % 5 == 0){
                b.add(Integer.toString(i));
                System.out.println("Buzz");
            } 
            if (i % 3 != 0 && i % 5 != 0){
                ii.add(i);
                System.out.println(i);
            }
        }

        // print statement out for fun
        System.out.println("There are " + fb.size() + " numbers divisible by 3 & 5");
        System.out.println("There are " + f.size() + " numbers divisible by 3");
        System.out.println("There are " + b.size() + " numbers divisible by 5");
        System.out.println("There are " + ii.size() + " numbers not divisible by 3 or 5");

    }
}
