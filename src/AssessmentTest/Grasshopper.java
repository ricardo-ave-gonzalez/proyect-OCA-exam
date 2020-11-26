package AssessmentTest;
import java.util.*;

/**
 *
 * @author richie
 */
public class Grasshopper {
    private String name;
    public Grasshopper(String n){
        name = n;   
    }
    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null;
        one = null;
        System.out.println(one);
        System.out.println(two);
    }
}
