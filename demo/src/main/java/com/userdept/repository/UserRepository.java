package src.main.java.com.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
} 