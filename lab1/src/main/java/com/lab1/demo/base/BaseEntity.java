package com.lab1.demo.base;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "created_by")
    public String createdBy;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "updated_by")
    public String updatedBy;
}