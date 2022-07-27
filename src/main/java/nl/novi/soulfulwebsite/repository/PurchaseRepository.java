package nl.novi.soulfulwebsite.repository;

import nl.novi.soulfulwebsite.model.Course;
import nl.novi.soulfulwebsite.model.Purchase;
import nl.novi.soulfulwebsite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    Optional<Purchase> findByCourseAndUser(Course course, User user);

    List<Purchase> findByUser(User user);

}
