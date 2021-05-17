package com.resturant.management.oder.model;

import com.resturant.management.item.model.Item;
import com.resturant.management.payment.model.Payment;
import com.resturant.management.user.model.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Payment payment;

    @ManyToMany
    private List<Item> itemList;

    @ManyToOne
    private User user;
}
/*todo
       Resturant
        name
        List of item

* */
