package com.egidijus.app.paveldimumas;

public class paveldimumas {
    public static void main(String[] args) {
Darbuotojas nr1 = new Darbuotojas("Tadas");
        System.out.println(nr1);

Darbdavys e1 = new Darbdavys("Jonas");
        System.out.println(e1);

    }
}
class Darbuotojas {
    private String name;

    public Darbuotojas(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Darbuotojas{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Darbdavys extends Darbuotojas {

    public Darbdavys(String name) {
        super(name);
    }
}

//class Ceo extends Darbuotojas {
//
//}
