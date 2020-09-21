package com.egidijus.app;

public class klases_darbas_09_17 {
    
    public static void main(String[] args) {

//        Dog myObj = new Dog();
        Dog dog1 = new Dog("Retriveris", "Bardas");
        System.out.println("Šuns veislė: " + dog1.getName() + ", Šuns vardas " + dog1.getSurname());
//        myObj.setName("Retriveris");
//        System.out.println("Veislė --> " + myObj.getName());
//        myObj.setSurname("Bardas");
//        System.out.println("Šuns vardas --> " + myObj.getSurname());
    }
}

class Dog {
    private String veisle;
    // Getter
    public String getName() {
        return veisle;
    }
    // Setter
    public void setName(String newName) {
        this.veisle = newName;
    }
    private String sunsvardas;
    // Getter
    public String getSurname() {
        return sunsvardas;
    }
    // Setter
    public void setSurname(String newSurname) {
        this.sunsvardas = newSurname;
    }
    public Dog(String n, String s) {
        this.veisle = n;
        this.sunsvardas = s;
    }

}
