public class Canine extends Animal{
    private String name;
    public Canine(){}
    public void sleep(){System.out.println(this.name + "is lying on the ground and sleeping."); }
    public void roam(){System.out.println(this.name + "is wandering around");}
    public  void eat(){System.out.println(this.name + " is eating meat.");}
    public void wakeUp(){System.out.println(this.name + " wakes up.");}
    public  void makeNoise(){System.out.println(this.name + " is howling");}
    public String getName() {

        return this.name;
    }
    public void setName(String a){
        this.name=a;
    }
}
