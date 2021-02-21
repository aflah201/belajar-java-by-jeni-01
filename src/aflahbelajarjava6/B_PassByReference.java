package aflahbelajarjava6;

public class B_PassByReference {
    public static void main(String[] args){
        
        int[] umur = {10,20,30};
        
        for (int i = 0; i < umur.length; i++){
            System.out.print(umur[i]+" ");
        }
        System.out.println();
        test (umur);
        
        for (int i = 0; i < umur.length; i++){
            System.out.print(umur[i]+" ");
        }
    }
    public static void test(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 50;
        }
    }
}
