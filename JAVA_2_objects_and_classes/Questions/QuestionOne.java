package Questions;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        System.out.println("Enter the numbers ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        OddEven oe = new OddEven(num);
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