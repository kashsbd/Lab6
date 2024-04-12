package edu.miu.prakash.ads.repository;

import edu.miu.prakash.ads.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
