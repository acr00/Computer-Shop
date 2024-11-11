package com.factoriaf5.computershop;

public class Computers {

    private String computerBrand;
    private int memorySize;
    private String processor;
    private String operativeSystem;
    private double price;

    //Constructor
    
    public Computers(String computerBrand, int memorySize, String processor, String operativeSystem, double price) {
        this.computerBrand = computerBrand;
        this.memorySize = memorySize;
        this.processor = processor;
        this.operativeSystem = operativeSystem;
        this.price = price;
    }
    // Getters and Setters

    public String getComputerBrand() {
        return computerBrand;
    }
    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }
    public int getMemorySize() {
        return memorySize;
    }
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getOperativeSystem() {
        return operativeSystem;
    }
    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
