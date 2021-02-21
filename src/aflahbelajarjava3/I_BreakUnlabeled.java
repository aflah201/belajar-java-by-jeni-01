package aflahbelajarjava3;

public class I_BreakUnlabeled {
    public static void main(String[] args){
        
        String nama[] = {"Aflah","Bima","Azhar","Dimas",
                "Yusuf","Deni","Yunan","Fikri","Fariz"};
        
        String cari_nama = "Aflah";
        boolean found_nama = false;
        
        for (int i = 0; i < nama.length; i++){
            if (nama[i].equals(cari_nama)){
                found_nama = true;
                break;
            }
        }
        if (found_nama){
            System.out.println(cari_nama+" Ketemu");
        }
        else {
            System.out.println(cari_nama+" Tidak Ketemu");
        }
    }
}
