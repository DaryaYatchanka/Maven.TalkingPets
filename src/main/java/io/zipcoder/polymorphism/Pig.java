package io.zipcoder.polymorphism;

public class Pig extends Pets {
    public Pig(String name) {
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
        return "Hru-hru";
    }

    @Override
    public String toString() {
        return super.toString()+speak();
    }
}
