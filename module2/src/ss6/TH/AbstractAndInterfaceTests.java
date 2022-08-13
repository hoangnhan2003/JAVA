package ss6.TH;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] =new Tiger();
        for(Animal animal: animals){
            System.out.println(animal.makeSound());
        }
        Fruit[] list = new Fruit[2];
        list[0] = new Apple();
        list[1] = new Orange();
        for(Fruit fruit: list){
            System.out.println(fruit.howtoEat());
        }

    }
}
