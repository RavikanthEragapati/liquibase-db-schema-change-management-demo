package com.eragapati.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_info")
public class UserInfo {
    
    @Id
    @Column(name = "user_id")
    private Integer id;

    @Column(name ="user_name", unique = true, nullable = false)
    private String username;

    @Column(name ="email", unique = true, nullable = false)
    private String email;

}
