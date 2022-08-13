package ss6.TH;

 abstract class Animal {
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
class Orange extends Fruit{
    @Override
    public String howtoEat(){
        return "Orange could be juiced";
    }
}
class Apple extends Fruit{
    @Override
    public String howtoEat(){
        return "Apple could be slided";
    }
}


