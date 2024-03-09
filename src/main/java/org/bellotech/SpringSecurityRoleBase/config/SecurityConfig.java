package org.bellotech.SpringSecurityRoleBase.config;


//import lombok.var;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {



    /*

    // this is an interface, so we will use the implemetation
    //which is inMemoryUserDetails manager to manage the users

    // so we can add our users insidely
    @Bean
    public UserDetailsService userDetailsService(){

        var userDetailsManager = new InMemoryUserDetailsManager();
// now we define user using spring security user class and userDetail interface
        UserDetails user1 = User.withUsername("john")
                .password("123")
                .authorities("ROLE_ADMIN")
                // to use role by authorities method by adding prefix
                //.authorities("ROLE_ADMIN")
                //use role method by not adding any prefix
              //  .roles("ADMIN")
                .build();
        UserDetails user2 = User.withUsername("mike")
                .password("1234")
                .authorities("ROLE_ MANAGER")
                .build();

// SO NOW LET LINK THIS TO OUR userDetailsManager that we have
        // so we can return it

        userDetailsManager.createUser(user1);
        userDetailsManager.createUser(user2);

        // NEXT NOW IS TO ADD THE PASSWORD ENCODER
return userDetailsManager;

    }
*/


    @Bean
    public PasswordEncoder passwordEncoder(){

        // We are using this bcus our password is plain text and
        // generally this is the implementation for encoding plain text

        return NoOpPasswordEncoder.getInstance();

        // why we use the getUnstance() is bcus this class has no constructor
    }

    /*

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(request -> request
                        // This method permit authority for read
                        // Likewise fr hasAnyAuth
                                //.anyRequest().hasAuthority("READ")

                        // THIS FOR ROLE
                        //We also has for hasanyRole

                                .requestMatchers("/admin").hasRole("ADMIN")
                                .requestMatchers("/manager").hasRole("MANAGER")



                        )
                .formLogin(form -> form
                        .getClass());


        return http.build();

    }

     */
}
