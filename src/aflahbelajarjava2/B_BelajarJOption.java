package aflahbelajarjava2;

import javax.swing.JOptionPane;

public class B_BelajarJOption {
    public static void main(String[] args){
        String name = "";
        name = JOptionPane.showInputDialog("Masukkan Nama Anda");
        
        String msg = "Halo.., "+ name +" Aku Sayang Kamu!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
