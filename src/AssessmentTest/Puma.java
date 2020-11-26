package AssessmentTest;

interface HasTail {

    int getTailLength();
}

abstract class Puma implements HasTail {

    //protected int getTailLength(){ return 4;} 
    public int getTailLength() {
        return 4;
    }
    //The code will not compile because of line 3 (10)
}
