package io.zipcoder.polymorphism;

public class Cat extends Pets {

    public Cat(String name) {
        super(name);
    }

    public String getname(){
        return super.getName();
    }

    public void setName(String name){
        super.setName(name);
    }

    @Override
    public String speak() {
        return "Meow-meow";
    }

    @Override
    public String toString() {
        return super.toString()+speak();
    }
}
