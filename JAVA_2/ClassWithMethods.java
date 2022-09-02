import java.lang.reflect.Method;

public class ClassWithMethods {
    public static void main(String[] args) {
        MedthodsClass mc = new MedthodsClass();
        mc.displayName();
    }
}

class MedthodsClass {
    int a = 10;
    String name = "Sushant";

    void displayName() {
        System.out.println("My id is " + this.a + " and Names is " + this.name);
    }
}
