public class DisponibilidadeEvent {
    private final Produto produto;
    private final String link;

    public DisponibilidadeEvent(Produto produto, String link) {
        this.produto = produto;
        this.link = link;
    }

    public Produto getProduto() { return produto; }
    public String getLink() { return link; }
}