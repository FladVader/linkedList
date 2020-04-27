/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import java.util.Random;

/**
 *
 * @author Anton
 */
public class Person {
    
    private String name;
    private int id;
    private String yrke;
    private static int counter = 0;
    
    public Person (String name,  String yrke){
        
        this.name = name;
        this.yrke = yrke;
        this.id = counter + 100;
        counter++;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id =  id;
    }

    public String getYrke() {
        return yrke;
    }

    public void setYrke(String yrke) {
        this.yrke = yrke;
    }

    @Override
    public String toString() {
        return "Namn: " + name + ", Id: " + id + ", Yrke: " + yrke;
    }

    public int createId(){
        counter++;
        return counter + 100;
        
    }
}
