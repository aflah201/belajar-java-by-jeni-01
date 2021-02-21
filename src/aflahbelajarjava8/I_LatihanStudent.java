package aflahbelajarjava8;

public class I_LatihanStudent extends H_LatihanPerson {
    public I_LatihanStudent(){
        
    }
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
        I_LatihanStudent aflah = new I_LatihanStudent();
        
    }
}
