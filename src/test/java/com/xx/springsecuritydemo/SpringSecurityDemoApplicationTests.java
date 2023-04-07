package com.xx.springsecuritydemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityDemoApplicationTests {

    @Test
    public void testPassword(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String enPass = bCryptPasswordEncoder.encode("123");
        System.out.println(enPass);
        System.out.println(bCryptPasswordEncoder.matches("123", enPass));
    }

}
