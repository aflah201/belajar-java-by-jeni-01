package aflahbelajarjava8;

public class H_LatihanPerson {
    protected String nama;
    protected String alamat;
    protected int umur;
    protected double informatikaGrade;
    
    public H_LatihanPerson(){
        nama = "Aflah";
        alamat = "Sidoarjo";
        umur = 19;
        informatikaGrade = 89.6;
    }
    public H_LatihanPerson(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    public H_LatihanPerson(int umur){
        this.umur = umur;
    }
    public H_LatihanPerson(double informatikaGrade){
        this.informatikaGrade = informatikaGrade;
    }
    public String getNama(){
        System.out.println("Person : "+nama);
        return nama;
    }
    public String getAlamat(){
        System.out.println("Address : "+alamat);
        return alamat;
    }
    public int umur(){
        System.out.println("Age : "+umur);
        return umur;
    }
    public double informatikaGrade(){
        System.out.println("Point : "+informatikaGrade);
        return informatikaGrade;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setGrade(double informatikaGrade){
        this.informatikaGrade = informatikaGrade;
    }
}
