package com.sibersih.app.repositories;

import com.sibersih.app.entity.Roles;
import com.sibersih.app.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByRole(Roles role);
    Optional<Users> findByUsername(String username);
}
