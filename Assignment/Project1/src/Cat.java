public class Cat extends Feline {
    private String name;
    public Cat(){
        this.name="Unnamed Cat";
    }
    public void wakeUp(){
        System.out.println("The cat "+this.name+ "already wake up" );
    }
    public void makeNoise(){
        System.out.println("The cat "+this.name+"is roaring ");
    }
    public void eat(){
        System.out.println("The cat "+this.name+"is eating");
    }
    public void roam(){
        System.out.println("The cat "+this.name+"is walking around");
    }
    public void sleep(){
        System.out.println("The cat "+this.name+"is sleeping");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String tempName){
        name=tempName;
    }
}
