package com.example.projetopdm.usuarios;

import com.example.projetopdm.clinica.Agenda;

public class Adm extends Usuario{
    String cidade;

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

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() { return cidade; }

    public static void cadastrar(Adm adm) {
        Adm administrador = new Adm();

        administrador.setNome(adm.nome);
        administrador.setSobrenome(adm.sobrenome);
        administrador.setTelefone(adm.telefone);
        administrador.setCidade(adm.cidade);
        administrador.setEmail(adm.email);
        administrador.setSenha(adm.getSenha());

        Agenda.listaAdm.add(administrador);
        Agenda.usuarios.add(administrador);
    }



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
}
