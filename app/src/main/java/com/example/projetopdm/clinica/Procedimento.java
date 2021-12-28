package com.example.projetopdm.clinica;

public class Procedimento {
    public String nome;
    public String descricao;
    public Integer duracao;
    public Double valor;
//    public static Scanner leitor = new Scanner(System.in);

    public static void criar() {
        System.out.println("Informacoes sobre o procedimento:");

        Procedimento procedimento = new Procedimento();

        //capturar dados de CriarProcedimentoFragment

//        System.out.println("Nome:");
//        procedimento.setNome(leitor.nextLine());
//
//        System.out.println("Descricao:");
//        procedimento.setDescricao(leitor.nextLine());
//
//        System.out.println("Duracao (em minutos):");
//        procedimento.setDuracao(Integer.parseInt(leitor.nextLine()));
//
//        System.out.println("Valor: -no formato XX.xx-");
//        procedimento.setValor(Double.parseDouble(leitor.nextLine()));
//
//        Agenda.listaProcedimentos.add(procedimento);
    }

    public static void editar() {
        listar();

        System.out.println("\n\n Digite o ID do procedimento que deseja editar:");

        //Tornar os edttext de ListaProcedimentos_Fragment editaveis

//        Integer id = Integer.parseInt(leitor.nextLine());
//
//        Procedimento procedimento = Agenda.listaProcedimentos.get(id-1);
//
//        System.out.println("Novo nome:");
//        procedimento.setNome(leitor.nextLine());
//
//        System.out.println("Nova descricao:");
//        procedimento.setDescricao(leitor.nextLine());
//
//        System.out.println("Nova duracao (em minutos):");
//        procedimento.setDuracao(Integer.parseInt(leitor.nextLine()));
//
//        System.out.println("Novo valor: -no formato XX.xx-");
//        procedimento.setValor(Double.parseDouble(leitor.nextLine()));
    }

    public static void listar() {
//        for (int i = 0; i < Agenda.listaProcedimentos.size(); i++) {
//            if (i == 0) {
//                System.out.println("\n------- LISTA DE PROCEDIMENTOS -------\n");
//            }
//            System.out.println("ID: " + (i+1));
//            System.out.println("Nome: " + Agenda.listaProcedimentos.get(i).getNome());
//            System.out.println("Descricao: " + Agenda.listaProcedimentos.get(i).getDescricao());
//            System.out.println("Duracao: " + Agenda.listaProcedimentos.get(i).getDuracao());
//            System.out.println("Valor: R$" + Agenda.listaProcedimentos.get(i).getValor());
//
//            if (i != Agenda.listaProcedimentos.size() - 1) {
//                System.out.println("\n               ..........\n");
//            }
//            if (i == Agenda.listaProcedimentos.size() - 1) {
//                System.out.println("\n****************************************\n");
//            }
//        }

        //puxar do banco de dados os procedimentos e as informações deles e colocar no modelo de procedimento
        //listado em layout>listar_procedimentos_default
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public Double getValor() {
        return valor;
    }
}
