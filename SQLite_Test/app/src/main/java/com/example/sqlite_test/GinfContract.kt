package com.example.sqlite_test
import android.provider.BaseColumns

object GinfContract
{
    object Etudiant : BaseColumns
    {
        const val TABLE_NAME = "etudiant"
        const val COLUMN_FIRST_NAME  = "nom"
        const val COLUMN_SECOND_NAME = "prenom"

        const val SQL_CREATE_TABLE = "CREATE TABLE $TABLE_NAME(" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY,"+
                "$COLUMN_FIRST_NAME TEXT," + "$COLUMN_SECOND_NAME TEXT)"

        const val SQL_DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"

    }
}