package io.nerd.validated.service;

import io.nerd.validated.model.User;
import io.nerd.validated.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> fidAll(){
        return userRepository.findAll();
    }
    public User findById(final Long id){
        return userRepository.findById(id).orElseThrow();
    }
    public User insert(final User user){
        return userRepository.save(user);
    }
}
