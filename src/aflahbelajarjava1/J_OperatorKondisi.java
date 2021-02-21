package aflahbelajarjava1;

public class J_OperatorKondisi {
    public static void main(String[] args){
        
        String status = "";
        int grade = 80;
        
        status = (grade >= 80)?"Anda Lolos":"Anda Gagal";
        System.out.println("Nilai ku = 80");
        System.out.println(status);
    }
}
