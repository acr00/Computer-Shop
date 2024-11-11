package com.factoriaf5.computershop;

import java.util.ArrayList;
import java.util.List;

public class Computerstore {

    private String storeName;
    private String propietary;
    private int tributaryId;
    private List<Computers> computers;
    public Computerstore(String storeName, String propietary, int tributaryId, List<Computers> computers) {

        this.storeName = storeName;
        this.propietary = propietary;
        this.tributaryId = tributaryId;

        this.computers = new ArrayList<>();
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getPropietary() {
        return propietary;
    }
    public void setPropietary(String propietary) {
        this.propietary = propietary;
    }
    public int getTributaryId() {
        return tributaryId;
    }
    public void setTributaryId(int tributaryId) {
        this.tributaryId = tributaryId;
    }

    //methods
    
    public void addComputer(Computers computer) {
        computers.add(computer);
        System.out.println("Computer"+computer.getComputerId()+" added successfully.");
    }
    public void removeComputer(int id) {
        computers.removeIf(computer -> computer.getComputerId() == id);
        System.out.println("Computer with id "+id+" removed successfully.");
    }
    public void findComputerById(int id) {
        for (Computers computer : computers) {
            if(id == computer.getComputerId()) {
                System.out.println("Computer found: "+computer);
                return;
            }
        }
    }
    public void listComputers() {
        if(computers.isEmpty()) {
            System.out.println("No computers found.");
        }else{
            for (Computers computer : computers) {
                System.out.println(computer);
            }
        }
    }
}
