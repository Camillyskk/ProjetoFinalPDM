//package com.example.projetopdm.clinica;
//
//public class Agenda {
//    public static ArrayList<Adm> listaAdm = new ArrayList<>();
//    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
//    public static ArrayList<Usuario> usuarios = new ArrayList<>();
//    public static ArrayList<Horario> listaHorarios = new ArrayList<>();
//    public static ArrayList<Procedimento> listaProcedimentos = new ArrayList<>();
//    public static ArrayList<Agendamento> agendamentos = new ArrayList<>();
//
//    public static Usuario sessao;
//    public static Scanner leitor = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        Agenda agenda = new Agenda();
//        Horario.setHorariosPadrao();
//
//        Procedimento p = new Procedimento();
//        p.nome = "esfoliacao";
//        p.descricao = "esfoliar o pe";
//        p.duracao = 30;
//        p.valor = 20.00;
//        listaProcedimentos.add(p);
//
//        Procedimento p1 = new Procedimento();
//        p1.nome = "mao";
//        p1.descricao = "pintar a unha";
//        p1.duracao = 40;
//        p1.valor = 30.00;
//        listaProcedimentos.add(p1);
//
//        Gerente gerente = new Gerente();
//        agenda.usuarios.add(gerente);
//        gerente.setSenha("123");
//        gerente.setNome("dono da porra toda");
//        gerente.setNomeUsuario("chefao");
//
//        // usuarios para fins de teste
//
//        Adm adm1 = new Adm();
//        adm1.setNome("jorge");
//        adm1.setNomeUsuario("jorgin");
//        adm1.setSenha("123");
//
//        Adm adm2 = new Adm();
//        adm2.setSenha("123");
//        adm2.setNomeUsuario("joaninha");
//        adm2.setNome("joana");
//
//
//        Cliente c1 = new Cliente();
//        c1.setNome("jubiscreda");
//        c1.setNomeUsuario("jubiscredinha");
//        c1.setSenha("123");
//
//        Cliente c2 = new Cliente();
//        c2.setNome("cleiton");
//        c2.setNomeUsuario("cleitin");
//        c2.setSenha("123");
//
//        listaClientes.add(c1);
//        listaClientes.add(c2);
//        listaAdm.add(adm1);
//        listaAdm.add(adm2);
//
//        agenda.usuarios.addAll(listaClientes);
//        agenda.usuarios.addAll(listaAdm);
//
//        System.out.println("*****************************************");
//        System.out.println("            I  N  O  V  E");
//
//        String opcao = "";
//        while (!opcao.equals("1")) {
//            opcao = Menu.inicial();
//            switch (opcao) {
//                case "2" -> {
//                    Usuario usu = agenda.login();
//                    sessao = usu;
//                    String escolha = "";
//
//                    if (usu instanceof Gerente) {
//                        while (!escolha.equals("1")){
//                            escolha = Menu.gerente();
//                            Usuario.gerente(escolha);
//                        }
//
//                    } else if (usu instanceof Adm) {
//                        while (!escolha.equals("1")){
//                            escolha = Menu.administrador();
//                            Usuario.administrador(escolha);
//                        }
//
//                    } else if (usu instanceof Cliente) {
//                        while (!escolha.equals("1")){
//                            escolha = Menu.cliente();
//                            Usuario.cliente(escolha);
//                        }
//
//                    } else if (usu == null) {
//                        System.out.println("Parece que voce ainda nao tem uma conta, faca seu cadastro:");
//                        break;
//                    } else {
//                        System.out.println("mas que caraio");
//                    }
//                }
//                case "3" -> Cliente.cadastrar();
//            }
//        }
//        leitor.close();
//    }
//
//    public Usuario login() {
//        System.out.println("Nome de usuario: ");
//        String nomeusuario = leitor.nextLine();
//
//        System.out.println("Senha: ");
//        String senha = leitor.nextLine();
//
//        for (Usuario usuarioProcurado : usuarios) {
//            if (usuarioProcurado.getNomeUsuario().equals(nomeusuario) && usuarioProcurado.getSenha().equals(senha)) {
//                return usuarioProcurado;
//            }
//        }
//        return null;
//    }
//
//    public void listarUsuarios() {
//        Agenda agenda = new Agenda();
//        for (int i = 0; i < agenda.usuarios.size(); i++) {
//            System.out.println(agenda.usuarios.get(i).getNomeUsuario());
//        }
//    }
//}
