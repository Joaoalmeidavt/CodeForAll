package io.codeforall.fanstatics;

// Concrete Creator
public class DogFactory extends AnimalFactory{
    @Override
    public Animal createAnimal(){
        return new Dog();
    }
}
