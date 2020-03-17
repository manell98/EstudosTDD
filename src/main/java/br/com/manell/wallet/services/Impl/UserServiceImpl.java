package br.com.manell.wallet.services.Impl;

import br.com.manell.wallet.domains.User;
import br.com.manell.wallet.repositories.UserRepository;
import br.com.manell.wallet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {

        return userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {

        return userRepository.findByEmail(email);
    }
}
