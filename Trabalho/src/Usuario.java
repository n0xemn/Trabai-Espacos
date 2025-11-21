public class Usuario {
    private Reserva associacao;
    private int id;
    private String nome;
    private String email;
    private boolean flag = false;

    // um construtor de usuario sem uma reserva
    public Usuario(int id, String nome, String email, boolean flag) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.flag = flag;
    }

    // um construtor de usuario com uma reserva
    public Usuario(int id, String nome, String email, boolean flag, Reserva associacao) {
        this(id, nome, email, flag);
        this.associacao = associacao;
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
    }

    public void indicarAssociacao() { // acho que faz mais sentido a associação ser com a reserva que esse usuario tem
        System.out.println("Usuario " + nome + " associa como " + obterTipo());
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

    public boolean getFlag() { 
        return flag; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

    public void setFlag(boolean flag) { 
        this.flag = flag; 
    }
}