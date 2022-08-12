package ss6;

public abstract class Animal {
    public abstract String makeSound();

}
interface Edible {
    String howtoEat();
}
 class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
    @Override
    public String howtoEat(){
        return "ngoam ngoam ";
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howtoEat(){
        return "eat rice";
    }
}
abstract class Fruit implements Edible{

}
