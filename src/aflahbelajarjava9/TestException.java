package aflahbelajarjava9;

public class TestException {
    public static void main(String[] args){
        int x = 10;
        try{
            x = x/0;
        }
        catch(Exception e){
            System.out.println("Error");
        }
        System.out.println(x);
    }
}
