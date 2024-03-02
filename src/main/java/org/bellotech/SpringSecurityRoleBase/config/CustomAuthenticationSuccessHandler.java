package org.bellotech.SpringSecurityRoleBase.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        var roles = authentication.getAuthorities();

        var role = roles.stream().map(r -> r.getAuthority()).findFirst();

        if (role.orElse("").equals("ROLE_ADMIN")){

            response.sendRedirect("/admin");
        } else if (role.orElse("").equals("ROLE_MANAGER")) {

            response.sendRedirect("/manager");

        }else {

            response.sendRedirect("/error");
        }

    }
}
