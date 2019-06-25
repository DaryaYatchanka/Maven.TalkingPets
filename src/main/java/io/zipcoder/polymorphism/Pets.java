package io.zipcoder.polymorphism;


public class Pets {
    private String name;

    public Pets (String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String speak(){
        return "Something";
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                '}';
    }
}
