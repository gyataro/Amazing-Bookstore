package com.xiwenteoh.bookstore.repository;

import com.xiwenteoh.bookstore.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    Optional<Cart> findCartByUserId(Long userId);
}
