package com.example.cozmo.crud_mysql_android.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DataKategoriItem{

	@SerializedName("id_kategori")
	private String idKategori;

	@SerializedName("nama_kategori")
	private String namaKategori;

	public void setIdKategori(String idKategori){
		this.idKategori = idKategori;
	}

	public String getIdKategori(){
		return idKategori;
	}

	public void setNamaKategori(String namaKategori){
		this.namaKategori = namaKategori;
	}

	public String getNamaKategori(){
		return namaKategori;
	}
}