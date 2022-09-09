package JAVA_3_inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Cat cat =new Cat(1, "Female", "black", true, "Local");
        cat.meow();
        System.out.println(cat.gender+" Cat with color "+cat.color+" of "+cat.breed+" bread is ");
        cat.walk();
    }
}

class Animal {
    String gender;
    String color;
    boolean canWalk;
    String breed;

    void walk() {
        System.out.println("Walking.............");
    }
}

class Cat extends Animal {
    int meowSound;

    Cat(int meowSound, String gender, String color, boolean canWalk, String breed) {
        this.meowSound = meowSound;
        super.breed = breed;
        super.canWalk = canWalk;
        super.color = color;
        super.gender = gender;
    }

    void meow() {
        switch (meowSound) {
            case 1:
                System.out.println("Meowwwwww.....");
                break;
            case 2:
                System.out.println("Mewewewwew.....");
                break;
            default:
                System.out.println("Cant Meow");
        }
    }
}