import java.util.List;
public abstract class ZooEmployee {
        public ZooEmployee(){}
        public abstract void wakeUpAnimals(List<Animal> animals);
        public abstract void rollCall(List<Animal> animals);
        public abstract void feed(List<Animal> animals);
        public abstract void exercise(List<Animal> animals);
        public abstract void sleepAnimals(List<Animal> animals);

}

