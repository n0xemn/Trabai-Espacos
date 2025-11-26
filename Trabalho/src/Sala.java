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
        System.out.println("ID: "+ super.getID());
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Capacidade: "+ super.getCapacidade());
        System.out.println("Quadro: "+ this.tipoDeQuadro);
        System.out.printf("Tarifa: R$%.2lf\n\n", super.getTarifaBase());
        
    }
}