package com.Red_envelopes_demo.Dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Red_demo_mapper_face {
	
	/**
	 * ��ȡ�����Ϣ
	 * @param id
	 * @return �����Ϣ
	 */
	
	public Demo_t_red_paket_pojo select_Red(long id);
	
	/**
	 * �ۼ��������
	 * @param id
	 * @return ��������
	 */
	public int  update_red(@Param("id") long id,@Param("version") long version);
	
	
	/**
	 * ������
	 * @param red
	 */
	public  void insert_red(Demo_t_red_paket_pojo red);

}
