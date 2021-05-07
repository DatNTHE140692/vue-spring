package vn.ghtk.spring_vue.service;

import lombok.RequiredArgsConstructor;
import vn.ghtk.spring_vue.repository.CourseRepo;

@RequiredArgsConstructor
public class CourseService {
    private final CourseRepo courseRepo;
}
