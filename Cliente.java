public class Cliente implements DisponibilidadeListener, PromocaoListener {

    private final String nome;
    private final String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void quandoDisponivel(DisponibilidadeEvent event) {
        System.out.println("📩 [" + nome + " - " + email + "]");
        System.out.println("Produto DISPONÍVEL: " + event.getProduto().getNome());
        System.out.println("Link: " + event.getLink());
        System.out.println();
    }

    @Override
    public void quandoEmPromocao(PromocaoEvent event) {
        System.out.println("📩 [" + nome + " - " + email + "]");
        System.out.println("Produto EM PROMOÇÃO: " + event.getProduto().getNome());
        System.out.println("Link: " + event.getLink());
        System.out.println("Cupom: " + event.getCupom());
        System.out.println();
    }
}