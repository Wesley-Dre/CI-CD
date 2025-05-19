import java.util.ArrayList;
import java.util.Scanner;

// Classe que representa um inquilino
class Inquilino {
    String nome;
    String apartamento;
    String telefone;

    public Inquilino(String nome, String apartamento, String telefone) {
        this.nome = nome;
        this.apartamento = apartamento;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Apartamento: " + apartamento);
        System.out.println("Telefone: " + telefone);
        System.out.println("---------------------------");
    }
}

// Classe principal pública (deve estar em um arquivo com o mesmo nome)
public class CadastroInquilinos {
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

        scanner.close();
    }
}

