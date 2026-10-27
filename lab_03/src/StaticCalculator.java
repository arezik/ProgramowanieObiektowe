public class StaticCalculator {

    static int add(int a, int b){
        numberOfOperations++;
        return a+b;
    }
    static double add(double a, double b) {
        numberOfOperations++;
        return a + b;
    }
    static int add(int a, int b, int c){
        numberOfOperations++;
        return a+b+c;
    }
    static int subtract(int a, int b){
        numberOfOperations++;
        return a-b;
    }
    static int multiply(int a, int b){
        numberOfOperations++;
        return a*b;
    }

    static int numberOfOperations;

    static int getNumberOfOperations(){
        return numberOfOperations;
    }
}
