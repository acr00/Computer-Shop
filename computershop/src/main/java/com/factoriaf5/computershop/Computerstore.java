package com.factoriaf5.computershop;

import java.util.ArrayList;
import java.util.List;

public class Computerstore {

    private String storeName;
    private String propietary;
    private int tributaryId;
    private List<Computers> computers;
    public Computerstore(String storeName, String propietary, int tributaryId) {

        this.storeName = storeName;
        this.propietary = propietary;
        this.tributaryId = tributaryId;
        this.computers = new ArrayList<>();

    }

    public Computerstore() {
    
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

    public List<Computers> getComputers() {
        return computers;
    }
    public void setComputers(List<Computers> computers) {
        this.computers = computers;
    }

    //methods

    public void addComputer(Computers computer) {
        computers.add(computer);
        
    }
    public void removeComputer(int id) {
        computers.removeIf(computer -> computer.getComputerId() == id);
        
    }
    public Computers findComputerById(int id) {

        for (Computers computer : computers) {
            if(id == computer.getComputerId()) {
                return computer;
                
            }
        }
                return null;
    }
    public List<Computers> listComputers() {
        return new ArrayList<>(computers);

    }

}
