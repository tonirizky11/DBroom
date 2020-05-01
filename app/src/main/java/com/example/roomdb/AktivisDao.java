package com.example.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

 /*
    Tanggal Pengerjaan : 1-mei-2020
    Deskripsi Pengerjaan : Mengerjakan class semua yang terdiri class home,login dan register dan interface serta mengisi semua layout
    NIM : 10117150
    Nama: Toni Rizky Awalludin
    Kelas : IF-4
    */

@Dao
public interface AktivisDao {

    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity> findByZone(String zona);

}
