public class Tiger extends Feline{
    private String name;
    public Tiger(){
        this.name="Unnamed Tiger";
    }
    public void wakeUp(){
        System.out.println("The tiger "+this.name+ "already wake up" );
    }
    public void makeNoise(){
        System.out.println("The tiger "+this.name+" is roaring");
    }
    public void eat(){
        System.out.println("The tiger "+this.name+"is eating");
    }
    public void roam(){
        System.out.println("The tiger "+this.name+"is walking around");
    }
    public void sleep(){
        System.out.println("The tiger "+this.name+"is sleeping");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String tempName){
        name=tempName;
    }
}
