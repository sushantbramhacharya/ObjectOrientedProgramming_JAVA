package Question_2;

public class QuestionThree {
    public static void main(String[] args) {
        primeChecker pc = new primeChecker(7);
        pc.result();
        primeChecker pc1 = new primeChecker(9);
        pc1.result();
    }
}

class primeChecker {
    int num;

    primeChecker(int num) {
        this.num = num;
    }

    void result() {
        boolean flag = false;
        for (int i = 2; i <= this.num / 2; i++) {
            if (this.num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println(this.num + " is a prime number.");
        else
            System.out.println(this.num + " is not a prime number.");
    }
}
