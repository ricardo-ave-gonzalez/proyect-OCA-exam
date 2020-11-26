package AssessmentTest;

/**
 *  a - Color: 
 *  b - Color:null
 *  c - Color:white
 * 
 *      //output null
 * @author richie
 */
public class Egret {
    private String color;
    public Egret(String color){
        color = color;
    }
    public Egret(){
        this("white");// mal empleado el constructor por eso dá null
    }
    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color: " + e.color);
    }
}
