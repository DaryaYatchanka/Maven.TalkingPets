package io.zipcoder.polymorphism;

public class Dog extends Pets {
    public Dog(String name) {
        super(name);
    }

    public String getName(){
        return super.getName();
    }

    public void setName(String name){
        super.setName(name);
    }

    @Override
    public String speak() {
        return "Bark-bark";
    }

    @Override
    public String toString() {
        return super.toString()+speak();
    }


}
