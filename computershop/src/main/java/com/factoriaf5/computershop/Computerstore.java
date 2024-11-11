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
}