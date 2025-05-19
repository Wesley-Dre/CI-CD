import java.util.ArrayList;
import java.util.Scanner;

public class Ci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Inquilino> listaInquilinos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Cadastro de Inquilino ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Número do Apartamento: ");
            String apartamento = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            Inquilino inquilino = new Inquilino(nome, apartamento, telefone);
            listaInquilinos.add(inquilino);

            System.out.print("Deseja cadastrar outro inquilino? (s/n): ");
            String opcao = scanner.nextLine();
            if (!opcao.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\n=== Lista de Inquilinos Cadastrados ===");
        for (Inquilino i : listaInquilinos) {
            i.exibirDados();
        }
        aaaaaaa22
        scanner.close();
    }
}
