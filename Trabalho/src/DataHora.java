public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;

    public DataHora(int dia, int mes, int ano, int hora) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    public String formatar() {
        return dia + "/" + mes + "/" + ano + " - " + hora + "h";
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }
    public int getHora() { return hora; }

    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAno(int ano) { this.ano = ano; }
    public void setHora(int hora) { this.hora = hora; }
}