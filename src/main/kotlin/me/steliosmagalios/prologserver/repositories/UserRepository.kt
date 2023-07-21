package me.steliosmagalios.prologserver.repositories

import me.steliosmagalios.prologserver.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, String> {
    // Custom query methods (if needed)
}
