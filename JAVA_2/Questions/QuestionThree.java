package Questions;

public class QuestionThree {
    public static void main(String[] args) {
        new Check(15);
        new Check(35);
    }
}
class Check{
    public Check(int number)
    {
        if(number%5==0&&number%7!=0)
        {
            System.out.println("The number "+number+" is exactly divisible by 5 but not 7");
        }
        else
        {
            System.out.println("It doesnt match condition");
        }
    }
}
