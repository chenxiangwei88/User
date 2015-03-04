/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved.
 */
package dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entity.Userinfo;

public interface UserinfoDao {
	@Select("select * from userinfo where name=#{name} and password = #{password}")
	public Userinfo selectUserinfo(@Param("name")String name,@Param("password")String password); 

}
