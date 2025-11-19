public class Reserva {
    private Espaco espaco;
    private Usuario usuario;
    private String dataHoraInicio; // acho que é melhor fazer uma classe pra isso, pra ser melhor de fazer a verificação
    private int duracaoHoras;
    private boolean status;

    public Reserva(Espaco espaco, Usuario usuario, String dataHoraInicio, int duracaoHoras) {
        this.espaco = espaco;
        this.usuario = usuario;
        this.dataHoraInicio = dataHoraInicio;
        this.duracaoHoras = duracaoHoras;
        this.status = false;
    }

    public void confirmar() {
        this.status = true;
        System.out.println("Reserva confirmada com sucesso!");
    }

    public void cancelar() {
        this.status = false;
        System.out.println("Reserva cancelada!");
    }

    public double calcularValor() {
        if (espaco != null) {
            return espaco.calcularCusto(duracaoHoras);
        }
        return 0.0;
    }
    
    public Espaco getEspaco() { 
       return espaco; 
    }

    public Usuario getUsuario() { 
       return usuario; 
    }

    public String getDataHoraInicio() { 
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

    public void setDataHoraInicio(String dataHoraInicio) { 
     this.dataHoraInicio = dataHoraInicio; 
    }

    public void setDuracaoHoras(int duracaoHoras) { 
     this.duracaoHoras = duracaoHoras; 
    }

    public void setStatus(boolean status) { 
     this.status = status; 
    }
}