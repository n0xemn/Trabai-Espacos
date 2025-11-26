import java.util.ArrayList;
import java.util.List;

public class Centro { // ela é estatica pq eu imagino ela como uma classe de servico, quase um banco de dados
    private static List<Espaco> espacos = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();
    private static int totalEspacos = 0;
    private static int totalReservas = 0; // não tem totalUsuarios pq ele não pediu

    public static void addEspaco(Espaco espaco) {
        Centro.espacos.add(espaco);
        Centro.totalEspacos++;
    }

    public static void addUsuario(Usuario usuario) {
        Centro.usuarios.add(usuario);
    }
    
    public static void addReserva(Reserva reserva) {
        Centro.reservas.add(reserva);
        Centro.totalReservas++;
    }

    public static void removeReserva(Reserva reser){
        Centro.reservas.remove(reser);
    }

    public static void removerReservaIndice(int indice){
        Centro.reservas.remove(indice);
    }

    public static boolean verificacao(Reserva reservaTemp){
        for (Reserva it : Centro.reservas) {
            if (it.getEspaco() == reservaTemp.getEspaco()) {
                if (it.getDataHoraInicio().getAno() == reservaTemp.getDataHoraInicio().getAno()) {
                    if (it.getDataHoraInicio().getMes() == reservaTemp.getDataHoraInicio().getMes()) {
                        if (it.getDataHoraInicio().getDia() == reservaTemp.getDataHoraInicio().getDia()) {
                            if (it.getDataHoraInicio().getHora() < reservaTemp.getDataHoraInicio().getHora()) {
                                if (it.getDataHoraInicio().getHora() + it.getDuracaoHoras() >= reservaTemp.getDataHoraInicio().getHora()) {
                                    return true;
                                }
                            }
                            else if (reservaTemp.getDataHoraInicio().getHora() < it.getDataHoraInicio().getHora()) {
                                if (reservaTemp.getDataHoraInicio().getHora() + reservaTemp.getDuracaoHoras() >= it.getDataHoraInicio().getHora()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int getTotalEspacos() {
        return Centro.totalEspacos;
    }

    public static int getTotalReservas() {
        return Centro.totalReservas;
    }

    public static List<Espaco> getEspacos() { // pra poder fazer for each, pra conseguir listar na tela
        return Centro.espacos;
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static List<Reserva> getReservas() {
        return reservas;
    }

    public static void limparTerminal() { // metodo pra limpar o terminal (não fui eu que fiz)
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
        }
    }
}
