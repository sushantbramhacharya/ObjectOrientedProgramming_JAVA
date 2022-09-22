package JAVA_3_inheritance.LAB_3;

public class QuestionThree {
    public static void main(String[] args) {
        Minister mn=new Minister();
        mn.display();
    }
}
class Enterpreneur{
    void display()
    {
        System.out.println("Hello Enterpreneur");
    }

}
class Leader {
    void display()
    {
        System.out.println("Hello Leader");
    }
}
class Minister extends Enterpreneur,Leader{

}
