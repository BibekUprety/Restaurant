package com.resturant.management.oder.repository;

import com.resturant.management.oder.model.Orders;
import com.resturant.management.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<Orders> findOrdersByUserId(User id);

   @Query("select sum(i.price) from Orders o join o.itemList i where o.id=?1")
   double totalAmount(Long orderId);
}
