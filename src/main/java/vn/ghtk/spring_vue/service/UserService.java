package vn.ghtk.spring_vue.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import vn.ghtk.spring_vue.model.Course;
import vn.ghtk.spring_vue.model.User;
import vn.ghtk.spring_vue.repository.UserRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo repo;

    public ResponseEntity<List<User>> getUserList() {
        List<User> userList = repo.findAll();
        return ResponseEntity.ok(userList);
    }

    public ResponseEntity<List<Course>> getUserCourses(int id) {
        User user = repo.findById(id).orElse(null);
        if(user == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(user.getCourseList());
    }
}
