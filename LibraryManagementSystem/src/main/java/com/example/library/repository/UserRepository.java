package com.example.library.repository;

import com.example.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    // You can add custom query methods here if needed
    User fidByEmail(String email);
}
