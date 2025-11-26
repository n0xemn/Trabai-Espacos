import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        while(true) {
            System.out.println(" -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n\n 1: Espaço \n 2: Usuario \n 3: Reserva \n -------------------------------------------------------------------------------------------------------------- ");
            escolha = scanner.nextInt();
            Centro.limparTerminal();
            switch (escolha) {
                case 1:

                    while (true) {
                        System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Ver lista de Espaços \n 2: Adicionar Espaço novo \n 3: Voltar \n -------------------------------------------------------------------------------------------------------------- ");
                        escolha = scanner.nextInt();
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

                                int idaux, capacidadeaux;
                                String nomeaux, tipoDeQuadraaux, tipoDeQuadroaux;
                                double tarifaaux;
                                boolean temProjetoraux = false;

                                System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Adicionar uma sala \n 2: Adicionar uma quadra \n 3: Adicionar um auditório \n -------------------------------------------------------------------------------------------------------------- ");
                                escolha = scanner.nextInt();
                                Centro.limparTerminal();
                                switch (escolha) {
                                    case 1:

                                        System.out.println("Digite o ID da Sala");
                                        idaux = scanner.nextInt();
                                        System.out.println("Digite a capacidade da Sala");
                                        capacidadeaux = scanner.nextInt();
                                        System.out.println("Digite o nome da Sala");
                                        scanner.nextLine();
                                        nomeaux = scanner.nextLine();
                                        System.out.println("Digite o tipo do quadro da Sala");
                                        tipoDeQuadroaux = scanner.nextLine();
                                        System.out.println("Digite o tarifa da Sala");
                                        tarifaaux = scanner.nextDouble();

                                        Sala sala = new Sala(idaux, capacidadeaux, nomeaux, tarifaaux, tipoDeQuadroaux);
                                        Centro.addEspaco(sala);
                                        Centro.limparTerminal();

                                        break;
                                    case 2:

                                        System.out.println("Digite o ID da Quadra");
                                        idaux = scanner.nextInt();
                                        System.out.println("Digite a capacidade da Quadra");
                                        capacidadeaux = scanner.nextInt();
                                        System.out.println("Digite o nome da Quadra");
                                        scanner.nextLine();
                                        nomeaux = scanner.nextLine();
                                        System.out.println("Digite o tipo da Quadra");
                                        tipoDeQuadraaux = scanner.nextLine();
                                        System.out.println("Digite o tarifa da Quadra");
                                        tarifaaux = scanner.nextDouble();

                                        Quadra quadra = new Quadra(idaux, capacidadeaux, nomeaux, tarifaaux, tipoDeQuadraaux);
                                        Centro.addEspaco(quadra);
                                        Centro.limparTerminal();

                                        break;
                                    case 3:

                                        System.out.println("Digite o ID da Auditório");
                                        idaux = scanner.nextInt();
                                        System.out.println("Digite a capacidade da Auditório");
                                        capacidadeaux = scanner.nextInt();
                                        System.out.println("Digite o nome do Auditório");
                                        scanner.nextLine();
                                        nomeaux = scanner.nextLine();
                                        System.out.println("Digite \"sim\" se tiver projetor e \"nao\" se não tiver projetor no Auditório");
                                        String simnao = scanner.nextLine();
                                        if (simnao.equals("sim")) {
                                            temProjetoraux = true;
                                        }
                                        else if (simnao.equals("nao")) {
                                            temProjetoraux = false;
                                        }
                                        System.out.println(simnao);
                                        System.out.println("Digite o tarifa da Auditório");
                                        tarifaaux = scanner.nextDouble();

                                        Auditorio auditorio = new Auditorio(idaux, capacidadeaux, nomeaux, tarifaaux, temProjetoraux);
                                        Centro.addEspaco(auditorio);
                                        Centro.limparTerminal();

                                        break;
                                    default:

                                        break;
                                }
                                break;

                            default:
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
                        escolha = scanner.nextInt();
                        Centro.limparTerminal();
                        switch (escolha) {
                            case 1:

                                if (Centro.getUsuarios().size() == 0) {
                                    System.out.println("Nenhum Usuário foi cadastrado.");
                                }
                                else {
                                    for (Usuario it : Centro.getUsuarios()) {
                                        it.exibirInfo();
                                    }
                                }
                                break;
                            case 2:

                                int idaux;
                                String nomeaux, emailaux, resposta;
                                boolean flagaux = false;

                                System.out.println("Digite o ID do Usuario");
                                idaux = scanner.nextInt();
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
                        escolha = scanner.nextInt();
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
                                    escolha = scanner.nextInt();
                                    Centro.limparTerminal();
                                    int intTemp, anoaux, mesaux,  diaaux, horaInicioaux, horaaux, contador = 1, escolherUsu, escolherEspa;
                                    DataHora inicio;
                                    Reserva reservaTemp;
                                    switch (escolha) {
                                        case 1:

                                            if (Centro.getEspacos().size() == 0 || Centro.getTotalEspacos() == 0) {
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
                                            escolherUsu = scanner.nextInt(); // pra usar na função get da lista de usuario
                                            
                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente do espaço que você quer reservar. ");
                                            for (Espaco it : Centro.getEspacos()) {
                                                System.out.print(contador +": \n");
                                                it.exibirInfo();
                                                System.out.println(); // só pra ficar bonito
                                                contador++;
                                            }
                                            System.out.println(" -------------------------------------------------------------------------------------------------------------- ");
                                            escolherEspa = scanner.nextInt(); // pra usar no metodo get da lista de espacos

                                            System.out.println("Digite o ano de início da reserva");
                                            anoaux = scanner.nextInt();
                                            System.out.println("Digite o mês de início da reserva");
                                            mesaux = scanner.nextInt();
                                            System.out.println("Digite o dia de início da reserva");
                                            diaaux = scanner.nextInt();
                                            System.out.println("Digite a hora de início da reserva");
                                            horaInicioaux = scanner.nextInt();
                                            System.out.println("Digite a duração em horas da reserva");
                                            horaaux = scanner.nextInt();

                                            inicio = new DataHora(diaaux, mesaux, anoaux, horaInicioaux);
                                            reservaTemp = new Reserva(Centro.getEspacos().get(escolherEspa - 1), Centro.getUsuarios().get(escolherUsu - 1), inicio, horaaux);

                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Deseja confirmar a seguinte reserva? \n -------------------------------------------------------------------------------------------------------------- ");
                                            reservaTemp.exibirInfo();

                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n 1: Confirmar \n 2: Cancelar \n -------------------------------------------------------------------------------------------------------------- ");

                                            intTemp = scanner.nextInt();
                                            Centro.limparTerminal();

                                            if (intTemp == 1) {
                                                reservaTemp.confirmar();
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
                                            idaux = scanner.nextInt();
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
                                            //Centro.addUsuario(usuario); ainda nao

                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente do espaço que você quer reservar. ");
                                            for (Espaco it : Centro.getEspacos()) {
                                                System.out.print(contador +": \n");
                                                it.exibirInfo();
                                                System.out.println(); // só pra ficar bonito
                                                contador++;
                                            }
                                            escolherEspa = scanner.nextInt();

                                            System.out.println("Digite o ano de início da reserva");
                                            anoaux = scanner.nextInt();
                                            System.out.println("Digite o mês de início da reserva");
                                            mesaux = scanner.nextInt();
                                            System.out.println("Digite o dia de início da reserva");
                                            diaaux = scanner.nextInt();
                                            System.out.println("Digite a hora de início da reserva");
                                            horaInicioaux = scanner.nextInt();
                                            System.out.println("Digite a duração em horas da reserva");
                                            horaaux = scanner.nextInt();

                                            inicio = new DataHora(diaaux, mesaux, anoaux, horaInicioaux);
                                            reservaTemp = new Reserva(Centro.getEspacos().get(escolherEspa - 1), usuario, inicio, horaaux);
                                            Centro.limparTerminal();

                                            System.out.println("Deseja confirmar a seguinte reserva?");
                                            reservaTemp.exibirInfo();

                                            System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n 1: Confirmar \n 2: Cancelar \n --------------------------------------------------------------------------------------------------------------");

                                            intTemp = scanner.nextInt();
                                            Centro.limparTerminal();

                                            if (intTemp == 1) {
                                                reservaTemp.confirmar();
                                            }
                                            else {
                                                reservaTemp.cancelar();
                                            }
                                            
                                            break;
                                        default:
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
                                escolherReserva = scanner.nextInt();
                                Centro.removerReservaIndice(escolherReserva - 1);
                                break;
                            default:
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