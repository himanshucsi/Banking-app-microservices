package com.himanshu.finance.corebankingservice.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.himanshu.finance.corebankingservice.model.dto.User;
import com.himanshu.finance.corebankingservice.model.entity.UserEntity;
import com.himanshu.finance.corebankingservice.model.mapper.UserMapper;
import com.himanshu.finance.corebankingservice.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private UserMapper userMapper = new UserMapper();

	private final UserRepository userRepository;

	public User readUser(String identification) {
		UserEntity userEntity = userRepository.findByIdentificationNumber(identification).get();
		return userMapper.convertToDto(userEntity);
	}

	public List<User> readUsers(Pageable pageable) {
		return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
	}
}
