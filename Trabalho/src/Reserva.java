public class Reserva {
    private Espaco espaco;
    private Usuario usuario;
    private DataHora dataHoraInicio;
    private int duracaoHoras;
    private boolean status;

    public Reserva(Espaco espaco, Usuario usuario, DataHora dataHoraInicio, int duracaoHoras) {
        if (dataHoraInicio.getHora() + duracaoHoras >= 24) {
            // lancar uma excessao
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
            System.out.println("Não foi possivel confirmar a reserva por conta de conflito de horários.");
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
        if (espaco != null) {
            return espaco.calcularCusto(duracaoHoras);
        }
        return 0.0;
    }

    public void exibirInfo(){
        System.out.println("Nome do Espaco: "+ this.espaco.getNome());
        System.out.println("Nome do Usuario: "+ this.usuario.getNome());
        System.out.println("Data e hora do Início: "+ this.dataHoraInicio.formatar()); 
        System.out.println("Tempo de duração: "+ this.duracaoHoras +"h\n");
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

    public void setEspaco(Espaco espaco) { 
        this.espaco = espaco;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDataHoraInicio(DataHora dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}