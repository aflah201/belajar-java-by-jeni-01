package aflahbelajarjava2;

import javax.swing.JOptionPane;

public class D_LatihanJOption {
    public static void main(String[] args){
        String nama1 = "";
        nama1 = JOptionPane.showInputDialog("Masukkan Nama Pertama : ");
        
        String nama2 = "";
        nama2 = JOptionPane.showInputDialog("Masukkan Nama Kedua : ");
        
        String pesan = "Halo "+nama1+" "+nama2+" Selamat Datang";
        JOptionPane.showMessageDialog(null, pesan);
    }
}
