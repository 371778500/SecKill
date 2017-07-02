package com.yonyou.seckill.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yonyou.seckill.dao.SecKillDao;
import com.yonyou.seckill.dao.SuccessKilledDao;
import com.yonyou.seckill.entity.SecKill;
import com.yonyou.seckill.entity.SuccessKilled;

public class test extends BaseTest {

	//注入Dao实现类依赖
		@Autowired 	
		private SecKillDao seckillDao;
		@Autowired 	
		private SuccessKilledDao successKilledDao;
		
		@Test
		public void testQueryById() throws Exception {
			long id = 1000;
			SecKill seckill = seckillDao.queryById(id);
			System.out.println(seckill.getName());
			System.out.println(seckill);
		}

		@Test
		public void testQueryAll() throws Exception  {
			//Parameter 'offset' not found. Available parameters are [0, 1, param1, param2]
			// java没有保存形参的记录:queryAll(int offset, int limit) -> queryAll(arg1,arg2)
			List<SecKill> seckills = seckillDao.queryAll(0, 100);
			for (SecKill seckill : seckills) {
				System.out.println(seckill);
			}
		}

		@Test
		public void testReduceNumber() throws Exception {
			Date killTime = new Date();
			int updateCount = seckillDao.reduceNumber(1000L, killTime);
			System.out.println("updateCount=" + updateCount);
		}
		
		@Test
		public void testInsertSuccessKilled() throws Exception {
			/**
			 * 第一次:insertCount=1
			 * 第二次:insertCount=0
			 */
			long id = 1001;
			long phone = 13631231234L;
			int insertCount = successKilledDao.insertSuccessKilled(id, phone);
			System.out.println("insertCount=" + insertCount);
		}

		@Test
		public void testQueryByIdWithSeckill() throws Exception {
			long id = 1001;
			long phone = 13631231234L;
			SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
			System.out.println(successKilled);
			System.out.println(successKilled.getSeckill());
		}
		
}
