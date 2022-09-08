package Question_2;

public class QuestionFour {
    public static void main(String[] args) {
        new HCFLCM(12, 18);

    }
}

class HCFLCM {
    int num_1;
    int num_2;
    int hcf;

    HCFLCM() {
        System.out.println("Please provide two arguements for calculaion");
    }

    HCFLCM(int num_1, int num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
        int temp_1, temp_2, t;
        temp_1 = num_1;
        temp_2 = num_2;
        while (temp_2 != 0) {
            t = temp_2;
            temp_2 = temp_1 % temp_2;
            temp_1 = t;
        }
        hcf = temp_1;
        System.out.println("HCF is : " + hcf);
        int lcm = (num_1 * num_2) / hcf;
        System.out.println("LCM is " + lcm);

    }
    /*
     * Using Euclid Division Algorithm
     * num_1=12
     * num_2=18
     * 
     * temp_1=12
     * temp_2=18
     * 
     * temp_2=18 so its true
     * 1st
     * t=18
     * temp_2=12%18=12
     * temp_1=18
     * 
     * temp_2=12 so its true
     * 2nd
     * t=12
     * temp_2=18%12=6
     * temp_1=12
     * 
     * temp_2=6 so its true
     * 3rd
     * t=6
     * temp_2=12%6=6
     * temp_1=6
     * 
     * temp_2=6 so its true
     * 3rd
     * t=6
     * temp_2=6%6=0
     * temp_1=6
     * 
     * temp_2=0 so its false
     * hcf=6;
     */

}
