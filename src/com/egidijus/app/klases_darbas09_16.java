package com.egidijus.app;

public class klases_darbas09_16 {


    public static void main(String[] args) {


        Person myObj = new Person();
        myObj.name = "Egidijus";
        System.out.println("Vardas --> " + myObj.name);


        myObj.surname = "Subačius";
        System.out.println("Pavardė --> " + myObj.surname);


//        myObj.age = 33;
        myObj.setAge(33);
        System.out.println("Amžius --> " + myObj.getAge());



    }


}

class Person {
    String name;

    // Getter
    public String getName() {

        return name;
    }

    // Setter
    public void setName(String newName) {

        this.name = newName;
    }


    String surname;

    // Getter
    public String getSurname() {
        return surname;
    }

    // Setter
    public void setSurname(String newSurname) {

        this.surname = newSurname;
    }


    private int age;

    // Getter
    public int getAge() {

        return  this.age;
    }

    // Setter
    public void setAge(int newAge) {

        this.age = newAge;
    }

}



