package com.example.projetopdm.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DadosOpenHelper extends SQLiteOpenHelper {

    public DadosOpenHelper(Context context) {
        super(context, "db_clinica", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptDLL.getCreateTableUsuario());
        db.execSQL(ScriptDLL.getCreateTableADM());
        db.execSQL(ScriptDLL.getCreateTableCliente());
        db.execSQL(ScriptDLL.getCreateTableProcedimento());
        db.execSQL(ScriptDLL.getCreateTableAgendamento());
        db.execSQL(ScriptDLL.getCreateTableNotificacao());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
