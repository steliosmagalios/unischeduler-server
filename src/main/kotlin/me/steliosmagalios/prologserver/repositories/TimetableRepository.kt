package me.steliosmagalios.prologserver.repositories

import me.steliosmagalios.prologserver.models.Timetable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TimetableRepository : JpaRepository<Timetable, String> {
    // Custom query methods (if needed)
}
