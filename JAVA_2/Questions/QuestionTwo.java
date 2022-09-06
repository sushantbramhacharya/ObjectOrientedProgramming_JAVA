package Questions;

public class QuestionTwo {
    public static void main(String[] args) {
        Adder ad=new Adder(5);
        ad.display();
    }
}
class Adder{
    int sum;
    public Adder(int n)
    {
        sum=0;
        int i=1;
        do{
            sum=sum+i;
            i++;
        }
        while(i<=n);
    }
    void display()
    {
        System.out.println(sum+" is the Sum");
    }
}
