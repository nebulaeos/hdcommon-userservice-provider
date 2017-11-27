package com.holdtime.userservice.service;

import java.util.List;

import com.holdtime.framework.exception.ServiceException;
import com.holdtime.userservice.model.TbUser;


public interface UserService {
	
	public List<TbUser> queryUserList() throws ServiceException;

}
