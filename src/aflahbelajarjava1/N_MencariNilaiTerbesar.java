package aflahbelajarjava1;
import java.util.Scanner;
public class N_MencariNilaiTerbesar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double angka1=0, angka2=0, angka3=0;
        
        System.out.print("Masukkan nilai pertama : ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan nilai kedua   : ");
        angka2 = input.nextDouble();
        System.out.print("Masukkan nilai ketiga  : ");
        angka3 = input.nextDouble();
        System.out.println();
        
        if (angka1 >= angka2 && angka1 >= angka3){
            System.out.println("Dari data diatas Nilai "+ angka1 + " adalah nilai terbesar");
        }
        else if (angka2 >= angka1 && angka2 >= angka3){
            System.out.println("Dari data diatas Nilai "+ angka2 + " adalah nilai terbesar");
        }
        else {
            System.out.println("Dari data diatas Nilai "+ angka3 + " adalah nilai terbesar");
        }
        
        if (angka1 <= angka2 && angka1 <= angka3){
            System.out.println("Dari data diatas Nilai "+ angka1 + " adalah nilai terkecil");
        }
        else if (angka2 <= angka1 && angka2 <= angka3){
            System.out.println("Dari data diatas Nilai "+ angka2 + " adalah nilai terkecil");
        }
        else {
            System.out.println("Dari data diatas Nilai "+ angka3 + " adalah nilai terkecil");
        }
        double hasil = (angka1+angka2+angka3)/3;
        System.out.println("Dari data diatas Nilai "+ hasil + " adalah nilai Rata-Rata");
    }
}
