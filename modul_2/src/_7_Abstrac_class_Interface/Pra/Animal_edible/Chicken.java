package _7_Abstrac_class_Interface.Pra.Animal_edible;

public class Chicken extends Animal implements  Edible{
    @Override
    public String makeSound(){
        return "Chicken: cluck cluck";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
