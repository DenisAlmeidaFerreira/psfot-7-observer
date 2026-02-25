public class PromocaoEvent {
    private final Produto produto;
    private final String link;
    private final String cupom;

    public PromocaoEvent(Produto produto, String link, String cupom) {
        this.produto = produto;
        this.link = link;
        this.cupom = cupom;
    }

    public Produto getProduto() { return produto; }
    public String getLink() { return link; }
    public String getCupom() { return cupom; }
}