package aflahbelajarjava3;

import java.util.Scanner;

public class N_MembacaBilangan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
    
        if (angka <= 10){
            System.out.println("Data yang anda masukkan Benar");
        }
        else {
            System.out.println("Data yang anda masukkan Salah");
        }
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int data = input.nextInt();
        
        switch(data){
            case 1:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 2:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 3:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 4:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 5:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 6:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 7:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 8:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 9:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            case 10:
                System.out.println("Data yang anda masukkan Benar");
                break;
                
            default:
                System.out.println("Data yang anda masukkan Salah");
                break;
        }
    }
    
}
