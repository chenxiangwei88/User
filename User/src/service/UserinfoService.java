/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved.
 */
package service;

import dao.UserinfoDao;
import entity.Userinfo;

public class UserinfoService {
	public Userinfo selectUserinfo(String name, String password){
		Userinfo userinfo = userinfoDao.selectUserinfo(name, password);
		return userinfo;
	}
	private UserinfoDao userinfoDao;

	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}
	

}
