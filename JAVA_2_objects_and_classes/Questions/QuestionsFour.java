package Questions;

public class QuestionsFour {
    public static void main(String[] args) {
        new CheckGreatest(50, 40, 30);
    }
}

class CheckGreatest {
    public CheckGreatest(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                System.out.println(x + " is the Greatest");
            } else {
                System.out.println(y + " is the Greatest");
            }
        } else if (y > z) {
            System.out.println(y + " is the Greatest");
        } else {
            System.out.println(z + " is the Greatest");
        }
    }
}