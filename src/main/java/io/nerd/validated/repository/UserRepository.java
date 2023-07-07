package io.nerd.validated.repository;

import io.nerd.validated.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
