package com.yonyou.seckill.dao;

import org.apache.ibatis.annotations.Param;

import com.yonyou.seckill.entity.Successkilled;


public interface SuccesskilledDao {

	/**
	 * 插入购买明细，可过滤重复
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return 插入的行数
	 */
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

	/**
	 * 根据id查询SuccessKilled并携带秒杀产品对象实体
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	Successkilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}