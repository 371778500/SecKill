package com.yonyou.seckill.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yonyou.seckill.entity.SecKill;

/**
 * ��ɱ���DAO�ӿ�
 * 
 * @author ���ȷ�
 */
public interface SecKillDao {

	/**
	 * �����
	 * 
	 * @param seckillId
	 * @param killTime
	 * @return ���Ӱ����������>1����ʾ���µļ�¼����
	 */
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

	/**
	 * ����id��ѯ��ɱ����
	 * 
	 * @param seckillId
	 * @return
	 */
	SecKill queryById(long seckillId);

	/**
	 * ����ƫ������ѯ��ɱ��Ʒ�б�
	 * 
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<SecKill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * ʹ�ô洢����ִ����ɱ
	 * 
	 * @param paramMap
	 */
	void killByProcedure(Map<String, Object> paramMap);

}