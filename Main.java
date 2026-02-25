public class Main {
    public static void main(String[] args) {

        Produto ps5 = new Produto("PlayStation 5");

        Cliente joao = new Cliente("João", "joao@email.com");
        Cliente maria = new Cliente("Maria", "maria@email.com");

        // João quer aviso de disponibilidade
        ps5.adicionarInteresseDisponibilidade(joao);

        // Maria quer aviso de promoção
        ps5.adicionarInteressePromocao(maria);

        // Produto ficou disponível
        ps5.ficarDisponivel("https://loja.com/ps5");

        // Produto entrou em promoção
        ps5.entrarEmPromocao("https://loja.com/ps5", "CUPOM10");
    }
}