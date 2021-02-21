package aflahbelajarjava2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A_MendapatkanInputKeyboard {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader
        (System.in));
        
        String name = "";
        System.out.print("Silahkan Masukkan Nama Anda : ");
        
        try{
            name = dataIn.readLine();
        }catch(IOException e){
            System.out.print("Error");
        }
        System.out.println("Hello "+name+"!");
    }
}
