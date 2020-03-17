package br.com.manell.wallet.repository;

import br.com.manell.wallet.domains.User;
import br.com.manell.wallet.repositories.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    private static final String EMAIL = "admin@admin.com";

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {

        this.testSave();
    }

    @AfterEach
    public void tearDown() {

        userRepository.deleteAll();
    }

    @Test
    public void testSave() {

        User user = new User(null, "Teste", EMAIL, "admin");
        User response = userRepository.save(user);

        assertNotNull(response);
    }

    @Test
    public void testFindByEmail() {

        User response = userRepository.findByEmail(EMAIL);

        assertTrue(Objects.nonNull(response));
        assertEquals(response.getEmail(), EMAIL);
    }
}
