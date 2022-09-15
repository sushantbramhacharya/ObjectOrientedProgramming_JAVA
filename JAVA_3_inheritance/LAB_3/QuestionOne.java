package JAVA_3_inheritance.LAB_3;

public class QuestionOne {
    public static void main(String[] args) {
        Cricketer ct = new Cricketer("Ram", 20, 30);
        ct.displayCricketerInfo();
        Bowler bw = new Bowler(10, "Hari", 25, 50);
        bw.displayBowlerInfo();
        Batsman bs = new Batsman(110, 3, "Laxman", 30, 200);
        bs.displayBatmanInfo();
    }
}

class Cricketer {
    String name;
    int age, no_of_matches_played;

    Cricketer(String name, int age, int no_of_matches_played) {
        this.name = name;
        this.age = age;
        this.no_of_matches_played = no_of_matches_played;
    }

    void displayCricketerInfo() {
        System.out.println("\n-----Crickter Info-----");
        System.out.println("Name:" + name + "\nAge:" + age + "\nNumber of matches played:" + no_of_matches_played);
    }
}

class Bowler extends Cricketer {
    int no_of_wickets;

    Bowler(int no_of_wickets, String name, int age, int no_of_matches_played) {
        super(name, age, no_of_matches_played);
        this.no_of_wickets = no_of_wickets;
    }

    void displayBowlerInfo() {
        super.displayCricketerInfo();
        System.out.println("-----Bowler Info-----");
        System.out.println("No of Wickets:" + no_of_wickets);
    }
}

class Batsman extends Cricketer {
    int no_of_runs;
    int centuries;

    Batsman(int no_of_runs, int centuries, String name, int age, int no_of_matches_played) {
        super(name, age, no_of_matches_played);
        this.no_of_runs = no_of_runs;
        this.centuries = centuries;
    }

    void displayBatmanInfo() {
        super.displayCricketerInfo();
        System.out.println("-----Batman Info-----");
        System.out.println("No of runs:" + no_of_matches_played + "\nNo of centuries:" + centuries);
    }
}
