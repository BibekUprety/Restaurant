package com.resturant.management.user.model;

import com.resturant.management.oder.model.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/*
* {
	"firstName":"bibjek",
	"lastName":"uprety",
	"email":"abc",
	"password":"pass"
}*/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    private String email;
    private String password;

    @OneToMany
    private List<Orders> ordersList;
}
