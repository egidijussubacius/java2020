public class namu_darbas {
    public static void main(String[] args)
    {
        int vienas = 1;
        System.out.println("Minimali reikšmė = " + Integer.MIN_VALUE);
        System.out.println("Maksimali reikšmė = " +Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE - vienas + " skaičius nepakito, bet pasikeitė iš minuso į pliusą - vadinama 'underflow'");
        System.out.println(Integer.MAX_VALUE + vienas + " skaičius nepakito, bet pasikeitė iš pliuso į minusą - vadinama 'overflow'");
        System.out.println("Ar galėtume sutalpinti visų žemėje gyvenančių žmonių skaičių į int?");
        System.out.println("Atsakymas = TAIP.");
        System.out.println("Ar galėtume saugoti lietuvišką asmens kodą int tipo kintamąjame? Jei ne, kokį reiktų pasirinkti?");
        System.out.println("Atsakymas = NE.");
        System.out.println("Reiktų naudoti data type 'long'");
    }
}
