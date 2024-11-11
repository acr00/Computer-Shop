package com.factoriaf5.computershop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class ComputersTests {
    @Test
    
    void testComputerConstructor() {

        int id = 1;
        String brand = "dell";
        int memorySize = 16;
        String processor = "Intel Core i7";
        String os = "Windows 10";
        double price = 1000.0;
        Computers computer = new Computers(id, brand, memorySize, processor, os, price);
        assertEquals(id, computer.getComputerId());
        assertEquals(brand, computer.getComputerBrand());
        assertEquals(memorySize, computer.getMemorySize());
        assertEquals(processor, computer.getProcessor());
        assertEquals(os, computer.getOperativeSystem());
        assertEquals(price, computer.getPrice());

    }
    @Test
    void testComputerId() {

        Computers computer = new Computers();
        computer.setComputerId(1);
        assertEquals(1, computer.getComputerId());

    }
    @Test
    void testComputerBrand() {

        Computers computer = new Computers();
        computer.setComputerBrand("HP");
        assertEquals("HP", computer.getComputerBrand());

    }
    @Test
    void testComputerMemorySize() {

        Computers computer = new Computers();
        computer.setMemorySize(64);
        assertEquals(64, computer.getMemorySize());

    }
    @Test
    void testComputerProcessor() {

        Computers computer = new Computers();
        computer.setProcessor("Intel Core i7");
        assertEquals("Intel Core i7", computer.getProcessor());

    }
    @Test
    void testComputerOperativeSystem() {

        Computers computer = new Computers();
        computer.setOperativeSystem("Windows 10");
        assertEquals("Windows 10", computer.getOperativeSystem());

    }
    @Test
    void testComputerPrice() {

        Computers computer = new Computers();
        computer.setPrice(265.78);
        assertEquals(265.78, computer.getPrice());

    }

}