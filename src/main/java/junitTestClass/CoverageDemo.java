package junitTestClass;


public class CoverageDemo {
    public boolean checkNumber(int a, int b, int c) {
        boolean result = false;
        if (a - b > 2 || b + c > 10 || c < -3) {
            result = true;
        }
        return result;
    }
}

