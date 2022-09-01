public class ShiftOperator {
    public static void main(String[] args) {
        int a=20;
        System.out.println(a<<2);//20*2^2
        System.out.println(a>>2);//20/2^2
        //Triple shift Operations
        System.out.println(a>>>2);
        /*
         * What's Happening in triple shift
         * a>>>2
         * a=20
         * a=10100(in Binary)
         * a=01010(Right shift one bit)
         * a=00101(Right shift one bit)
         * a=5
         */
    }
}
