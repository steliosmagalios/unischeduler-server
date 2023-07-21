package me.steliosmagalios.prologserver.models
import jakarta.persistence.*
import me.steliosmagalios.prologserver.utils.UserRole
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class User {

    @Id
    lateinit var id: String

    @Column(unique = true)
    var externalId: String? = null

    var firstName: String? = null
    var lastName: String? = null

    @Column(unique = true)
    lateinit var email: String

    var imageUrl: String? = null

    @Enumerated(EnumType.STRING)
    lateinit var role: UserRole

    @ElementCollection
    @CollectionTable(name = "user_availability")
    lateinit var availability: List<Int>

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime

    constructor() // Needed for JPA
}