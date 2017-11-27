package com.holdtime.userservice.controller;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.holdtime.framework.exception.ServiceException;
import com.holdtime.framework.utils.common.ApiResponseModel;
import com.holdtime.framework.utils.common.ApiResponseModel.ApiResponseResult;
import com.holdtime.userservice.model.TbUser;
import com.holdtime.userservice.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>titUserControllerle</p>
 * <p>Description</p>
 * <p>Company</p>
 * @author sunwei
 * @date 2017年11月14日 上午11:48:57
 */

@Slf4j
@RestController
public class UserController {
	@Resource
	private UserService userService;
	@GetMapping("queryUserList")
	public ApiResponseModel<List<TbUser>> queryUserList(){
		ApiResponseModel<List<TbUser>> apiResponseModel = new ApiResponseModel<List<TbUser>>();
		String msg = "";
		try {
			log.info("调用获取用户列表");
			List<TbUser> list = userService.queryUserList();
			apiResponseModel.setRecord(list);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			msg = "获取用户列表异常！";
			log.error("获取用户列表异常！",e);
		}
		if(StringUtils.hasText(msg)) {
			apiResponseModel.error(ApiResponseResult.ERROR.getCode(), msg);
		}else {
			apiResponseModel.success();
		}
		return apiResponseModel;
	}

}
