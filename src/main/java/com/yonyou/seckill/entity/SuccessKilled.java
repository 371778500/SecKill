package com.yonyou.seckill.entity;

import java.util.Date;
import com.yonyou.seckill.entity.SecKill;;

public class SuccessKilled {

	private long seckillId;

	private long userPhone;

	private short state;

	private Date creteTime;

	// ���һ�ĸ�������
	private SecKill seckill;
	
	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public short getState() {
		return state;
	}

	public void setState(short state) {
		this.state = state;
	}

	public Date getCreteTime() {
		return creteTime;
	}

	public void setCreteTime(Date creteTime) {
		this.creteTime = creteTime;
	}

	public SecKill getSeckill() {
		return seckill;
	}

	public void setSeckill(SecKill seckill) {
		this.seckill = seckill;
	}

	@Override
	public String toString() {
		return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
				+ ", creteTime=" + creteTime + "]";
	}
}