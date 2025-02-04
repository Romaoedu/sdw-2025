package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class UserServiceImpl implements UserService {
	

	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {this.userRepository = userRepository;}
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	
	}
	
	@Override
	public User create(User userToCreate) {
		return userRepository.save(userToCreate);
	}
	
	@Override
	public User update(Long id, User UserUpdate) {
		return update(id, UserUpdate);
	}
	
	@Override
	public void delete(Long id) {
		 userRepository.deleteById(id);
	
	}
	

	
}
