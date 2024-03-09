package org.bellotech.SpringSecurityRoleBase.services;

        import lombok.AllArgsConstructor;
        import org.bellotech.SpringSecurityRoleBase.repository.UserRepository;
        import org.bellotech.SpringSecurityRoleBase.security.SecurityUser;
        import org.springframework.security.core.userdetails.UserDetails;
        import org.springframework.security.core.userdetails.UserDetailsService;
        import org.springframework.security.core.userdetails.UsernameNotFoundException;
        import org.springframework.stereotype.Service;



        //(2) = second stage
@Service
@AllArgsConstructor
public class JpaUserDetailsServices implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) {

        var u = userRepository.findUSerByUsername(username);
        return u.map(SecurityUser::new).orElseThrow( ()-> new UsernameNotFoundException("User Not Found" + username));
    }
}
