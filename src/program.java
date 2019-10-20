//import prog*io.*;

// Librerie necessarie
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class program {      // classe principale
    public static void main(String[] args) {

        System.out.println("***********************************");
        System.out.println("Funzioni base Java di Ivan Cristina");
        System.out.println("***********************************");
        setup.help();   // Richiama funzione help in classe setup
    }
}

class setup {

    // private per essere chiamabili solo all'interno della classe;
    // static per essere chiamabili in tutta la classe;
    // final a causa dello switch che necessita di variabili costanti
    private static final String funz1 = "print";
    private static final String funz2 = "addizione";
    private static final String funz3 = "sottrazione";
    private static final String funz4 = "moltiplicazione";
    private static final String funz5 = "divisione";
    private static final String funz6 = "console";
    private static final String funz7 = "ifcondititon";
    private static final String funz8 = "compara";

    private static final String funze = "esci";


    static void help() {

        String spazi = "                   ";

        System.out.println("Elenco delle funzioni:");
        System.out.print("\n");
        // Eventualmente fisserò numero di spazi tramite differenza lenght parole
        System.out.println("1: " + funz1 + spazi.substring(0, spazi.length() - funz1.length()) + "Test di print");
        System.out.println("2: " + funz2 + spazi.substring(0, spazi.length() - funz2.length()) + "Addizione");
        System.out.println("3: " + funz3 + spazi.substring(0, spazi.length() - funz3.length()) + "Sottrazione");
        System.out.println("4: " + funz4 + spazi.substring(0, spazi.length() - funz4.length()) + "Moltiplicazione");
        System.out.println("5: " + funz5 + spazi.substring(0, spazi.length() - funz5.length()) + "Divisione");
        System.out.println("6: " + funz6 + spazi.substring(0, spazi.length() - funz6.length()) + "RW Console");
        System.out.println("7: " + funz7 + spazi.substring(0, spazi.length() - funz7.length()) + "Esegui una condizione SE");
        System.out.println("8: " + funz8 + spazi.substring(0, spazi.length() - funz8.length()) + "Compara due numeri");

        System.out.println("E: " + funze + spazi.substring(0, spazi.length() - funze.length()) + "Chiudi il programma");
        System.out.print("\n");
        setup.menu();
    }

    static void menu() {

        System.out.println("Scegli uno dei menu, tramite numero o nome funzione:");
        System.out.print("\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nome = null; // Inizializza la funzione, anche con un null
        try {
            nome = reader.readLine();       // Legge l'input di console
        } catch (IOException e) {           // Evita di usare IOException globalmente
            e.printStackTrace();
        }
        System.out.print("\n");

        /*
        // Metodo 1 - getRuntime
        // Teroricamente corretto, non funziona a causa della natura di Runtime

        try {
            Runtime.getRuntime().exec(funzione);
        } catch (IOException e) {
            System.out.println(funzione);
            e.printStackTrace();
        }

        // Metodo 2 - Reflection
        // Potrebbe funzionare, preferibile a case in questo programma. WIP

        String funzione = "funzioni." + nome + "();";

        try {
            Class.forName("funzioni").getDeclaredMethod(nome, null);
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        */

        // Metodo 3 - switch case
        assert nome != null;    // Evita una NullPointerException
        switch (nome) {
            case funz1:         // Possiamo utilizzare più di
            case "1":           // una condizione per un caso
                System.out.println("Apro la funzione: " + funz1);
                funzioni.print();
                break;
            case funz2:
            case "2":
                System.out.println("Apro la funzione: " + funz2);
                funzioni.addizione();
                break;
            case funz3:
            case "3":
                System.out.println("Apro la funzione: " + funz3);
                funzioni.sottrazione();
                break;
            case funz4:
            case "4":
                System.out.println("Apro la funzione: " + funz4);
                funzioni.moltiplicazione();
                break;
            case funz5:
            case "5":
                System.out.println("Apro la funzione: " + funz5);
                funzioni.divisione();
                break;
            case funz6:
            case "6":
                System.out.println("Apro la funzione: " + funz6);
                funzioni.console();
                break;
            case funz7:
            case "7":
                System.out.println("Apro la funzione: " + funz7);
                funzioni.ifcondition();
                break;
            case funz8:
            case "8":
                System.out.println("Apro la funzione: " + funz8);
                funzioni.compara();
                break;
            case funze:
            case "E":
            case "e":
                setup.esci();
                break;
            default:    // caso avviato in cui condizione in input inesistente
                System.out.println("Funzione non contemplata. Riapro setup");
                setup.help();

                System.out.print("\n");

        }

    }

    static void fine() {        // si avvia alla fine di ogni funzione
        System.out.print("\n");
        System.out.print("Premi m per tornare al menu, u per uscire");
        System.out.print("\n");
        System.out.print("\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String scelta = null;
        try {
            scelta = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("\n");
        assert scelta != null;
        if(scelta.equals("m")){
            setup.help();
        }else if(scelta.equals("u")){
            setup.esci();
        }else{
            System.out.println("Scelta non contemplata. Riapro il menu");
            setup.fine();
        }
    }

    static void esci() {

        System.out.println("Esco dal programma");
        System.out.println("\"Let me sleep.\" - Al Pacino");
        System.out.print("\n");
        System.exit(0);
    }
}

class funzioni {

    private static double x;    // Private to make it avaiable to the entire class,
    private static double y;    // better than make it public to prevent confusion
    private static String input = null;

    static void print() {

        System.out.println("*************");
        System.out.println("\"Escape room\"");
        System.out.println("*************");
        setup.fine();
    }

    static void addizione() {
        funzioni.read();

        double s = x + y;

        System.out.println("Somma: di " + x + " e " + y +" risulta " + s + "!");

        setup.fine();

    }

    static void sottrazione() {
        funzioni.read();

        double s = x - y;

        System.out.println("Sottrazione: di " + x + " e " + y +" risulta " + s + "!");
        setup.fine();

    }

    static void moltiplicazione() {
        funzioni.read();

        double s = x * y;

        System.out.println("Moltiplicazione: di " + x + " e " + y +" risulta " + s + "!");
        setup.fine();

    }

    static void divisione() {
        funzioni.read();

        double s = x / y;

        System.out.println("Divisione: di " + x + " e " + y +" risulta " + s + "!");
        setup.fine();

    }

    static void console() {
        System.out.print("Scrivi qualcosa qui:");
        System.out.print("\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hai scritto \"" + input + "\"");            // Rilegge il valore
        System.out.println("In maiuscolo: " + input.toUpperCase() );    // Maiuscolo
        System.out.println("In minuscolo: " + input.toLowerCase() );    // Minuscolo
        System.out.println("Lunghezza parola: " + input.length() );     // Lunghezza
        if (input.length()>4){
            System.out.println("Substring(2,5): " + input.substring(2,5) );
        }else{      // Substring se parola con più di 5(+1) caratteri
            System.out.println("Per Substring, scegli una parola con 5 o più caratteri");
        }
        System.out.println("Contiene lettera \"a\": " + input.contains("a"));
        setup.fine();

    }

    static void ifcondition() {
        System.out.print("Hai più di €5000 in banca? (s/n)");
        System.out.print("\n");
        System.out.print("\n");

        funzioni.input();
        System.out.print("\n");

        if (input.equals("n")){
            System.out.println("Sei un poraccio");
        }else if (input.equals("s")){
            System.out.println("Dona tutto alla Caritas infame");
        }else{
            System.out.println("Non ho capito. Rispondi con \"s\" o \"n\"");
        }
        setup.fine();

    }

    static void compara() {
        funzioni.read();

        if (x>y){
            System.out.println("Comparazione: " + x + " è maggiore di " + y + "!");
        }else{
            System.out.println("Comparazione: " + x + " è minore di " + y + "!");
        }
        if (x>0){
            System.out.println("X: " + x + " è positivo!");
        }else{
            System.out.println("X: " + x + " è negativo!");
        }
        if (y>0){
            System.out.println("Y: " + y + " è positivo!");
        }else{
            System.out.println("Y: " + y + " è negativo!");
        }
        setup.fine();
    }

    public static void input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void read() {
        System.out.print("\n");     // A causa della chiamata della funzione in switch

        // X
        System.out.print("Inserisci valore di x");
        System.out.print("\n");
        BufferedReader xread = new BufferedReader(new InputStreamReader(System.in));
        String x1 = null;
        try {
            x1 = xread.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert x1 != null;
        x = Double.parseDouble(x1);

        // Y
        System.out.print("Inserisci valore di y");
        System.out.print("\n");
        BufferedReader yread = new BufferedReader(new InputStreamReader(System.in));
        String y1 = null;
        try {
            y1 = yread.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert y1 != null;
        y = Double.parseDouble(y1);

    }
}