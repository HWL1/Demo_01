package com.Red_envelopes_demo.Dao;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Demo_t_red_paket_pojo {

	
	 long id;      
	 long user_id ;//

	long  stock;                                
	long  version;                           
	 String note;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	
	
	
}
