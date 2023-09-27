package com.example.shopandsell.services;

import com.example.shopandsell.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private  final UserRepository USERREPOSITORY;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return USERREPOSITORY.findByEmail(email);
    }
}
