package com.example.sqlite_test

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.sqlite_test.GinfContract.Etudiant.SQL_CREATE_TABLE
import com.example.sqlite_test.GinfContract.Etudiant.SQL_DROP_TABLE

class MyDBHelper (context: Context):SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION)
{
    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
        db?.execSQL(SQL_CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
        db?.execSQL(SQL_DROP_TABLE)
        onCreate(db)
    }

    companion object
    {
        const val DATABASE_NAME = "othmane2.db"
        const val DATABASE_VERSION = 2
    }
}