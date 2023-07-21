package me.steliosmagalios.prologserver.repositories

import me.steliosmagalios.prologserver.models.Lecture
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LectureRepository : JpaRepository<Lecture, String> {
    // Custom query methods (if needed)
}
