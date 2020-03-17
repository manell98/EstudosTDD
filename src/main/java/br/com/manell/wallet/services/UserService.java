package br.com.manell.wallet.services;

import br.com.manell.wallet.domains.User;

public interface UserService {

    User save(User user);

    User findByEmail(String email);
}
