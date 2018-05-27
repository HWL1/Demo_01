package com.Red_envelopes_demo.Dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Red_demo_mapper_face {
	
	/**
	 * 获取红包信息
	 * @param id
	 * @return 红包信息
	 */
	
	public Demo_t_red_paket_pojo select_Red(long id);
	
	/**
	 * 扣减红包数量
	 * @param id
	 * @return 更新数量
	 */
	public int  update_red(@Param("id") long id,@Param("version") long version);
	
	
	/**
	 * 插入红包
	 * @param red
	 */
	public  void insert_red(Demo_t_red_paket_pojo red);

}
