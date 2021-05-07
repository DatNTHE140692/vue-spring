package vn.ghtk.spring_vue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ghtk.spring_vue.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {
}
