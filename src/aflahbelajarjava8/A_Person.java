package aflahbelajarjava8;

public class A_Person {
    protected String name;
    protected String address;
    //default constructor
    public A_Person(){
//        System.out.println("Inside Person : Constructor");
        name = "Aflah ";
        address = "Sidoarjo ";
    }
    // constructor dengan dua parameter
    public A_Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //method accessor
    public String getName(){
        System.out.println("Person : "+name);
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
}