package ss6;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] =new Tiger();
//      Animal chicken = new Chicken();
//        System.out.println(chicken.makeSound());
        for(Animal animal: animals){
            animal.makeSound();
        }
        //System.out.println(animals[0].makeSound());
    }
}
