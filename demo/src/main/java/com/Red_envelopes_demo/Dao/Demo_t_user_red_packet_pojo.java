package com.Red_envelopes_demo.Dao;

import java.sql.Timestamp;

public class Demo_t_user_red_packet_pojo {
	
	
	long id;   
	long  red_packet_id;
	long user_id; 
    //float amount;  //alter table t_user_red_packet drop column amount;
    //Timestamp grab_time  ;//alter table t_user_red_packet drop column grab_time
    String note;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRed_packet_id() {
		return red_packet_id;
	}
	public void setRed_packet_id(long red_packet_id) {
		this.red_packet_id = red_packet_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}  


	
}
