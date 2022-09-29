package com.himanshu.finance.internetbankinguserservice.mapper;

import org.springframework.beans.BeanUtils;

import com.himanshu.finance.internetbankinguserservice.model.dto.User;
import com.himanshu.finance.internetbankinguserservice.model.entity.UserEntity;

public class UserMapper extends BaseMapper<UserEntity, User> {
	@Override
	public UserEntity convertToEntity(User dto, Object... args) {
		UserEntity userEntity = new UserEntity();
		if (dto != null) {
			BeanUtils.copyProperties(dto, userEntity);
		}
		return userEntity;
	}

	@Override
	public User convertToDto(UserEntity entity, Object... args) {
		User user = new User();
		if (entity != null) {
			BeanUtils.copyProperties(entity, user);
		}
		return user;
	}
}