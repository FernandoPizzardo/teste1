import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Oi, qual o seu nome");
        String s = entrada.next();

        System.out.println("Oi " + s + ", tudo bem?");
    }
}
