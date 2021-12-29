package com.example.projetopdm.dominios.entidades.repositorios;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.projetopdm.dominios.entidades.Agendamento;

import java.util.ArrayList;
import java.util.List;

public class AgendamentoRepo {

    private SQLiteDatabase conexao;
    public AgendamentoRepo(SQLiteDatabase conexao){
        this.conexao = conexao;
    }

    public void inserir(Agendamento agendamento){

        ContentValues contentValues = new ContentValues();
        contentValues.put("Dia", agendamento.dia);
        contentValues.put("Hora", agendamento.hora);
        contentValues.put("Cliente_ID", agendamento.cliente_id);
        contentValues.put("Procedimento_ID", agendamento.procedimento_id);

        conexao.insertOrThrow("Agendamento", "ID", contentValues);
    }

    public void excluir(int id){

        String[] parametros = new String[1];
        parametros[0] = String.valueOf(id);

        conexao.delete("Agendamento", "ID = ?", parametros);
    }

    public void alterar(Agendamento agendamento){

        ContentValues contentValues = new ContentValues();
        contentValues.put("Dia", agendamento.dia);
        contentValues.put("Hora", agendamento.hora);
        contentValues.put("Cliente_ID", agendamento.cliente_id);
        contentValues.put("Procedimento_ID", agendamento.procedimento_id);

        String[] parametros = new String[1];
        parametros[0] = String.valueOf(agendamento.ID);

        conexao.update("agendamento", contentValues, "ID = ?", parametros);
    }

    public List<Agendamento> buscarAgendamentos() {

        List<Agendamento> agendamentos = new ArrayList<Agendamento>();

        StringBuilder sql = new StringBuilder();

        sql.append("SELECT Dia, Hora, Cliente_ID, Procedimento_ID ");
        sql.append("FROM Agendamento ");

        Cursor resultado = conexao.rawQuery(sql.toString(), null);

        if (resultado.getCount() > 0){
            resultado.moveToFirst();

            do {
                Agendamento agendamento = new Agendamento();

                agendamento.ID = resultado.getInt(resultado.getColumnIndexOrThrow("ID"));
                agendamento.cliente_id = resultado.getInt(resultado.getColumnIndexOrThrow("Cliente_ID"));
                agendamento.procedimento_id = resultado.getInt(resultado.getColumnIndexOrThrow("Procedimento_ID"));
                agendamento.dia = resultado.getString(resultado.getColumnIndexOrThrow("Dia"));
                agendamento.hora = resultado.getString(resultado.getColumnIndexOrThrow("Hora"));

                agendamentos.add(agendamento);

            } while (resultado.moveToNext());
        }
        return null;
    }

    public Agendamento buscarAgendamento(int id){

        Agendamento agendamento = new Agendamento();

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT Dia, Hora, Cliente_ID, Procedimento_ID ");
        sql.append("FROM Agendamento ");
        sql.append("WHERE ID = ?");

        String[] parametros = new String[1];
        parametros[0] = String.valueOf(id);

        Cursor resultado = conexao.rawQuery(sql.toString(), parametros);

        if (resultado.getCount() > 0) {

            resultado.moveToFirst();

            agendamento.ID = resultado.getInt(resultado.getColumnIndexOrThrow("ID"));
            agendamento.cliente_id = resultado.getInt(resultado.getColumnIndexOrThrow("Cliente_ID"));
            agendamento.procedimento_id = resultado.getInt(resultado.getColumnIndexOrThrow("Procedimento_ID"));
            agendamento.dia = resultado.getString(resultado.getColumnIndexOrThrow("Dia"));
            agendamento.hora = resultado.getString(resultado.getColumnIndexOrThrow("Hora"));

            return agendamento;
        }
        return null;
    }
}
