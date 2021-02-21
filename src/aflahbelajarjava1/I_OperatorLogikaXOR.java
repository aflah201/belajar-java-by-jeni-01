package aflahbelajarjava1;

public class I_OperatorLogikaXOR {
    public static void main(String[] args){
        
        boolean value1 = true;
        boolean value2 = true;
        System.out.println("Value1 = True");
        System.out.println("Value2 = True");
        System.out.println("Value1 ^ Value2 = "+ (value1 ^ value2));
        System.out.println();
        
        value1 = false;
        value2 = true;
        System.out.println("Value1 = False");
        System.out.println("Value2 = True");
        System.out.println("Value1 ^ Value2 = "+ (value1 ^ value2));
        System.out.println();
        
        value1 = false;
        value2 = false;
        System.out.println("Value1 = False");
        System.out.println("Value2 = False");
        System.out.println("Value1 ^ Value2 = "+ (value1 ^ value2));
        System.out.println();
        
        value1 = true;
        value2 = false;
        System.out.println("Value1 = True");
        System.out.println("Value2 = False");
        System.out.println("Value1 ^ Value2 = "+ (value1 ^ value2));
        System.out.println();
    }
}
