package JAVA_3_inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        CatEar catEar = new CatEar(1, "Female", "black", true, 1);
        catEar.meow();
        System.out.println(catEar.gender + " Cat with color " + catEar.color + " and " + catEar.catEar() + "  of "
                + catEar.breed + " bread is ");
        catEar.walk();
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

// 1st Level Inheritance
class Cat extends Animal {
    int meowSound;

    Cat(int meowSound, String gender, String color, boolean canWalk, int breed) {
        this.meowSound = meowSound;
        switch (breed) {
            case 1:
                super.breed = "Scottish Fold";
                break;
            case 2:
                super.breed = "Local";
                break;
            case 3:
                super.breed = "Abyssinian";
                break;
            default:
                super.breed = "Unknown";
        }
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

// 2nd Level Inheritance
class CatEar extends Cat {

    CatEar(int meowSound, String gender, String color, boolean canWalk, int breed) {
        super(meowSound, gender, color, canWalk, breed);
    }

    String catEar() {
        switch (super.breed) {
            case "Scottish Fold":
                return "Small Ears";
            case "Local":
                return "Medium Ears";
            case "Abyssinian":
                return "Big Ears";
            default:
                return "Normal Ears";
        }
    }

}
