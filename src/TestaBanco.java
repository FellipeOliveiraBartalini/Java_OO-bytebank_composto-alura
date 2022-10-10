public class TestaBanco {

    public static void main(String[] args) {
        Cliente fellipe = new Cliente();
        fellipe.nome = "Fellipe de Oliveira";
        fellipe.cpf = "123.456.789-10";
        fellipe.profissao = "programador";

        Conta contaDoFellipe = new Conta();
        contaDoFellipe.deposita(100);
        contaDoFellipe.titular = fellipe;

        System.out.println(contaDoFellipe.titular.nome);
    }
}
