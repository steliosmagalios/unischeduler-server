package me.steliosmagalios.prologserver.repositories

import me.steliosmagalios.prologserver.models.Group
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GroupRepository : JpaRepository<Group, String> {
    // Custom query methods (if needed)
}
