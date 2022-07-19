public class Animal {
    private String name;
    public  Animal(){}
    public  void sleep(){System.out.println(this.name + " the Animal sleeps."); }
    public void roam(){System.out.println(this.name + " the Animal roams");}
    public  void eat(){System.out.println(this.name + " the Animal is eating.");}
    public void wakeUp(){System.out.println(this.name + " the Animal wakes up.");}
    public  void makeNoise(){System.out.println(this.name + " the Animal is making noise.");}

    public String getName() {

        return this.name;
    }
    public void setName(String a){
        this.name=a;
    }
}
