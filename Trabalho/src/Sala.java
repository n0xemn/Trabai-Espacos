public class Sala extends Espaco{
    private String tipoDeQuadro = "nenhum";

    public Sala(int id, int capacidade, String nome, double tarifaBase){
        super(id, capacidade, nome, tarifaBase);
        if (capacidade < 0 || tarifaBase < 0) {
            throw new IllegalStateException("Capacidade e tarifa base não podem ser negativas.");
        }
    }
    
    public Sala(int id, int capacidade, String nome, double tarifaBase, String tipoDeQuadro){
        this(id, capacidade, nome, tarifaBase);
        if (capacidade < 0 || tarifaBase < 0) {
            throw new IllegalStateException("Capacidade e tarifa base não podem ser negativas.");
        }
        this.tipoDeQuadro = tipoDeQuadro;
    }

    public double calcularCusto(int duracaoHoras){
        if (duracaoHoras < 0) {
            throw new IllegalStateException("Duração não pode ser negativa.");
        }
        double extra = 0;
        if (this.tipoDeQuadro.equals("negro")) { // preco diferente pra cada tipo de quadro
            extra = 4;
        }
        else if (this.tipoDeQuadro.equals("branco")) {
            extra = 6;
        }
        return duracaoHoras * (super.getTarifaBase() + extra);
    }

    public void exibirInfo(){
        System.out.println("ID: "+ super.getID());
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Capacidade: "+ super.getCapacidade());
        System.out.println("Quadro: "+ this.tipoDeQuadro);
        System.out.printf("Tarifa: R$ %.2f\n\n", super.getTarifaBase());
    }
}