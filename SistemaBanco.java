public class SistemaBanco {
    public static void main(String[] args) {
        try {
            Usuario u = new Usuario("Carlos", -25); // Vai lançar exceção
            u.setConta(new Conta(12345));
            u.getConta().depositar(-100); // Vai lançar exceção
            u.getConta().sacar(50); // Não será executado se exceção acima ocorrer
            System.out.println("Usuário: " + u.getNome() + ", Idade: " + u.getIdade());
            System.out.println("Conta: " + u.getConta().getNumeroConta() + ", Saldo: " + u.getConta().getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
