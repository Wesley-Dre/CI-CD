public class Inquilino {
    private String nome;
    private String apartamento;
    private String telefone;

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
