public class Quadra extends Espaco{
    private String tipoDeQuadra;

    public Quadra(int id, int capacidade, String nome, double tarifaBase, String tipoDeQuadra){
        super(id, capacidade, nome, tarifaBase);
        if (capacidade < 0 || tarifaBase < 0) {
            throw new IllegalStateException("Capacidade e tarifa base não podem ser negativas.");
        }
        this.tipoDeQuadra = tipoDeQuadra;
    }

    public double calcularCusto(int duracaoHoras){
        if (duracaoHoras < 0) {
            throw new IllegalStateException("Duração não pode ser negativa.");
        }
        return duracaoHoras * super.getTarifaBase();
    }

    public void exibirInfo(){
        System.out.println("ID: "+ super.getID());
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Capacidade: "+ super.getCapacidade());
        System.out.println("Quadra: "+ this.tipoDeQuadra);
        System.out.printf("Tarifa: R$%.2f\n\n", super.getTarifaBase());
    }
}