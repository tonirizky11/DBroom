package com.example.roomdb;
 /*
    Tanggal Pengerjaan : 1-mei-2020
    Deskripsi Pengerjaan : Mengerjakan class semua yang terdiri class home,login dan register dan interface serta mengisi semua layout
    NIM : 10117150
    Nama: Toni Rizky Awalludin
    Kelas : IF-4
    */

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
