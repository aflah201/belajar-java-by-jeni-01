package aflahbelajarjava3;

public class J_BreakLabeled {
    public static void main(String[] args){
        int [][] nomer = {{1,2,3},{4,5,6},{7,8,9}};
        
        int cari_nomer = 10;
        boolean found_nomer = false;
        
        searchlabel:
        for (int i = 0; i < nomer.length; i++){
            for (int j = 0; j < nomer[i].length; j++){
                if (cari_nomer == nomer[i][j]){
                    found_nomer = true;
                    break searchlabel;
                }
            }
        }
        if (found_nomer){
            System.out.println(cari_nomer+" Nomer Ketemu");
        }
        else {
            System.out.println(cari_nomer+" Nomer Tidak Ketemu");
        }
    }
}
