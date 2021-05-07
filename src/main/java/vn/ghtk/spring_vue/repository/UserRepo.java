package vn.ghtk.spring_vue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ghtk.spring_vue.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
