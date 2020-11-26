package AssessmentTest;

/**
 * 
 * 
 *          output:     DeerReindeer,false
 * 
 * 
 * @author richie
 */
// 8.
public class Deer {
    
    public Deer() { System.out.print("Deer"); }
    public Deer(int age) { System.out.print("DeerAge"); }

    private boolean hasHorns() { return false; }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }

    //9.
    /** 
     * ¿Cuáles de las siguientes afirmaciones son verdaderas? (Elija todo lo que corresponda)
     * Las excepciones marcadas están destinadas a ser lanzadas por la JVM (y no por el programador).
     * Las excepciones marcadas deben detectarse o declararse.
     * Los errores están pensados para ser lanzados por la JVM (y no por el programador).
     * Los errores deben detectarse o declararse.
     * Las excepciones de tiempo de ejecución están destinadas a ser lanzadas por la JVM (y no por el programador).
     * Las excepciones en tiempo de ejecución deben detectarse o declararse.
     */
}
