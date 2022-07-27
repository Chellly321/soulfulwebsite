package nl.novi.soulfulwebsite.repository;

import nl.novi.soulfulwebsite.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
