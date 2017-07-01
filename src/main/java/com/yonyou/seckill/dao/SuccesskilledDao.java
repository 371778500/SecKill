package com.yonyou.seckill.dao;

import org.apache.ibatis.annotations.Param;

import com.yonyou.seckill.entity.Successkilled;


public interface SuccesskilledDao {

	/**
	 * ���빺����ϸ���ɹ����ظ�
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return ���������
	 */
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

	/**
	 * ����id��ѯSuccessKilled��Я����ɱ��Ʒ����ʵ��
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	Successkilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}