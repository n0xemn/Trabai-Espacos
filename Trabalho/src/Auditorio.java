public class Auditorio extends Espaco{
    private boolean temRefletor; // pra saber se tem um refletor ou nao

    public Auditorio(int id, int capacidade, String nome, double tarifaBase, boolean temRefletor){
        super(id, capacidade, nome, tarifaBase); // uma refatoração de construtor pra eviatr usar seters e o codigo ficar grande
        if (capacidade < 0 || tarifaBase < 0) { // por algum motivo eu não posso colocar acima da chamada do construtor super
            throw new IllegalStateException("Capacidade e tarifa base não podem ser negativas.");
        }
        this.temRefletor = temRefletor;
    }

    // o metodo abstrato sendo implementado
    public double calcularCusto(int duracaoHoras){
        if (duracaoHoras < 0) {
            throw new IllegalStateException("Duração não pode ser negativa.");
        }
        double extra = 0;
        if (temRefletor) {
            extra = 10;
        }

        return duracaoHoras * (super.getTarifaBase() + extra); 
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
        System.out.printf("Tarifa: R$%.2f\n\n", super.getTarifaBase());
    }
}