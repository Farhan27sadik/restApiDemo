package com.api.restapidemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name", nullable = false)
    String name;
    @Column(name = "email", nullable = false)
    String email;
    @Column(name = "address", nullable = false)
    String address;
    @Column(name = "dob", nullable = true)
    String dob;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
