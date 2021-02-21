package aflahbelajarjava8;

public class B_Student extends A_Person{
    public B_Student(){
//        super("SomeName","SomeAddress");
//        super();
//        super.name = "name";
//        System.out.println("Inside Student : Constructor");
    }
    @Override
    public String getName(){
        System.out.print("Student name : " +name);
        return name;
    }
    public static void main(String[] args){
        B_Student aflah = new B_Student();
    }
}
