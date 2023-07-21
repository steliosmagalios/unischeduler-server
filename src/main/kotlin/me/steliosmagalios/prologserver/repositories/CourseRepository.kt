package me.steliosmagalios.prologserver.repositories

import me.steliosmagalios.prologserver.models.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository : JpaRepository<Course, String> {
    // Custom query methods (if needed)
}
