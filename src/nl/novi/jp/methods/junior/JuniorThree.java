package nl.novi.jp.methods.junior;

/**
 * Deze klasse bevat al de methode negativeNumberChecker. Beantwoord voor jezelf wat deze methode doet.
 *
 * Roep de methode een paar keer aan om zijn gedrag in de praktijk te zien.
 *
 * Probeer logische "edge cases" te bedenken voor het aanroepen van deze methode.
 * Lukt dat niet, dan je mag elk willekeurig getal gebruiken.
 */

//O geeft negatief met alleen >0. == 0 is toegevoegd.
public class JuniorThree {
    public static void main(String[] args) {
        negativeNumberChecker(0);

    }

    public static void negativeNumberChecker(int number) {
        if(number > 0) {
            System.out.println(number + " is een positief getal.");
        }
        if(number == 0){
            System.out.println(number + " is nul");
        }
        else {
            System.out.println(number + " is een negatief getal.");
        }
    }
}
