public class Quadra extends Espaco{
    private String tipoDeQuadra;

    public Quadra(int id, int capacidade, String nome, double tarifaBase, String tipoDeQuadra){
        super(id, capacidade, nome, tarifaBase);
        this.tipoDeQuadra = tipoDeQuadra;
    }

    public double calcularCusto(int hora){
        return hora * super.getTarifaBase();
    }

    public void exibirInfo(){
        System.out.println("ID: "+ super.getID());
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Capacidade: "+ super.getCapacidade());
        System.out.println("Quadra: "+ this.tipoDeQuadra);
        System.out.printf("Tarifa: R$%.2lf\n\n", super.getTarifaBase());
    }
}