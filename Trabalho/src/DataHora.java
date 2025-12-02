public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;

    public DataHora(int dia, int mes, int ano, int hora) {
        if (dia < 0 || mes < 0 || ano < 0 || hora < 0) {
            throw new IllegalStateException("Ano, mes, dia e hora não podem ser negativos.");
        }
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
}