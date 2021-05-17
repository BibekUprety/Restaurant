package com.resturant.management.security;


import com.resturant.management.user.model.User;
import com.resturant.management.user.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {

    private UserRepository userRepository;

    public CustomUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       User user= userRepository.findUsersByEmail(email);
       CustomUserDetails userDetails =null;
       if (user != null){
          userDetails= new CustomUserDetails();
          userDetails.setUser(user);
       }
       else {
           throw new UsernameNotFoundException("User not found");
       }
       return userDetails;
    }
}
