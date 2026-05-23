public class ProgramaConta {

    public static void main(String[] args) {

        // Diretor
        Diretor diretor = new Diretor();
        diretor.setSenha(1234);

        // Gerente
        Gerente gerente = new Gerente();
        gerente.setSenha(5678);

        // Cliente
        Cliente cliente = new Cliente();
        cliente.setSenha(9999);

        // Testes de autenticação
        System.out.println("Diretor: " + diretor.autenticar(1234));

        System.out.println("Gerente: " + gerente.autenticar(5678));

        System.out.println("Cliente: " + cliente.autenticar(9999));
    }
}