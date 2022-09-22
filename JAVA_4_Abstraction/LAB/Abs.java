package JAVA_4_Abstraction.LAB;

abstract class Calc {
    int a, b;
    abstract int sum();
}

class Sum extends Calc {
    Sum(int a, int b) {
        super.a = a;
        super.b = b;
    }

    int sum() {
        return a + b;
    }
}

public class Abs {
    public static void main(String[] args) {
        Calc sm = new Sum(1, 3);
        System.out.println("Ans  " +sm.sum());
    }
}
