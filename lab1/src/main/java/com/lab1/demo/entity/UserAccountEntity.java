package com.lab1.demo.entity;

import com.lab1.demo.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "user_account")
public class UserAccountEntity extends BaseEntity {

    @Column(name = "user_account")
    private String userAccount;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "status")
    private Boolean status;
}
