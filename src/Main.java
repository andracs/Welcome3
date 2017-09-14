public class Main {

    public static void main(String[] args) {

        // Udskriver Hello World og skifter linje
        System.out.println("Hello World!");

        // To variable, den første er tal, den anden er tekst
        int etTal = 4;
        String enTekst = " pølse.";

        // Et loop (løkke) som starter i 0 og går til mindre end 5
        for (int i = 0; i <= 3; i++) {
            System.out.print(i+1); // OBS print skifter ikke til nye linje
            System.out.println(enTekst); // OBS println skifter til ny linje
        }
    }
}
