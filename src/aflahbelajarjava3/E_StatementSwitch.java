package aflahbelajarjava3;

public class E_StatementSwitch {
    public static void main(String[] args){
        
        int nilai_angkabulan = 5;
        
        switch(nilai_angkabulan){
            case 1:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Januari");
                break;
            case 2:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Pebruari");
                break;
            case 3:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Maret");
                break;
            case 4:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan April");
                break;
            case 5:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Mei");
                break;
            case 6:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Juni");
                break;
            case 7:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Juli");
                break;
            case 8:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Agustus");
                break;
            case 9:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan September");
                break;
            case 10:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Oktober");
                break;
            case 11:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Nopember");
                break;
            case 12:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bulan Desember");
                break;
            default:
                System.out.println("Angka "
                        +nilai_angkabulan+" adalah bukan angka bulan");
        }
    }
}
