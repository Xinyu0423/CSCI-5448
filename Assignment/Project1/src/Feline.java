public class Feline extends Animal {
    private String name;
    public Feline(){}
    public void wakeUp(){
        System.out.println(this.name+ "already wake up" );
    }
    public void makeNoise(){
        System.out.println(this.name+"is roaring ");
    }
    public void eat(){
        System.out.println(this.name+"is eating");
    }
    public void roam(){
        System.out.println(this.name+"is walking around");
    }
    public void sleep(){
        System.out.println(this.name+"is sleeping");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String tempName){
        this.name=tempName;
    }
}
