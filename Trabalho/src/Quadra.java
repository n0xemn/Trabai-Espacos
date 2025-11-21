public class Quadra extends Espaco{
    private String tipoDeQuadra;

    public Quadra(int id, int capacidade, String nome, double tarifaBase, String tipoDeQuadra){
        super(id, capacidade, nome, tarifaBase);
        this.tipoDeQuadra = tipoDeQuadra;
    }

    public double calcularCusto(int hora){
        return hora * super.getTarifaBase();
    }

    @Override
    public String toString(){
        return "ID: "+ super.getID() +"\nNome: "+ super.getNome() +"\nCapacidade: "+ super.getCapacidade() +"\nQuadra: "+ this.tipoDeQuadra +"\nTarifa: "+ super.getTarifaBase();
    }
}