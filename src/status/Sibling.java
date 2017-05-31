/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author Hanif
 */
public class Sibling implements Status {
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getStatus() {
        return getClass().getSimpleName() +"\n"
                +"name="+getName()+", "
                +"age="+getAge()+", "
                +"weight="+getWeight()+"\n";
    }

    @Override
    public void displayStatus() {
        System.out.println(getStatus());
    }
    
    
    
}
