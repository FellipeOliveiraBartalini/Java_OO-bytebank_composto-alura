public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 50;
        conta.deposita(100);

        System.out.println(conta.saldo);

        boolean conseguiuRetirar = conta.saca(100);
        System.out.println(conta.saldo);
        System.out.println(conseguiuRetirar);

        System.out.println();

        Conta outraConta = new Conta();

        boolean conseguiuTransferir = conta.transfere(50, outraConta);
        System.out.println(conta.saldo);
        System.out.println(outraConta.saldo);
        System.out.println(conseguiuTransferir);
    }
}
