package io.codeforall.fanstatics;

// Concrete Creator
public class CatFactory extends AnimalFactory {
   @Override
    public Animal createAnimal() {
       return new Cat();
   }
}
