package Question_2;

public class QuestionOne {
    public static void main(String[] args) {
        Adder add=new Adder(10,20,40);
        System.out.println("The answer is :"+add.answer);
    }
}

class Adder {
    int answer;
    Adder() {
        System.out.println("Not enough Arguements please provide 3 numbers as arguments");
    }
    Adder(int a,int b,int c)
    {
        this.answer=a+b+c;
    }
}
