import java.util.Locale;
import java.util.Scanner;

public class Anagramma {
    public static void main(String[] args) {
        //apro lo Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la prima stringa: ");
        // salvo la stringa inserita
        String s1 = sc.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        // salvo la stringa inserita
        String s2 = sc.nextLine();
        check(s1, s2);
    }

    /*confronto la lunghezza delle stringhe, se sono diverse so per certo che non è un anagramma
    se sono uguali controllo se ogni carattere della stringa 1 si trova nella stringa 2, se non è presente ritorna -1 e
    quindi la condizione è falsa.
    Se il carattere è presente controlla quante volte è presente in entrambe le stringhe
     */
    public static void check(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {

                if (s2.indexOf(s1.charAt(i)) == -1) {
                    System.out.println(false);
                    return;
                } else {
                    if (!count(s1.charAt(i), s1, s2)) {
                        System.out.println(false);
                        return;
                    }
                }
            }
        } else {
            System.out.println(false);
            return;
        }
        System.out.println(true);
    }

    public static boolean count(char c, String s1, String s2) {
        int cont1 = 0, cont2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == c)
                cont1++;
            if(s2.charAt(i) == c)
                cont2++;
        }
        if(cont1==cont2)
            return true;
        else
            return false;
    }
}
