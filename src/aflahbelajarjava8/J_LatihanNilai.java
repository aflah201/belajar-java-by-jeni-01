package aflahbelajarjava8;

public class J_LatihanNilai extends H_LatihanPerson {
    @Override
    public String getNama(){
        System.out.println("Nama Lengkap   : "+nama);
        return nama;
    }
    @Override
    public String getAlamat(){
        System.out.println("Alamat Lengkap : "+alamat);
        return alamat;
    }
    public int getUmur(){
        System.out.println("Umur Lengkap : "+umur);
        return umur;
    }
    public double getInformatikaGrade(){
        System.out.println("Nilai TIF : "+informatikaGrade);
        return informatikaGrade;
    }
    public static void main(String[] args){
        H_LatihanPerson ref;
        I_LatihanStudent studentObject = new I_LatihanStudent();
        J_LatihanNilai gradeObject = new J_LatihanNilai();
        ref = studentObject;
        
        String temp = ref.getNama();
        temp = ref.getAlamat();
        
    }
}
