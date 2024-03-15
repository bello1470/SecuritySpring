package org.bellotech.SpringSecurityRoleBase.security;

import lombok.AllArgsConstructor;
import org.bellotech.SpringSecurityRoleBase.entities.Authorities;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
// auth set
    private final Authorities authorities;
    @Override
    public String getAuthority() {
        return authorities.getNames();
    }
}
