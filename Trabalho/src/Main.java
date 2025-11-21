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
                                    
                                    if (it instanceof Sala) {
                                        System.out.println(((Sala) it).toString());
                                    }
                                    else if (it instanceof Quadra) {
                                        System.out.println(((Quadra) it).toString());
                                    }
                                    else if (it instanceof Auditorio) {
                                        System.out.println(((Auditorio) it).toString());
                                    }
                                }
                                break;
                            case 2:

                                int idaux, capacidadeaux;
                                String nomeaux, tipoDeQuadraaux, tipoDeQuadroaux;
                                double tarifaaux;
                                boolean temProjetoraux = false;

                                System.out.println(" \n -------------------------------------------------------------------------------------------------------------- \n Digite o número correspondente a sua escolha \n 1: Adicionar uma sala \n 2: Adicionar uma quadra \n 3: Adicionar um auditório \n 4: Voltar \n -------------------------------------------------------------------------------------------------------------- ");
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
                                        if (simnao == "sim") {
                                            temProjetoraux = true;
                                        }
                                        else if (simnao == "nao") {
                                            temProjetoraux = false;
                                        }
                                        System.out.println("Digite o tarifa da Auditório");
                                        tarifaaux = scanner.nextDouble();

                                        Auditorio auditorio = new Auditorio(idaux, capacidadeaux, nomeaux, tarifaaux, temProjetoraux);
                                        Centro.addEspaco(auditorio);

                                        break;
                                    default:

                                        break;
                                }
                                if (escolha == 4) {
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
                                    System.out.println("Nenhum espaço foi cadastrado.");
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
                                System.out.println("O Usuario é uma administrador? (responda com \"sim\" ou \"nao\"");
                                resposta = scanner.nextLine();
                                if (resposta == "sim") {
                                    flagaux = true;
                                }
                                else {
                                    flagaux = false;
                                }

                                Usuario usuario = new Usuario(idaux, nomeaux, emailaux, flagaux);
                                Centro.addUsuario(usuario);
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
                    System.out.println(" "+ escolha);
                    break;

                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }
}