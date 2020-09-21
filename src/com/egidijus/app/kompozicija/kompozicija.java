package com.egidijus.app.kompozicija;

public class kompozicija {
    public static void main(String[] args) {
Cpu cpu1 = new Cpu( "Amd", 64, 2800);
Kompas kompas1 = new Kompas(cpu1);
        System.out.println(kompas1);
    }
}

class Cpu {
private String tipas;
private int architektura;
private int greitis;

public Cpu (String tipas, int architektura, int greitis) {
    this.tipas=tipas;
    this.architektura=architektura;
    this.greitis=greitis;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "tipas='" + tipas + '\'' +
                ", architektura=" + architektura +
                ", greitis=" + greitis +
                '}';
    }

    public Cpu() {

    }
}

class Kompas {
    private Cpu cpu;

    public Kompas(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Kompe yra įdiegtas toks ---> " + cpu +
                '}';
    }
}



