package com.Red_envelopes_demo.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Red_envelopes_demo.Dao.Demo_t_red_paket_pojo;
import com.Red_envelopes_demo.Dao.Demo_t_user_red_packet_pojo;
import com.Red_envelopes_demo.Dao.Red_demo_mapper_face;
import com.Red_envelopes_demo.Dao.user_red_mapper_face;

@Service
public class Red_service_impl implements Red_service_face{

	
	@Resource
	Red_demo_mapper_face  red;
	@Resource
	user_red_mapper_face user;
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public void insert_red(Demo_t_red_paket_pojo red_pojo) {
		
		red.insert_red(red_pojo);
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public int Rob_red(long red_id,long user_id) {
		int F=0;
		long version=0;
		
		Demo_t_user_red_packet_pojo user_red=new Demo_t_user_red_packet_pojo();
	
		while(true) {
			
		Demo_t_red_paket_pojo red_pojo=red.select_Red(red_id);

		version=red_pojo.getVersion();
		
		if(red_pojo.getStock()>0)
		{
			if(red.update_red(red_id,version)==1)
		{
				
				System.out.println(user_id+" "+version);
				user_red.setId(1l);
				user_red.setRed_packet_id(red_pojo.getId());
				user_red.setUser_id(user_id);
				user_red.setNote("note");
		
				
				user.insert_user_red(user_red);
			
				return 1;
			}
		}else {
			return 0;
		}
		
		}
	}

}
