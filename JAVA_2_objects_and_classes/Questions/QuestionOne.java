package Questions;



public class QuestionOne {
    public static void main(String[] args) {
        OddEven oe = new OddEven(10);
        oe.display();
    }
}

class OddEven {
    int n;

    public OddEven(int number) {
        n = number;
    }

    void display() {
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}