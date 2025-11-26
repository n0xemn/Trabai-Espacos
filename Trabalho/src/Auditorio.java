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

    public void exibirInfo(){
        String refletor;
        if (temRefletor) {
            refletor = "sim";
        }
        else {
            refletor = "nao";
        }
        System.out.println("ID: "+ super.getID());
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Capacidade: "+ super.getCapacidade());
        System.out.println("Refletor: "+ refletor);
        System.out.printf("Tarifa: R$%.2lf\n\n", super.getTarifaBase());
    }
}