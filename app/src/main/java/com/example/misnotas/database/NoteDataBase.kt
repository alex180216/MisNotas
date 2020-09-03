package com.example.notes.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Note::class], version = 1)
abstract class NoteDataBase: RoomDatabase() {

    abstract val noteDAO: NoteDAO

    companion object{
        @Volatile
        private var INSTANCE: NoteDataBase? = null
        fun getInstance(context: Context):NoteDataBase{
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(context.applicationContext,
                        NoteDataBase::class.java,
                        "note_data_base")
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}