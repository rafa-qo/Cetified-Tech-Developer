package com.example.demo.login;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String password = bCryptPasswordEncoder.encode("password");
        String password2 = bCryptPasswordEncoder.encode("password2");

        // serve para encriptografar a senha. Foram criados 2 usuários para testar as regras de cada role.
        userRepository.save(new AppUser("José", "jose", "josedh@gmail.com", password, AppUserRoles.
                ROLE_USER));
        userRepository.save(new AppUser("João", "jao", "jaodh@gmail.com", password2, AppUserRoles.
                ROLE_ADMIN));


    }
}
