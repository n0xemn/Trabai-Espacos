public class Sala extends Espaco{
    private String tipoDeQuadro;

    public Sala(int id, int capacidade, String nome, double tarifaBase, String tipoDeQuadro){
        super(id, capacidade, nome, tarifaBase);
        this.tipoDeQuadro = tipoDeQuadro;
        Centro.addEspaco(this);
    }

    public double calcularCusto(int hora){
        return hora * super.getTarifaBase();
    }

    @Override
    public String toString(){
        return "ID: "+ super.getID() +"\nNome: "+ super.getNome() +"\nCapacidade: "+ super.getCapacidade() +"\nQuadro: "+ this.tipoDeQuadro +"\nTarifa: "+ super.getTarifaBase();
    }
}