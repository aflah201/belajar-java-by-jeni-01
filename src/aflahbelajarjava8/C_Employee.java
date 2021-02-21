package aflahbelajarjava8;

public class C_Employee extends A_Person{
    @Override
    public String getName(){
        System.out.print("Employe Name : " +address);
        return address;
    }
    public static void main(String[] args){
        A_Person ref;
        B_Student studentObject = new B_Student();
        C_Employee employeeObject = new C_Employee();
        ref = studentObject; //person menunjukkan Object B_Student
        
        String temp = ref.getName(); //getName dari B_Student class dipanggil
        System.out.println(temp);
        ref = employeeObject; //person menunjukkan Object C_Employee
        
        temp = ref.getName();
        System.out.println(temp);
    }
}

