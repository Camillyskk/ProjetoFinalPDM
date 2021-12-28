//package com.example.projetopdm.usuarios;
//
//public class Adm {
//    public static void listar() {
//        for (int i = 0; i < Agenda.listaAdm.size(); i++) {
//            if (i == 0) {
//                System.out.println("\n------- LISTA DE ADMINISTRADORES -------\n");
//            }
//            System.out.println("Adm nº: " + (i + 1));
//            System.out.println("Nome completo: " + Agenda.listaAdm.get(i).getNome());
//            System.out.println("Nome de usuário: " + Agenda.listaAdm.get(i).getNomeUsuario());
//            System.out.println("Senha: " + Agenda.listaAdm.get(i).getSenha());
//            System.out.println("Email: " + Agenda.listaAdm.get(i).getEmail());
//            System.out.println("Telefone: " + Agenda.listaAdm.get(i).getTelefone());
//
//            if (i != Agenda.listaAdm.size() - 1) {
//                System.out.println("\n             ..........\n");
//            }
//            if (i == Agenda.listaAdm.size() - 1) {
//                System.out.println("\n****************************************\n");
//            }
//        }
//    }
//
//    public static void cadastrar() {
//        Adm administrador = new Adm();
//
//        boolean valido = false;
//        while(!valido){
//            int cont = 0;
//            System.out.println("Nome de usuario:");
//            String addnome = leitor.nextLine();
//            for (Usuario usuarioProcurado : Agenda.usuarios) {
//                if (usuarioProcurado.getNomeUsuario().equals(addnome)) {
//                    System.out.println("Esse usuário já existe, crie outro nome\n");
//                } else{
//                    cont++;
//                }
//            }
//            if(cont == Agenda.usuarios.size()){
//                administrador.setNomeUsuario(addnome);
//                valido = true;
//            }
//        }
//
//        System.out.println("Senha: ");
//        administrador.setSenha(leitor.nextLine());
//        System.out.println("Nome Completo: ");
//        administrador.setNome(leitor.nextLine());
//        System.out.println("Email: ");
//        administrador.setEmail(leitor.nextLine());
//        System.out.println("Telefone: ");
//        administrador.setTelefone(leitor.nextLine());
//
//        Agenda.listaAdm.add(administrador);
//        Agenda.usuarios.add(administrador);
//    }
//
//    public static void deletar() {
//        listar();
//        System.out.println("\n Digite o ID do administrador que deseja deletar:");
//        Integer id = Integer.parseInt(leitor.nextLine());
//
//        for (int i = 0; i < Agenda.usuarios.size(); i++){
//            if(Agenda.usuarios.get(id-1).getNomeUsuario().equals(Agenda.listaAdm.get(id-1).getNomeUsuario())){
//                Agenda.usuarios.remove(i);
//            }
//        }
//        Agenda.listaAdm.remove(id - 1);
//    }
//
//    public static void editar() {
//        Adm adm = (Adm) Agenda.sessao;
//
//        System.out.println("\nNome de usuario atual: " + adm.getNomeUsuario());
//        boolean valido = false;
//        while(!valido){
//            int cont = 0;
//            System.out.println("Novo nome de usuario:");
//            String addnome = leitor.nextLine();
//            for (Usuario usuarioProcurado : Agenda.usuarios) {
//                if (usuarioProcurado.getNomeUsuario().equals(addnome)) {
//                    System.out.println("Esse usuário já existe, crie outro nome\n");
//                } else{
//                    cont++;
//                }
//            }
//            if(cont == Agenda.usuarios.size()){
//                adm.setNomeUsuario(addnome);
//                valido = true;
//            }
//        }
//
//        System.out.println("\nEmail atual: " + adm.getEmail());
//        System.out.println("Novo email:");
//        adm.setEmail(leitor.nextLine());
//
//        System.out.println("\nTelefone atual: " + adm.getTelefone());
//        System.out.println("Novo telefone: ");
//        adm.setTelefone(leitor.nextLine());
//    }
//}
