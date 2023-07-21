package me.steliosmagalios.prologserver.repositories

import me.steliosmagalios.prologserver.models.Room
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoomRepository : JpaRepository<Room, String> {
    // Custom query methods (if needed)
}
