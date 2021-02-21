package aflahbelajarjava1;

public class F_OperatorLogikaAND {
    public static void main(String[] args){
        int i = 0;
        int j = 10;
        boolean test = false;
        
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        System.out.println();
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
