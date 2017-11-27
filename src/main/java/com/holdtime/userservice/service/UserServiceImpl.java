package com.holdtime.userservice.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.holdtime.framework.exception.DaoException;
import com.holdtime.framework.exception.ServiceException;
import com.holdtime.framework.mybatis.dao.DaoHandler;
import com.holdtime.userservice.model.TbUser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private DaoHandler daoHandler;

	@Override
	public List<TbUser> queryUserList() throws ServiceException {
		// TODO Auto-generated method stub
		try {
			return this.daoHandler.find(TbUser.class);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			log.error("查询用户列表异常！",e);
			throw new ServiceException(e);
		}
	}

}
