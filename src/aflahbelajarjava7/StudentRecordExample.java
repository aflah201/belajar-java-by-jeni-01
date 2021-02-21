package aflahbelajarjava7;

public class StudentRecordExample {
    public static void main(String[] args){
        //membuat 3 object StudentRecord
        StudentRecord aflahRecord = new StudentRecord();
        StudentRecord azzakyRecord = new StudentRecord();
        StudentRecord designRecord = new StudentRecord();
        //versi baru
        StudentRecord recordAflah = new StudentRecord("Aflah");
        StudentRecord recordAzzaky = new StudentRecord("Azzaky","Sidoarjo");
        StudentRecord recordDesign = new StudentRecord(80,90,100);
        //memberi nama siswa
        aflahRecord.setName("Aflah");
        azzakyRecord.setName("Azzaky");
        designRecord.setName("Design");
        //menampilkan nama
        System.out.println(aflahRecord.getName());
        //menampilkan jumlah siswa
        System.out.println("Hitung "+StudentRecord.getStudentCount());
        StudentRecord aflah2Record = new StudentRecord();
        aflah2Record.setName("Aflah");
        aflah2Record.setAddress("Sidoarjo");
        aflah2Record.setAge(19);
        aflah2Record.setMathGrade(73);
        aflah2Record.setEnglishGrade(79);
        aflah2Record.setScienceGrade(88);
        //overload method
        aflah2Record.print(aflah2Record.getName());
        aflah2Record.print(aflah2Record.getEnglishGrade(),
                aflah2Record.getMathGrade(),
                aflah2Record.getScienceGrade());
        recordAflah.print(recordAflah.getName());
        
    }
}
