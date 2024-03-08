package oop_practice.cat_dog.cat;

public class Cat extends Animal{
  private String name,

  public Cat(String name)  {
        this.name = name;
    }

  public void sound() {
       System.out.println("I'm a Cat. My name " + name + ". Mew");
    }
}
