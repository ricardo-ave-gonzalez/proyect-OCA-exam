package AssessmentTest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author richie
 */
public class MathFunctions {
    //6.
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;

    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        MathFunctions.addToInt(a, b);

        System.out.println(a);
        //System.out.println(b);
    }
    //output 15
    
    //7. What is the result of the following code?
    int[] array = {6,9,8};
    List<Integer> list = new ArrayList<>();
    //list.add(array[6]);
    //list.add(array[2]);
    //list.set(1, array[1]);
    //list.remove(0);
    //System.out.println(list);
    //The code does not compile.

    
}
