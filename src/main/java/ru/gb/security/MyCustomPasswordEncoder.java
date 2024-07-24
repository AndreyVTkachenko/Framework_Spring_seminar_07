//package ru.gb.security;
//
//import org.springframework.security.crypto.bcrypt.BCrypt;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.Objects;
//
//@Component
//public class MyCustomPasswordEncoder implements PasswordEncoder {
//
//  @Override
//  public String encode(CharSequence rawPassword) {
//    // md5 sh256 ...
//    return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt());
//  }
//
//  @Override
//  public boolean matches(CharSequence rawPassword, String encodedPassword) {
//    return Objects.equals(encode(rawPassword), encodedPassword);
//  }
//
//}
