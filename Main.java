
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            ProducersConsumers PC = new ProducersConsumers(5,2,7);
            Scanner scanner = new Scanner(System.in);
            String input;
            System.out.println("");
            System.out.println("Introduceti optiunea dorita:");
            input = scanner.next();
            while (!input.equals("$")) {
                PC.exec(input);
                PC.afisare_taglocatiejeton();
                System.out.println("");
                System.out.println("Introduceti optiunea dorita:");
                input = scanner.next();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}