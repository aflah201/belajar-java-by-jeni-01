package aflahbelajarjava8;

public abstract class D_LivingThing {
    public void breath(){
        System.out.println("Living Thing Breathing...");
    }
    public void eat(){
        System.out.println("Living Thing Eating...");
    }
    //abstract method walk
    //kita ingin method ini di overriden oleh sub class
    public abstract void walk();
}