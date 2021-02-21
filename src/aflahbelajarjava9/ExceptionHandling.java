package aflahbelajarjava9;

public class ExceptionHandling {
    public static void main(String[] args){
        try{
            System.out.println(args[1]);
        }catch(ArrayIndexOutOfBoundsException exp){
            System.out.println("Exception caught");
        }
    }
}
