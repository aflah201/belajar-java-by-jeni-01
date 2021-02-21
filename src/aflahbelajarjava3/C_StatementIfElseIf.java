package aflahbelajarjava3;

public class C_StatementIfElseIf {
    public static void main(String[] args){
        
        int nilai = 70;
        
        if (nilai > 85){
            System.out.println("Selamat...");
            System.out.println("Nilai anda Sangat Bagus!");
        }
        else if (nilai > 50){
            System.out.println("Selamat...");
            System.out.println("Nilai anda Cukup Bagus!");
        }
        else{
            System.out.println("Maaf anda Gagal!");
        }
    }
}
