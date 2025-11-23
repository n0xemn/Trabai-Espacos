public class Sala extends Espaco{
    private String tipoDeQuadro;

    public Sala(int id, int capacidade, String nome, double tarifaBase, String tipoDeQuadro){
        super(id, capacidade, nome, tarifaBase);
        this.tipoDeQuadro = tipoDeQuadro;
    }

    public double calcularCusto(int duracaoHoras){
        return duracaoHoras * super.getTarifaBase();
    }

    public void exibirInfo(){
        System.out.println("ID: "+ super.getID() +"\nNome: "+ super.getNome() +"\nCapacidade: "+ super.getCapacidade() +"\nQuadro: "+ this.tipoDeQuadro +"\nTarifa: "+ super.getTarifaBase());
    }
}