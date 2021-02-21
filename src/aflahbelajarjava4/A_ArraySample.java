package aflahbelajarjava4;

public class A_ArraySample {
    public static void main(String[] args){
        
        int[] umur = new int[100];
        
        for (int i = 0; i < 100; i++){
            System.out.print(umur[i]+" ");
        }
        System.out.println();
        for (int j = 0; j < umur.length; j++){
            System.out.print(umur[j]+" ");
        }
    }
}
