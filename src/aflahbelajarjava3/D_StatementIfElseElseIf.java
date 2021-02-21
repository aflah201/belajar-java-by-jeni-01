package aflahbelajarjava3;

public class D_StatementIfElseElseIf {
    public static void main(String[] args){
        
        double nilai = 87.4;
        
        if (nilai > 90){
            System.out.println("Selamat...");
            System.out.println("Nilai anda Sangat Memuaskan!");
        }
        else if ((nilai < 90) && (nilai >= 80)){
            System.out.println("Selamat...");
            System.out.println("Nilai anda Cukup Memuaskan!");
        }
        else if ((nilai < 80) && (nilai >= 60)){
            System.out.println("Nilai anda Tidak Memuaskan!");
        }
        else{
            System.out.println("Maaf anda Gagal!");
        }
    }
}
