import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecione uma das opções:\n1 - Converter de decimal para romano.\n2 - Converter de romano para decimal.\n3 - Sair\n");
            int opcao = scanner.nextInt();

            int escolhidoDecimal;
            String escolhidoRomano = null;

            ConversorDecimal conversorDecimal = new ConversorDecimal();
            ConversorRomano conversorRomano = new ConversorRomano();

            if (opcao == 1) {
                System.out.println("\nEntre o número decimal: ");
                escolhidoDecimal = scanner.nextInt();
                String numero = conversorRomano.converteParaRomano(escolhidoDecimal);
                System.out.printf("O número romano correspondente é %s.\n",numero);
            } else if (opcao == 2) {
                System.out.println("\nEntre o número romano: ");
                escolhidoRomano = scanner.next();
                int numero = conversorDecimal.converteParaDecimal(escolhidoRomano);
                System.out.printf("O número decimal correspondente é %s.\n",numero);
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção não incluída na listagem.\nEscolha outra por favor.");
            }
        }
    }
}