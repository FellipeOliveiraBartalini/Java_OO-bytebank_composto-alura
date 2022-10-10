public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 1900;
        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
    }
}
