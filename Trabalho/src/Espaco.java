public abstract class Espaco {
    // esses são atributos que ele pediu e são privados pra não serem modificados de forma indesejada
    private int id;
    private int capacidade; // não pode ser negativa
    private String nome; // não pode ser nulo
    private double tarifaBase; // não pode ser negativa

    // um construtor mesmo que não possa usar para instanciar uma classe espaço, ele serve pra ser usado na refatoração
    public Espaco(int id, int capacidade, String nome, double tarifaBase){
        this.id = id;
        this.capacidade = capacidade;
        this.nome = nome;
        this.tarifaBase = tarifaBase;
    }

    // classe abstrata que ele pediu, ela é abstrata pra que todas as subclasses sejam obrigadas a implementar seu proprio calcCusto
    public abstract double calcularCusto(int hora);
    
    public void exibirInfo(){}

    // fiz um get pq o atributo é privado e não tem como acessar de fora sem um metodo
    public double getTarifaBase() {
        return tarifaBase;
    }

    public int getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }
}