package com.works.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
public class Customer {

    //@JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Size(min = 3, max = 100)
    @NotEmpty
    @NotNull
    @Column(length = 100)
    private String name;

    @Email
    @Size(min = 5, max = 150)
    @NotEmpty
    @NotNull
    @Column(unique = true, length = 150)
    private String email;



    @NotEmpty
    @NotNull
    @Column(length = 500)
    private String password;

    @Max(99)
    @Min(15)
    @NotNull
    private Integer age;

}
