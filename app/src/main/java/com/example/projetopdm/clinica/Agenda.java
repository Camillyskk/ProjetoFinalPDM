package com.example.projetopdm.clinica;

import com.example.projetopdm.clinica.Horario;
import com.example.projetopdm.usuarios.Adm;
import com.example.projetopdm.usuarios.Cliente;
import com.example.projetopdm.usuarios.Gerente;
import com.example.projetopdm.usuarios.Usuario;


import java.util.ArrayList;

public class Agenda extends Horario {
    public static ArrayList<Adm> listaAdm = new ArrayList<>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Horario> listaHorarios = new ArrayList<>();
    public static ArrayList<Procedimento> listaProcedimentos = new ArrayList<>();
    public static ArrayList<Agendamento> agendamentos = new ArrayList<>();

//    public static Usuario sessao;
//    public static Scanner leitor = new Scanner(System.in);
//
    public static void main(String[] args) {
//
//        Agenda agenda = new Agenda();
        Horario.setHorariosPadrao();

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");
        gerente.setSobrenome("hdjkahdjkah");
        gerente.setEmail("gerente@gmail.com");
        gerente.setSenha("12345678");

        usuarios.add(gerente);

    }

//    public static String login(Usuario usuario){
//        Usuario usu = autenticarUsuario(usuario);
//        if (usu instanceof Gerente) {
//            return "gerente";
//
//        } else if (usu instanceof Adm) {
//            return "adm";
//
//        } else if (usu instanceof Cliente) {
//            return "cliente";
//
//        } else if (usu == null) {
//          return "sem cadastro";
//                    }
//        return "";
//    }


    public static Usuario autenticarUsuario(Usuario usu) {
        for (Usuario usuarioProcurado : usuarios) {
            if (usuarioProcurado.getEmail().equals(usu.getEmail()) && usuarioProcurado.getSenha().equals(usu.getSenha())) {
                return usuarioProcurado;
            }
        }
        return null;
    }
//
//    public void listarUsuarios() {
//        Agenda agenda = new Agenda();
//        for (int i = 0; i < agenda.usuarios.size(); i++) {
//            System.out.println(agenda.usuarios.get(i).getNomeUsuario());
//        }
//    }
}
