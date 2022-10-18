package Service;

public interface CalculatorService {

    static int add(int a, int b) {
        return 0;
    }

    static int subtract(int a, int b) {
        return 0;
    }

    public static int multiply(int a, int b) {
        return 0;
    }

    public static int divide(int a, int b) {
        return 0;
    }


    String printSolutionPlus(Double a, Double b);

    String printSolutionMinus(Double a, Double b);

    String printSolutionMultiply(Double a, Double b);

    String printSolutionDivide(Double a, Double b) throws DivisionByZeroException;



}
