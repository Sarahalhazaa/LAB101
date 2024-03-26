package com.example.lab10.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @NotEmpty
    @Size(min = 5)
   // @Column(columnDefinition = "varchar(20) not null")
    @Pattern(regexp = "^([A-Za-z])$")
    private String name ;

    @NotEmpty
   // @Column(columnDefinition = " varchar(10) not null")
    private String password ;


    @Email
  //  @Column(columnDefinition = " varchar(40) unique")
    private String email;

    @NotEmpty
   // @Column(columnDefinition = " int not null")
    @Max(21)
    @Digits(integer = 10 ,fraction = 0)
    private Integer age;

    @NotEmpty
    @Pattern(regexp ="^(JOB_SEEKER|EMPLOYER)$")
   // @Column(columnDefinition = "varchar(20) not null check role='JOB_SEEKER' or role='EMPLOYER')")
    private String role;

}
