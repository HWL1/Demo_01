package com.Red_envelopes_demo.Controller;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Red_envelopes_demo.Dao.Demo_t_red_paket_pojo;
import com.Red_envelopes_demo.Service.Red_service_face;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value="/Demo",method= RequestMethod.GET)
public class Red_controller {
	
	@Resource
	Red_service_face service;
	
	@ResponseBody
	@RequestMapping(value="/insert")
	public void insert_red( HttpServletRequest request,HttpServletResponse response ) {
		
        Demo_t_red_paket_pojo red_pojo=new Demo_t_red_paket_pojo();
		
		red_pojo.setNote("note");
		red_pojo.setStock(20000l);
		red_pojo.setUser_id(1l);
		red_pojo.setVersion(1l);
		
		service.insert_red(red_pojo);
	}
	
	@ResponseBody
	@RequestMapping(value="/Rob_red")
	public String rob_red(@RequestParam("user_id") long user_id,HttpServletRequest request,HttpServletResponse response)
	{
		response.setContentType("text/html;charset=utf-8");
		JSONObject s=new JSONObject();
		int n=0;
		

		
		for(long i=1;i<=20;i++)
		{
			 n=service.Rob_red(1l, i);
		}
		
		
		if(n==0)
		{
			s.put("s1", "ÇÀºì°üÊ§°Ü");
			return s.toJSONString();
		}else {
			s.put("s1", "³É¹¦");
			return s.toJSONString();
		}
	
	}
	

}
