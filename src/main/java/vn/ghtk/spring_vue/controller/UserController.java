package vn.ghtk.spring_vue.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.ghtk.spring_vue.model.Course;
import vn.ghtk.spring_vue.model.User;
import vn.ghtk.spring_vue.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:8080"})
public class UserController {
    private final UserService service;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getUserList() {
        return service.getUserList();
    }

    @GetMapping("/{id}/courses")
    public ResponseEntity<List<Course>> getUserCourses(@PathVariable int id) {
        return service.getUserCourses(id);
    }
}
