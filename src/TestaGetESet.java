public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        cliente.setNome("Fellipe");
        conta.setTitular(cliente);

        System.out.println(conta.getTitular()
                                .getNome());
    }
}
