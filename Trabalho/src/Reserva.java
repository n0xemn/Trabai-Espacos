public class Reserva {
    private Espaco espaco;
    private Usuario usuario;
    private DataHora dataHoraInicio;
    private int duracaoHoras;
    private boolean status; // confirmado ou nao

    public Reserva(Espaco espaco, Usuario usuario, DataHora dataHoraInicio, int duracaoHoras) {
        if (duracaoHoras <= 0 || duracaoHoras > 8 || dataHoraInicio.getHora() + duracaoHoras >= 24) {
            throw new HorarioInvalidoException("A duaração não pode ser menor ou igual a zero, maior que oito e a reserva não pode passar da meia noite.");
        }
        this.espaco = espaco;
        this.usuario = usuario;
        this.dataHoraInicio = dataHoraInicio;
        this.duracaoHoras = duracaoHoras;
        this.status = false;
    }

    public void confirmar() {
        if (status) {
            System.out.println("Essa reserva já foi confirmada!");
        }
        else if (Centro.verificacao(this)) {
            throw new EspacoIndisponivelException("Não foi possivel confirmar a reserva por conta de conflito de horários.");
            // System.out.println("Não foi possivel confirmar a reserva por conta de conflito de horários.");
        }
        else {
            this.status = true;
            Centro.addReserva(this);
            usuario.addAssociacao(this);
            System.out.println("Reserva confirmada com sucesso!");
        }
    }

    public void cancelar() {
        if (status) {
            this.status = false;
            Centro.removeReserva(this);
            usuario.removeAssociacao(this);
            System.out.println("Reserva cancelada!");
        }
        else {
            System.out.println("Não é possivel cancelar uma reserva que não foi confirmada!");
        }
    }

    public double calcularValor() {
        double custo = 0;
        if (espaco != null) {
            try{
                custo = espaco.calcularCusto(duracaoHoras);
            }
            catch(IllegalStateException e){
                e.getMessage();
            }
            return custo;
        }
        return custo;
    }

    public void exibirInfo(){
        System.out.println("Nome do Espaco: "+ this.espaco.getNome());
        System.out.println("Nome do Usuario: "+ this.usuario.getNome());
        System.out.println("Data e hora do Início: "+ this.dataHoraInicio.formatar()); 
        System.out.println("Tempo de duração: "+ this.duracaoHoras +"h");
        System.out.printf("Valor da reserva: R$ %.2f\n\n", this.calcularValor());
    }

    public Espaco getEspaco() { 
        return espaco;
    }

    public Usuario getUsuario() { 
        return usuario;
    }

    public DataHora getDataHoraInicio() { 
        return dataHoraInicio;
    }

    public int getDuracaoHoras() { 
        return duracaoHoras;
    }

    public boolean isStatus() {
        return status;
    }
}