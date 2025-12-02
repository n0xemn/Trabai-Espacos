import java.util.InputMismatchException;
import java.util.Scanner; // deixar ver as associações dos usuarios

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while(true) {
            System.out.println(" -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n\n 1: Espaço \n 2: Usuario \n 3: Reserva \n -------------------------------------------------------------------------------------------------------------- ");
            try { // caso a pessoa digite uma letra inves de um numero
                escolha = scanner.nextInt();
            }
            catch(InputMismatchException e){
                scanner.nextLine();
                escolha = 0;
            }
            Centro.limparTerminal();

            switch (escolha) {
                case 1:

                    while (true) {
                        System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Ver lista de Espaços \n 2: Adicionar Espaço novo \n 3: Voltar \n -------------------------------------------------------------------------------------------------------------- ");
                        try { // caso a pessoa digite uma letra inves de um numero
                            escolha = scanner.nextInt();
                        }
                        catch(InputMismatchException e){
                            scanner.nextLine();
                            escolha = 0;
                        }
                        Centro.limparTerminal();

                        switch (escolha) {
                            case 1:

                                if (Centro.getTotalEspacos() == 0) {
                                    System.out.println("Nenhum espaço foi cadastrado.");
                                }
                                for (Espaco it : Centro.getEspacos()) {
                                    it.exibirInfo();
                                    System.out.println();
                                }
                                break;
                            case 2:

                                while (true) {
                                    
                                    int idaux, capacidadeaux;
                                    String nomeaux, tipoDeQuadraaux, tipoDeQuadroaux;
                                    double tarifaaux;
                                    boolean temProjetoraux = false;
    
                                    System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Adicionar uma sala \n 2: Adicionar uma quadra \n 3: Adicionar um auditório \n 4: Voltar \n -------------------------------------------------------------------------------------------------------------- ");
                                    try { // caso a pessoa digite uma letra inves de um numero
                                        escolha = scanner.nextInt();
                                    }
                                    catch(InputMismatchException e){
                                        scanner.nextLine();
                                        escolha = 0;
                                    }
                                    Centro.limparTerminal();

                                    switch (escolha) {
                                        case 1:
    
                                            System.out.println("Digite o ID da Sala");
                                            try {
                                                idaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite a capacidade da Sala");
                                            try {
                                                capacidadeaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o nome da Sala");
                                            scanner.nextLine();
                                            nomeaux = scanner.nextLine();
                                            System.out.println("Digite o tipo do quadro da Sala (\"negro\" , \"branco\" ou \"nenhum\")");
                                            tipoDeQuadroaux = scanner.nextLine();
                                            System.out.println("Digite o tarifa da Sala");
                                            try {
                                                tarifaaux = scanner.nextDouble();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
    
                                            Sala sala;
                                            if (tipoDeQuadroaux.equals("negro") || tipoDeQuadroaux.equals("branco")) {
                                                try{
                                                    sala = new Sala(idaux, capacidadeaux, nomeaux, tarifaaux, tipoDeQuadroaux);
                                                    Centro.addEspaco(sala);
                                                    Centro.limparTerminal();
                                                }
                                                catch(IllegalStateException e){
                                                    escolha = 0;
                                                    Centro.limparTerminal();
                                                    System.out.println(e.getMessage());
                                                    break;
                                                }
                                            }
                                            else {
                                                try{
                                                    sala = new Sala(idaux, capacidadeaux, nomeaux, tarifaaux);
                                                    Centro.addEspaco(sala);
                                                    Centro.limparTerminal();
                                                }
                                                catch(IllegalStateException e){
                                                    escolha = 0;
                                                    Centro.limparTerminal();
                                                    System.out.println(e.getMessage());
                                                    break;
                                                }
                                            }
    
                                            break;
                                        case 2:
    
                                            System.out.println("Digite o ID da Quadra");
                                            try {
                                                idaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite a capacidade da Quadra");
                                            try {
                                                capacidadeaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o nome da Quadra");
                                            scanner.nextLine();
                                            nomeaux = scanner.nextLine();
                                            System.out.println("Digite o tipo da Quadra");
                                            tipoDeQuadraaux = scanner.nextLine();
                                            System.out.println("Digite o tarifa da Quadra");
                                            try {
                                                tarifaaux = scanner.nextDouble();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
    
                                            Quadra quadra;
                                            try{
                                                quadra = new Quadra(idaux, capacidadeaux, nomeaux, tarifaaux, tipoDeQuadraaux);
                                                Centro.addEspaco(quadra);
                                                Centro.limparTerminal();
                                            }
                                            catch(IllegalStateException e){
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                System.out.println(e.getMessage());
                                                break;
                                            }
    
                                            break;
                                        case 3:
    
                                            System.out.println("Digite o ID da Auditório");
                                            try {
                                                idaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite a capacidade da Auditório");
                                            try {
                                                capacidadeaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o nome do Auditório");
                                            scanner.nextLine();
                                            nomeaux = scanner.nextLine();
                                            System.out.println("Digite \"sim\" se tiver projetor e \"nao\" se não tiver projetor no Auditório");
                                            String simnao = scanner.nextLine();
                                            if (simnao.equals("sim")) {
                                                temProjetoraux = true;
                                            }
                                            else { // decidi que se a pessoa digitar qualquer coisa menos "sim" entra o false
                                                temProjetoraux = false;
                                            }
                                            System.out.println("Digite o tarifa da Auditório");
                                            try {
                                                tarifaaux = scanner.nextDouble();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
    
                                            Auditorio auditorio;
                                            try{
                                                auditorio = new Auditorio(idaux, capacidadeaux, nomeaux, tarifaaux, temProjetoraux);
                                                Centro.addEspaco(auditorio);
                                                Centro.limparTerminal();
                                            }
                                            catch(IllegalStateException e){
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                System.out.println(e.getMessage());
                                                break;
                                            }
    
                                            break;
                                        default:
                                            if (escolha != 4) {
                                                System.out.println("Escolha inválida.");
                                            }
                                            break;
                                    }
                                    if (escolha == 4) {
                                        break;
                                    }
                                }
                                break;

                            default:
                                if (escolha != 3) {
                                    System.out.println("Escolha inválida.");        
                                }
                                break;
                        }
                        if (escolha == 3) {
                            break;
                        }
                    }
                    break;
                case 2:
                    
                    while (true) {
                        System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Ver lista de Usuarios \n 2: Adicionar Usuario novo \n 3: Voltar \n -------------------------------------------------------------------------------------------------------------- ");
                        try {
                            escolha = scanner.nextInt();
                        }
                        catch(InputMismatchException e){
                            scanner.nextLine();
                            escolha = 0;
                        }
                        Centro.limparTerminal();

                        switch (escolha) {
                            case 1:
                                int contador = 1, escolherUsu;
                                if (Centro.getUsuarios().size() == 0) {
                                    System.out.println("Nenhum Usuário foi cadastrado.");
                                }
                                else {
                                    System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número do usuário se você quer ver a sua lista de reservas");
                                    for (Usuario it : Centro.getUsuarios()) {
                                        System.out.println(contador +":");
                                        it.exibirInfo();
                                        contador++;
                                    }
                                    System.err.println(" ou \"-1\" pra voltar -------------------------------------------------------------------------------------------------------------- \n ");
                                    try {
                                        escolherUsu = scanner.nextInt();
                                    }
                                    catch(InputMismatchException e) {
                                        scanner.nextLine();
                                        escolha = 0;
                                        Centro.limparTerminal();
                                        break;
                                    }
                                    if (escolherUsu == -1) {
                                        break;
                                    }
                                    Centro.getUsuarios().get(escolherUsu - 1).indicarAssociacoes();
                                }
                                break;
                            case 2:

                                int idaux;
                                String nomeaux, emailaux, resposta;
                                boolean flagaux = false;

                                System.out.println("Digite o ID do Usuario");
                                try {
                                    idaux = scanner.nextInt();
                                }
                                catch(InputMismatchException e){
                                    scanner.nextLine();
                                    escolha = 0;
                                    Centro.limparTerminal();
                                    break;
                                }
                                System.out.println("Digite o nome do Usuario");
                                scanner.nextLine();
                                nomeaux = scanner.nextLine();
                                System.out.println("Digite o email do Usuario");
                                emailaux = scanner.nextLine();
                                System.out.println("O Usuario é uma administrador? (responda com \"sim\" ou \"nao\")");
                                resposta = scanner.nextLine();
                                if (resposta.equals("sim")) {
                                    flagaux = true;
                                }
                                else if (resposta.equals("nao")){
                                    flagaux = false;
                                }

                                Usuario usuario = new Usuario(idaux, nomeaux, emailaux, flagaux);
                                Centro.addUsuario(usuario);
                                Centro.limparTerminal();

                                break;
                            default:
                                if (escolha != 3) {
                                    System.out.println("Escolha inválida.");
                                }
                                break;
                        }
                        if (escolha == 3) {
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Ver lista de Reservas \n 2: Adicionar Reserva nova \n 3: Cancelar Reserva \n 4: Voltar \n -------------------------------------------------------------------------------------------------------------- ");
                        try {
                            escolha = scanner.nextInt();
                        }
                        catch(InputMismatchException e){
                            scanner.nextLine();
                            escolha = 0;
                        }
                        Centro.limparTerminal();

                        switch (escolha) {
                            case 1:

                                if (Centro.getTotalReservas() == 0) {
                                    System.out.println("Nenhuma Reserva foi cadastrado.");
                                }
                                else {
                                    for (Reserva it : Centro.getReservas()) {
                                        it.exibirInfo();
                                    }
                                }
                                break;
                            case 2:

                                while (true) {
                                    System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Adicionar uma reserva para um usuario já cadastrado \n 2: Adicionar uma reserva para um novo usuario \n 3: Voltar \n -------------------------------------------------------------------------------------------------------------- ");
                                    try {
                                        escolha = scanner.nextInt();
                                    }
                                    catch(InputMismatchException e){
                                        scanner.nextLine();
                                        escolha = 0;
                                    }
                                    Centro.limparTerminal();

                                    int intTemp, anoaux, mesaux,  diaaux, horaInicioaux, horaaux, contador = 1, escolherUsu, escolherEspa;
                                    DataHora inicio;
                                    Reserva reservaTemp;

                                    switch (escolha) {
                                        case 1:

                                            if (Centro.getUsuarios().size() == 0 || Centro.getTotalEspacos() == 0) {
                                                System.out.println("Impossível fazer uma reserva");
                                                break;
                                            }

                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente ao usuario pra quem você quer fazer a reserva. ");
                                            for (Usuario it : Centro.getUsuarios()) {
                                                System.out.println(contador +": "+ it.getNome());
                                                contador++;
                                            }
                                            System.out.println(" -------------------------------------------------------------------------------------------------------------- "); // só pra ficar bonito
                                            contador = 1;

                                            Usuario usin;
                                            try {
                                                escolherUsu = scanner.nextInt(); // pra usar na função get da lista de usuario
                                                usin = Centro.getUsuarios().get(escolherUsu - 1);
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            catch(IndexOutOfBoundsException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            
                                            
                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente do espaço que você quer reservar. ");
                                            for (Espaco it : Centro.getEspacos()) {
                                                System.out.print(contador +": \n");
                                                it.exibirInfo();
                                                System.out.println(); // só pra ficar bonito
                                                contador++;
                                            }
                                            System.out.println(" -------------------------------------------------------------------------------------------------------------- ");

                                            Espaco espacin;
                                            try {
                                                escolherEspa = scanner.nextInt(); // pra usar no metodo get da lista de espacos
                                                espacin = Centro.getEspacos().get(escolherEspa - 1);
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            catch(IndexOutOfBoundsException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }

                                            System.out.println("Digite o ano de início da reserva");
                                            try {
                                                anoaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o mês de início da reserva");
                                            try {
                                                mesaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o dia de início da reserva");
                                            try {
                                                diaaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite a hora de início da reserva");
                                            try {
                                                horaInicioaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite a duração em horas da reserva");
                                            try {
                                                horaaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }

                                            try{
                                                inicio = new DataHora(diaaux, mesaux, anoaux, horaInicioaux);
                                                reservaTemp = new Reserva(espacin, usin, inicio, horaaux);
                                            }
                                            catch(IllegalStateException e){
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                System.out.println(e.getMessage()); 
                                                break;
                                            }
                                            catch(HorarioInvalidoException e){
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                System.out.println(e.getMessage());
                                                break;
                                            }


                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Deseja confirmar a seguinte reserva? \n -------------------------------------------------------------------------------------------------------------- ");
                                            reservaTemp.exibirInfo();

                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n 1: Confirmar \n 2: Cancelar \n -------------------------------------------------------------------------------------------------------------- ");

                                            intTemp = scanner.nextInt();
                                            Centro.limparTerminal();

                                            if (intTemp == 1) {
                                                try {
                                                    reservaTemp.confirmar();
                                                }
                                                catch(EnumConstantNotPresentException e){
                                                    System.out.println(e.getMessage());
                                                }
                                            }
                                            else {
                                                reservaTemp.cancelar();
                                            }

                                            break;
                                        case 2:

                                            if (Centro.getTotalEspacos() == 0) {
                                                System.out.println("Impossível fazer uma reserva");
                                                break;
                                            }

                                            int idaux;
                                            String nomeaux, emailaux, resposta;
                                            boolean flagaux = false;

                                            System.out.println("Digite o ID do Usuario");
                                            try {
                                                idaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o nome do Usuario");
                                            scanner.nextLine();
                                            nomeaux = scanner.nextLine();
                                            System.out.println("Digite o email do Usuario");
                                            emailaux = scanner.nextLine();
                                            System.out.println("O Usuario é uma administrador? (responda com \"sim\" ou \"nao\"");
                                            resposta = scanner.nextLine();
                                            if (resposta == "sim") {
                                                flagaux = true;
                                            }
                                            else {
                                                flagaux = false;
                                            }

                                            Usuario usuario = new Usuario(idaux, nomeaux, emailaux, flagaux);
                                            
                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente do espaço que você quer reservar. ");
                                            for (Espaco it : Centro.getEspacos()) {
                                                System.out.print(contador +": \n");
                                                it.exibirInfo();
                                                System.out.println(); // só pra ficar bonito
                                                contador++;
                                            }

                                            Espaco espacoin;
                                            try {
                                                escolherEspa = scanner.nextInt();
                                                espacoin = Centro.getEspacos().get(escolherEspa);
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            catch(IndexOutOfBoundsException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            
                                            System.out.println("Digite o ano de início da reserva");
                                            try {
                                                anoaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o mês de início da reserva");
                                            try {
                                                mesaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite o dia de início da reserva");
                                            try {
                                                diaaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite a hora de início da reserva");
                                            try {
                                                horaInicioaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            System.out.println("Digite a duração em horas da reserva");
                                            try {
                                                horaaux = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }

                                            try{
                                                inicio = new DataHora(diaaux, mesaux, anoaux, horaInicioaux);
                                                reservaTemp = new Reserva(espacoin, usuario, inicio, horaaux);
                                            }
                                            catch(IllegalStateException e){
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                System.out.println(e.getMessage()); 
                                                break;
                                            }
                                            catch(HorarioInvalidoException e){
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                System.out.println(e.getMessage());
                                                break;
                                            }
                                            
                                            Centro.limparTerminal();
                                            
                                            System.out.println("Deseja confirmar a seguinte reserva?");
                                            reservaTemp.exibirInfo();
                                            
                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n 1: Confirmar \n 2: Cancelar \n --------------------------------------------------------------------------------------------------------------");
                                            
                                            try {
                                                intTemp = scanner.nextInt();
                                            }
                                            catch(InputMismatchException e){
                                                scanner.nextLine();
                                                escolha = 0;
                                                Centro.limparTerminal();
                                                break;
                                            }
                                            Centro.limparTerminal();
                                            
                                            if (intTemp == 1) {
                                                try {
                                                    reservaTemp.confirmar();
                                                    Centro.addUsuario(usuario);
                                                }
                                                catch(EnumConstantNotPresentException e){
                                                    System.out.println(e.getMessage());
                                                }
                                            }
                                            else {
                                                reservaTemp.cancelar();
                                            }
                                            
                                            break;
                                        default:
                                            if (escolha != 3) {
                                                System.out.println("Escolha inválida.");
                                            }
                                            break;
                                    }
                                    if (escolha == 3) {
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                if (Centro.getTotalReservas() == 0) {
                                    System.out.println("Impossivel cancelar alguma reserva");
                                    break;
                                }
                                int contador = 1, escolherReserva;
                                System.out.println("Digite o número correspondente da reserva que você deseja cancelar");
                                for (Reserva it : Centro.getReservas()) {
                                    System.out.print(contador +": \n");
                                    it.exibirInfo();
                                    contador++;
                                }

                                try{
                                    escolherReserva = scanner.nextInt();
                                    Centro.removerReservaIndice(escolherReserva - 1);
                                }
                                catch(InputMismatchException e){
                                    scanner.nextLine();
                                    escolha = 0;
                                    Centro.limparTerminal();
                                    break;
                                }
                                catch(IndexOutOfBoundsException e){
                                    scanner.nextLine();
                                    escolha = 0;
                                    Centro.limparTerminal();
                                    break;
                                }
                                break;
                            default:
                                if (escolha != 4) {
                                    System.out.println("Escolha inválida.");
                                }
                                break;
                        }
                        if (escolha == 4) {
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }
}