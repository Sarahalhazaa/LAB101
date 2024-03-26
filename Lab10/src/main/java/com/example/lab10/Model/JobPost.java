package com.example.lab10.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class JobPost {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @NotEmpty
    @Size(min = 5)
  //  @Column(columnDefinition = " varchar(10) CHECK (LENGTH(name) > 4) not null")
    private String title ;

    @NotEmpty
  //  @Column(columnDefinition = "varchar(40) not null")
    private String description ;

    @NotEmpty
   // @Column(columnDefinition = "varchar(20) not null")
    private String location ;

    @NotNull
    @Positive
  //  @Column(columnDefinition = " int not null")
    private Integer salary;


    private Date postingDate;

}
