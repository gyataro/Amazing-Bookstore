package com.xiwenteoh.bookstore.repository;

import com.xiwenteoh.bookstore.entity.Item.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
