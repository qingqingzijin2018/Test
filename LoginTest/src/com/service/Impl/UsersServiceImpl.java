package com.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserssDao;
import com.model.Userss;
import com.service.UsersService;

/**
 * UsersService实现
 * @author fengcong
 *
 */
@Service("usersService")
@Transactional
public class UsersServiceImpl implements UsersService{

	@Resource(name = "userssDao")
	private UserssDao userssDao;

	public UserssDao getUserssDao() {
		return userssDao;
	}

	public void setUserssDao(UserssDao userssDao) {
		this.userssDao = userssDao;
	}
	
	public Userss loginValidate(String username) {
		return this.userssDao.findByUsername(username);
	}
}
