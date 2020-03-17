package br.com.manell.wallet.repository;

import br.com.manell.wallet.domains.User;
import br.com.manell.wallet.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {

        User user = new User();
        user.setName("Teste");
        user.setPassword("admin");
        user.setEmail("teste@email.com");

        User response = userRepository.save(user);

        assertNotNull(response);
    }
}
