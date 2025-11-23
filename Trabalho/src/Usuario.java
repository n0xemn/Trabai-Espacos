import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Reserva> associacoes;
    private int totalAssociacao;
    private int id;
    private String nome;
    private String email;
    private boolean flag = false;

    public Usuario(int id, String nome, String email, boolean flag) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.flag = flag;
        this.totalAssociacao = 0;
        this.associacoes = new ArrayList<>();
    }

    private String obterTipo() {
        if (flag == true) {
            return "Administrador";
        } else {
            return "Comum";
        }
    }

    public void exibirInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Tipo: " + obterTipo());
        System.out.println("Total de Reservas: "+ this.getTotalAssociacao() +"\n");
    }

    public void indicarAssociacoes() {
        for (Reserva it : associacoes) {
            it.exibirInfo();
        }
    }

    public void addAssociacao(Reserva reser){
        this.associacoes.add(reser);
        this.totalAssociacao++;
    }

    public void removeAssociacao(Reserva reser){
        this.associacoes.remove(reser);
    }

    // n sei se vai precisar desses seters e geters todos
    public int getId() { 
        return id; 
    }

    public String getNome() { 
        return nome; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setFlag(boolean flag) { 
        this.flag = flag; 
    }

    public int getTotalAssociacao() {
        return totalAssociacao;
    }
}