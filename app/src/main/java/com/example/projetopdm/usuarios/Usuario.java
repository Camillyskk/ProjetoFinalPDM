//package com.example.projetopdm.usuarios;
//
//public class Usuario {
//    public String nomeUsuario;
//    private String senha;
//    public String nome;
//    public String email;
//    public String telefone;
//    public static Scanner leitor = new Scanner(System.in);
//
//    public static void gerente(String option) {
//        switch (option) {
//            case "1" -> {
//                // logout
//                Agenda.sessao = null;
//            }
//
//            case "2" -> {
//                // listar usuarios
//                Adm.listar();
//                Cliente.listar();
//            }
//            case "3" -> {
//                // deletar usuario
//                boolean valido = false;
//                while (valido == false){
//                    System.out.println("Se quiser deletar um cliente digite C, se quiser deletar um admnistrador digite A");
//                    if ("C".equals(Integer.parseInt(leitor.nextLine()))) {
//                        Cliente.deletar();
//                        valido = true;
//                    } else if ("A".equals(Integer.parseInt(leitor.nextLine()))) {
//                        Adm.deletar();
//                        valido = true;
//                    } else {
//                        System.out.println("Valor inválido");
//                    }
//                }
//            }
//
//            case "4" -> {
//                // cadastrar adm
//                Adm.cadastrar();
//            }
//
//            case "5" -> {
//                // criar procedimento
//                Procedimento.criar();
//            }
//
//            case "6" -> {
//                // editar procedimento
//                Procedimento.editar();
//            }
//            case "7" -> Agenda.sessao.trocarSenha();
//        }
//    }
//
//    public static void administrador(String option) {
//        switch (option) {
//            case "1" -> {
//                // logout
//                Agenda.sessao = null;
//            }
//
//            case "2" -> {
//                // listar clientes
//                Cliente.listar();
//            }
//
//            case "3" -> {
//                // editar infos pessoais
//                Adm.editar();
//            }
//
//            case "4" -> {
//                // ver agenda
//                Agendamento.listar();
//            }
//
//            case "5" -> {
//                // ver agenda de cliente
//                Cliente.verHorario();
//            }
//
//            case "6" -> {
//                //remarcar horario
//                Agendamento.editar();
//            }
//
//            case "7" -> Agenda.sessao.trocarSenha();
//        }
//    }
//
//    public static void cliente(String option) {
//        switch (option) {
//            case "1" -> {
//                // logout
//                Agenda.sessao = null;
//            }
//
//            case "2" -> {
//                // editar infos pessoais
//                Cliente.editar();
//            }
//
//            case "3" -> {
//                // ver horarios
//                Cliente.verHorario();
//            }
//
//            case "4" -> {
//                // agendar horario
//                Agendamento.criar();
//            }
//
//            case "5" -> {
//                // remarcar horario
//                Agendamento.editar();
//            }
//
//            case "6" -> {
//                // desmarcar horario
//                Agendamento.deletar();
//                Menu.cliente();
//            }
//
//            case "7" -> {
//                // deletar cadastro
//                Cliente.deletar();
//            }
//
//            case "8" -> Agenda.sessao.trocarSenha();
//        }
//    }
//
//    public boolean trocarSenha() {
//        System.out.println("Digite a senha atual:");
//        String senhaAtual = Agenda.leitor.nextLine();
//        if (senha.equals(senhaAtual)) {
//            System.out.println("Digite a nova senha:");
//            senha = Agenda.leitor.nextLine();
//            return true;
//        }
//        return false;
//    }
//
//    // SETTERS
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setNomeUsuario(String nomeUsuario) {
//        this.nomeUsuario = nomeUsuario;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//
//    public void setTelefone(String telefone) {
//        this.telefone = telefone;
//    }
//
//    // GETTERS
//    public String getNome() {
//        return nome;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getNomeUsuario() {
//        return nomeUsuario;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public String getTelefone() {
//        return telefone;
//    }
//
//}
