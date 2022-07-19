import java.util.List;

public class ZooKeeper extends ZooEmployee{
    public void wakeUpAnimals(List<Animal> animals){
        for(int i=0;i<animals.size();i++){
            System.out.println("Zookeeper wakes up "+animals.get(i).getName());
            animals.get(i).wakeUp();
        }
    }
    public void rollCall(List<Animal> animals){
        System.out.println("Zookeeper performs a rollcall");
        for(int i=0;i<animals.size();i++){
            System.out.println("Zookeeper sees "+animals.get(i).getName());

        }

    }
    public void feed(List<Animal> animals){
        for(int i=0;i<animals.size();i++){
            System.out.println("Zookeeper feeds "+animals.get(i).getName());
            animals.get(i).eat();
        }

    }
    public void exercise(List<Animal> animals){
        for(int i=0;i<animals.size();i++){
            System.out.println("Zookeeper exercises "+animals.get(i).getName());

        }
        
    }
    public void sleepAnimals(List<Animal> animals){
        for(int i=0;i<animals.size();i++){
            System.out.println("Zookeeper tells "+animals.get(i).getName()+"go to sleep");
            animals.get(i).sleep();
        }
    }

}
