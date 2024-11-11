package com.factoriaf5.computershop;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ComputerstoreTests {
    @Test
    void TestComputerStoreConstructor() {
        String storeName = "Tienda de Ordenadores F5";
        String propietary = "Adrian Caiñas";
        int tributaryId = 111111111;
        
        Computerstore computerStore = new Computerstore(storeName, propietary, tributaryId);
        
        assertEquals(storeName, computerStore.getStoreName());
        assertEquals(propietary, computerStore.getPropietary());
        assertEquals(tributaryId, computerStore.getTributaryId());
        assertEquals(0, computerStore.getComputers().size());
    }
    @Test
    void TestComputerStoreName() {

        Computerstore computerStore = new Computerstore();
        computerStore.setStoreName("Tienda de Ordenadores F5");
        assertEquals("Tienda de Ordenadores F5", computerStore.getStoreName());

    }
    @Test
    void TestComputerPropietary() {

        Computerstore computerStore = new Computerstore();
        
        computerStore.setPropietary("Adrian Caiñas");
        assertEquals("Adrian Caiñas", computerStore.getPropietary());

    }
    @Test
    void TestComputerTributaryId() {

        Computerstore computerStore = new Computerstore();
        computerStore.setTributaryId(111111111);
        assertEquals(111111111, computerStore.getTributaryId());

    }
    @Test
    void TestComputerStoreComputersList() {

        Computerstore computerStore = new Computerstore();
        
        List<Computers> listComputers = new ArrayList<>();
        listComputers.add(new Computers(1,"Apple",64, "Intel Core i7", "MacOS",1500));
        listComputers.add(new Computers(2,"HP",32, "Intel Celeron", "Windows 10",500));
        computerStore.setComputers(listComputers);
        assertEquals(listComputers, computerStore.getComputers());

    }
    @Test
    void TestComputerStoreAddComputer() {

        Computerstore computerStore = new Computerstore(null, null, 0);
        Computers computer = new Computers(1,"Lenovo",32, "Intel Celeron", "Windows 10",500);
        computerStore.addComputer(computer);
        assertEquals(1, computerStore.getComputers().size());
        assertEquals(computer, computerStore.getComputers().get(0));

    }
    @Test
    void TestComputerStoreRemoveComputer() {

        Computerstore computerStore = new Computerstore(null, null, 0);
        
        Computers computer1 = new Computers(1,"Lenovo",32, "Intel Celeron", "Windows 10",500);
        computerStore.addComputer(computer1);
        computerStore.removeComputer(1);
        assertEquals(0, computerStore.getComputers().size());
    

    }

    @Test
    void TestComputerStoreFindComputerById() {

        Computerstore computerStore = new Computerstore(null, null, 0);
        
        Computers computer1 = new Computers(1,"Apple",64, "Intel Core i7", "MacOS",1500);
        Computers computer2 = new Computers(2,"HP",32, "Intel Celeron", "Windows 10",500);
        computerStore.addComputer(computer1);
        computerStore.addComputer(computer2);
        computerStore.findComputerById(1);

        assertEquals(computer1, computerStore.getComputers().get(0));
        assertEquals(computer2, computerStore.getComputers().get(1));
        assertEquals(null, computerStore.findComputerById(3));

    }

    @Test
    void TestComputerStoreListComputers(){
        Computerstore computerStore = new Computerstore(null, null, 0);

        Computers computer1 = new Computers(1, "MSI", 16, "Intel i9", "Windows 11", 1800);
        Computers computer2 = new  Computers(2, "Alienware", 32, "AMD Ryzen 7", "Windows 10", 900);
        computerStore.addComputer(computer1);
        computerStore.addComputer(computer2);
        List<Computers> list = computerStore.listComputers();
        assertEquals(2, list.size());
        assertTrue(list.contains(computer1));
        assertTrue(list.contains(computer2));
    }
}