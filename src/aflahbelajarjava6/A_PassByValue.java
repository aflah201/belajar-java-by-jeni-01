package aflahbelajarjava6;

public class A_PassByValue {
    public static void main(String[] args){
        
        int i = 18;
        System.out.println(i);
        
        test(i);
        
        System.out.println(i);
    }
    public static void test (int j){
        
        j = 33;
    }
}
