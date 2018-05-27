package com.Red_envelopes_demo.Service;

import com.Red_envelopes_demo.Dao.Demo_t_red_paket_pojo;

public interface Red_service_face {
	
	
	/**
	 * ²åÈëºì°ü
	 * @param red_pojo
	 */
	public void insert_red(Demo_t_red_paket_pojo red_pojo);
	
	/**
	 * ÇÀºì°ü
	 * @param red_id
	 * @return
	 */
	public int Rob_red(long red_id,long user_id);
	

}
