/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author PC
 */
public class BeeColony extends Colony implements Role{ 
    String type;

    public BeeColony() {
    }

    public BeeColony(int size, String place,String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony's type is "+getType()+", size is about "+getSize()+", and the place is "+place;
    }
    
    
    @Override
    public void createWorker() {
        System.out.println("worker bees perform all the work of the bees");
    }
    
}