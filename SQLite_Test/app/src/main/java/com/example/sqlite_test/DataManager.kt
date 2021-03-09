package com.example.sqlite_test

import android.content.ContentValues
import android.provider.BaseColumns
import com.example.sqlite_test.GinfContract.Etudiant.COLUMN_FIRST_NAME
import com.example.sqlite_test.GinfContract.Etudiant.COLUMN_SECOND_NAME
import com.example.sqlite_test.GinfContract.Etudiant.TABLE_NAME

object DataManager
{
    fun insererInformation(myDBHelper: MyDBHelper, id:Int, nom : String, prenom : String)
    {
        val db = myDBHelper.writableDatabase
        val values = ContentValues()
        with(values)
        {
            put("${BaseColumns._ID}", id)
            put("$COLUMN_FIRST_NAME",nom)
            put("$COLUMN_SECOND_NAME", prenom)
        }

        val newROWiD = db?.insert(TABLE_NAME, null, values)
    }

    fun recuperer_tt_Information(myDBHelper: MyDBHelper): ArrayList<Etudiant> {
        val db = myDBHelper.readableDatabase
        val etudiants = ArrayList<Etudiant>()
        val cursor = db.query(
            TABLE_NAME,
            null,
            null,
            null,
            null,
            null,
            null
        )

        with(cursor){
            while (moveToNext())
            {
                val etd_id = getInt(getColumnIndex(BaseColumns._ID))
                val etd_nom = getString(getColumnIndexOrThrow(COLUMN_FIRST_NAME))
                val etd_prenom = getString(getColumnIndexOrThrow(COLUMN_SECOND_NAME))
                etudiants.add(Etudiant(etd_id, etd_nom, etd_prenom))
            }
        }

        return etudiants
    }

    fun delete_information(myDBHelper: MyDBHelper, nom : String)
    {
        val db = myDBHelper.writableDatabase
        val selection = "$COLUMN_FIRST_NAME Like ?"
        val selectionArgs = arrayOf(nom)
        db.delete(
            TABLE_NAME,
            selection,
            selectionArgs
        )
    }

    fun update_information(myDBHelper: MyDBHelper, nom: String)
    {
        val db = myDBHelper.writableDatabase
        val values = ContentValues().apply {
            put("$COLUMN_FIRST_NAME", nom)
        }

        val selection = "$COLUMN_FIRST_NAME LIKE ?"
        val selectionArgs = arrayOf("Khalid")
        val count = db.update(
            TABLE_NAME,
            values,
            selection,
            selectionArgs
        )
    }
}