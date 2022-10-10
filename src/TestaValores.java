public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(12, 1);

        conta.setAgencia(-50);
        conta.setNumero(-130);

        System.out.println(conta.getNumero());

        Conta conta1 = new Conta(12,1);
        Conta conta2 = new Conta(12,1);

        System.out.println(Conta.getTotal());
    }
}
