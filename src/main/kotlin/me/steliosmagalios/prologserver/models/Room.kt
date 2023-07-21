package me.steliosmagalios.prologserver.models

import jakarta.persistence.*
import me.steliosmagalios.prologserver.utils.RoomType
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class Room {

    @Id
    lateinit var id: String

    @Column(unique = true)
    lateinit var name: String

    @Enumerated(EnumType.STRING)
    lateinit var type: RoomType

    var capacity: Int = 0

    @ElementCollection
    @CollectionTable(name = "room_availability")
    lateinit var availability: List<Int>

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime

    @OneToMany(mappedBy = "room", cascade = [CascadeType.ALL], orphanRemoval = true)
    lateinit var tasks: MutableList<Task>

    constructor() // Needed for JPA
}
