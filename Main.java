import java.util.*;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nel seguente passaggio andremo a chiedere all'utente il numero di parole da inserire.
        System.out.println("Numero di parole da inserire");
        int n = sc.nextInt();

        //Il seguente passaggio servirà a contenere le parole inserire dall'utente
        Set<String> Parole = new HashSet<>();
        Set<String> ParoleDuplicate = new HashSet<>();

        //Adesso attraverso un ciclo for andremo a inserire le parole all'interno dell'HashSet
        //for (int i = 0; i < n ; i++){
          //  System.out.println("Inserire la parola" + (i + 1) + ":"); //in questo system out "(i+1)" viene implementato perché così si ha la possibilità di inserire più parole
            //String parola = sc.next();

        //Nel metodo utilizzato prima l'unica cosa che non andava bene era il fatto che l'HashSet non salva in maniera ordinata gli elementi inseriti uno dopo l'altro quindi adesso
        //andremo ad utilizzare il metodo LinkedList che ritorna un oggetto.
        LinkedList<String> ParoleDistinte = new LinkedList<>();
        while (Parole.size() < n){
            System.out.println("Inserisci un parola:");
            String parola = sc.next();
            //Di norma il metodo HashSet non prevede di effettuare il salvataggio di un elemento già esistente all'interno di esso di conseguenza
            // se l'utente aggiunge una parola già esistente al suo interno allora quest'ultimo verrà salvato in un altro HashSet che in questo caso abbiamo chiamato ParoleDuplicate.
            if (!Parole.add(parola)){
                ParoleDuplicate.add(parola);
            } else if (!ParoleDistinte.contains(parola)) {
                ParoleDistinte.addLast(parola);
            }

        }
        //Qui andiamo a stampare le Parole che sono state inserite dall'utente e che sono già state inserite nel primo ArrayList(Parole)
        System.out.println("Parole duplicate:" + ParoleDuplicate);

        //Qui andiamo a stampare il numero di parole distinte
        int NumParoleDistinte = Parole.size();
        System.out.println("Numero delle parole distinte:" + NumParoleDistinte);
        System.out.println("Elenco delle parole distinte:" + Parole);
    }
}