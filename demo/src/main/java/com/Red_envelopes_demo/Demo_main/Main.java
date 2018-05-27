package com.Red_envelopes_demo.Demo_main;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.Red_envelopes_demo.Dao.Demo_t_red_paket_pojo;

import com.Red_envelopes_demo.Service.Red_service_impl;

public class Main {
	
	
	

	public static void main(String[] args) {
		
	
		//Red_service_impl  service = new Red_service_impl();
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/SpringMVC.xml"); 
		//Red_service_impl  service =context.getBean(Red_service_impl.class);
		Demo_t_red_paket_pojo red_pojo=context.getBean(Demo_t_red_paket_pojo.class);
		
		
		
		red_pojo.setNote("note");
	
		red_pojo.setStock(20000l);


		red_pojo.setUser_id(1);
		red_pojo.setVersion(1);
		
//		service.insert_red(red_pojo);
//		
//		for(int i=1;i<10000;i++)
//		{
//			if(service.Rob_red(1, i)==0)
//			{
//				System.out.println("没有红包了");
//			}
//		}
		
		
	}

}
