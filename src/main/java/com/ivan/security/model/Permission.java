package com.ivan.security.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table (name = "t_permissions")
@Getter
@Setter
public class Permission extends BaseEntity implements GrantedAuthority {

    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
