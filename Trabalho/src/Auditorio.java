public class Auditorio extends Espaco{
    private boolean temRefletor; // pra saber se tem um refletor ou nao

    public Auditorio(int id, int capacidade, String nome, double tarifaBase, boolean temRefletor){
        super(id, capacidade, nome, tarifaBase); // uma refatoração de construtor pra eviatr usar seters e o codigo ficar grande
        this.temRefletor = temRefletor;
    }

    // o metodo abstrato sendo implementado
    public double calcularCusto(int hora){
        return hora * super.getTarifaBase();
    }

    @Override
    public String toString(){
        return "ID: "+ super.getID() +"\nCapacidade: "+ super.getCapacidade() +"\nNome: "+ super.getNome() +"\nTarifa Base: "+ super.getTarifaBase();
    }
}