//import prog*io.*;

// Librerie necessarie
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


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
    private static final String funz9 = "primo";
    private static final String funz10 = "rand_array";
    private static final String funz11 = "log_curve";
    private static final String funz12 = "cesare";
    private static final String funz13 = "vigenere";

    private static final String funze = "esci";


    static void help() {

        String spazi = "                   ";

        System.out.println("Elenco delle funzioni:");
        System.out.print("\n");
        // Eventualmente fisserò numero di spazi tramite differenza lenght parole
        System.out.println("1:  " + funz1 + spazi.substring(0, spazi.length() - funz1.length()) + "Test di print");
        System.out.println("2:  " + funz2 + spazi.substring(0, spazi.length() - funz2.length()) + "Addizione");
        System.out.println("3:  " + funz3 + spazi.substring(0, spazi.length() - funz3.length()) + "Sottrazione");
        System.out.println("4:  " + funz4 + spazi.substring(0, spazi.length() - funz4.length()) + "Moltiplicazione");
        System.out.println("5:  " + funz5 + spazi.substring(0, spazi.length() - funz5.length()) + "Divisione");
        System.out.println("6:  " + funz6 + spazi.substring(0, spazi.length() - funz6.length()) + "RW Console");
        System.out.println("7:  " + funz7 + spazi.substring(0, spazi.length() - funz7.length()) + "Esegui una condizione SE");
        System.out.println("8:  " + funz8 + spazi.substring(0, spazi.length() - funz8.length()) + "Compara due numeri");
        System.out.println("9:  " + funz9 + spazi.substring(0, spazi.length() - funz9.length()) + "Verifica numero primo");
        System.out.println("10: " + funz10 + spazi.substring(0, spazi.length() - funz10.length()) + "Lancia una moneta");
        System.out.println("11: " + funz11 + spazi.substring(0, spazi.length() - funz11.length()) + "Curva logaritmica");
        System.out.println("12: " + funz12 + spazi.substring(0, spazi.length() - funz12.length()) + "Cifrario di Cesare");
        System.out.println("13: " + funz13 + spazi.substring(0, spazi.length() - funz13.length()) + "Cifrario di Vigenere");

        System.out.println("E:  " + funze + spazi.substring(0, spazi.length() - funze.length()) + "Chiudi il programma");
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
            case funz9:
            case "9":
                System.out.println("Apro la funzione: " + funz9);
                funzioni.primo();
                break;
            case funz10:
            case "10":
                System.out.println("Apro la funzione: " + funz10);
                funzioni.rand_array();
                break;
            case funz11:
            case "11":
                System.out.println("Apro la funzione: " + funz11);
                funzioni.log_curve();
                break;
            case funz12:
            case "12":
                System.out.println("Apro la funzione: " + funz12);
                funzioni.cesare();
                break;
            case funz13:
            case "13":
                System.out.println("Apro la funzione: " + funz13);
                funzioni.vigenere();
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
        System.out.print("Premi m per tornare al menu, e per uscire");
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
        }else if(scelta.equals("e")){
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
        System.out.println("\"Escape room\"\n    Hello");
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
        int t = (int) (x / y);
        int resto = (int) (x % y);

        System.out.println("Divisione: di " + x + " e " + y +" risulta " + s + ", oppure " + t + " con resto di " + resto + "!");
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

        for (int i = 0; i < input.length(); i++){
            System.out.println("La lettera alla posizione " + i + " è " + input.substring(i,i+1) );
        }

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

    static void primo() {
        System.out.print("\n");
        System.out.print("Digita un numero:");
        System.out.print("\n");
        funzioni.input();

        int numero = Integer.parseInt(input);
        boolean primo = false;
        for(int i = 2; i <= numero/2; ++i)
        // Verifica tutti i possibili divisori (fino alla metà del numero stesso) in ciclo for
        {
            // Verifica dell'operatore residuo. Se il resto è 0, il numero è primo
            if(numero % i == 0)
            {
                primo = true;
                break;
            }
        }
        if (!primo)
            System.out.println(numero + " è un numero primo!");
        else
            System.out.println(numero + " non è un numero primo!");
        setup.fine();
    }

    static void rand_array() {
        System.out.println("Inserisci il numero di lanci");
        System.out.print("\n");
        funzioni.input();
        System.out.print("\n");

        int lanci = Integer.parseInt(input);
        int conteggio = 0;

        System.out.println("Lancio una moneta " + lanci + " volte");
        System.out.print("\n");

        Random valori = new Random();       // inizializzo il generatore

        for (int i = 0; i < lanci; i++){
            boolean faccia = valori.nextBoolean();      // testa o croce è un valore booleano
            if(faccia){             // se il valore è positivo
                System.out.println("Testa");
                conteggio++;        // aumenta il contatore
            }else if (!faccia){     // se il valore è negativo
                System.out.println("Croce");
            }
        }

        int teste = conteggio;
        int croci = (lanci-conteggio);
        double percT = (100 * (double) teste) / lanci;  // proporzione
        double percC = (100 * (double) croci) / lanci;

        System.out.print("\n");
        System.out.println("Teste: " + teste + ", Croci: " + croci);
        System.out.println("Percentuale T: " + percT + "%, Percentuale C: " + percC + "%");

        setup.fine();
    }

    static void log_curve() {
        System.out.print("\n");
        System.out.print("Digita un numero:");
        System.out.print("\n");
        funzioni.input();

        // to be completed later

        setup.fine();
    }

    static void cesare() {
        System.out.print("\n");
        System.out.print("Digita una frase:");
        System.out.print("\n");
        funzioni.input();
        String frase = input;

        System.out.print("\n");
        System.out.print("Inserisci l'offeset k:");
        System.out.print("\n");
        funzioni.input();
        int k = Integer.parseInt(input);

        System.out.print("\n");
        System.out.print("Scegli se cifrare (c) o decifrare (d):");
        System.out.print("\n");
        funzioni.input();
        String cifdef = null;
        if (input.equals("c")){
            cifdef = "cifrata";
        }else if (input.equals("d")){
            cifdef = "decifrata";
            k = -k;
        }else{
            System.out.print("Non capisco. Ricomincio");
            funzioni.cesare();
        }

        String finale = null;
        String part = "";

        for (int i = 0; i < frase.length(); i++) {
            char character = frase.charAt(i);
            int ascii = (int) character;
            int newascii = ascii + k;
            String l = Character.toString(newascii);
            finale = (part + l);
            part = finale;
        }

        System.out.print("\n");
        System.out.println("La frase " + cifdef + " con k=" + k + " è: \"" + finale + "\"");

        setup.fine();
    }

    static void vigenere() {
        System.out.print("\n");
        System.out.print("Digita una frase:");
        System.out.print("\n");
        funzioni.input();
        String frase = input;

        System.out.print("\n");
        System.out.print("Inserisci la parola k:");
        System.out.print("\n");
        funzioni.input();
        String k = input;

        System.out.print("\n");
        System.out.print("Scegli se cifrare (c) o decifrare (d):");
        System.out.print("\n");
        funzioni.input();
        String cifdef = null;
        boolean c = false;
        if (input.equals("c")){
            cifdef = "cifrata";
            c = true;
        }else if (input.equals("d")){
            cifdef = "decifrata";
            c = false;
        }else{
            System.out.print("Non capisco. Ricomincio");
            funzioni.vigenere();
        }

        String finale = null;
        String part = "";
        int newascii = 0;
        int p=0;

        for (int f = 0; f < frase.length(); f++) {
            char f_character = frase.charAt(f);
            char p_character = k.charAt(p);
            int f_ascii = (int) f_character;
            int p_ascii = ((int) p_character) - 96;
            if (c){
                newascii = f_ascii + p_ascii;
            }else{
                newascii = f_ascii - p_ascii;
            }
            char l = (char)newascii;
            // String l = Character.toString(newascii);
            finale = (part + l);
            part = finale;
            p++;
            if (p >= k.length()){
                p=0;
            }
        }

        System.out.print("\n");
        System.out.println("La frase " + cifdef + " con k=\"" + k + "\" è: \"" + finale + "\"");

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