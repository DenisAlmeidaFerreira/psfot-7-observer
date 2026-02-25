import java.util.ArrayList;
import java.util.List;

public class Produto {

    private final String nome;

    // ✅ duas listas (uma de cada tipo)
    private final List<DisponibilidadeListener> disponibilidadeListeners = new ArrayList<>();
    private final List<PromocaoListener> promocaoListeners = new ArrayList<>();

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // ✅ (des)interessar - um par por evento
    public void adicionarInteresseDisponibilidade(DisponibilidadeListener listener) {
        disponibilidadeListeners.add(listener);
    }

    public void removerInteresseDisponibilidade(DisponibilidadeListener listener) {
        disponibilidadeListeners.remove(listener);
    }

    public void adicionarInteressePromocao(PromocaoListener listener) {
        promocaoListeners.add(listener);
    }

    public void removerInteressePromocao(PromocaoListener listener) {
        promocaoListeners.remove(listener);
    }

    // ✅ métodos públicos para iniciar os eventos
    public void ficarDisponivel(String link) {
        DisponibilidadeEvent event = new DisponibilidadeEvent(this, link);
        notificarDisponibilidade(event); // chama o privado
    }

    public void entrarEmPromocao(String link, String cupom) {
        PromocaoEvent event = new PromocaoEvent(this, link, cupom);
        notificarPromocao(event); // chama o privado
    }

    // ✅ métodos privados para disparar notificação
    private void notificarDisponibilidade(DisponibilidadeEvent event) {
        for (DisponibilidadeListener l : List.copyOf(disponibilidadeListeners)) {
            l.quandoDisponivel(event);
        }
    }

    private void notificarPromocao(PromocaoEvent event) {
        for (PromocaoListener l : List.copyOf(promocaoListeners)) {
            l.quandoEmPromocao(event);
        }
    }
}