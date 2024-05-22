package belajar.test.junit.test;

public class Calculator {
    public Integer add(Integer first, Integer second) {
        return first + second;
    }

    public Integer remove(Integer first, Integer second) {
        return first - second;
    }

    public Integer divide(Integer first, Integer second) {
        if(second == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        } else {
            return first / second;
        }
    }
}
