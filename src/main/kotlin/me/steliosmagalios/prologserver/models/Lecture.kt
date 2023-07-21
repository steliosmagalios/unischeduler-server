package me.steliosmagalios.prologserver.models

import jakarta.persistence.*
import me.steliosmagalios.prologserver.utils.RoomType
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class Lecture {

    @Id
    lateinit var id: String

    lateinit var name: String

    @Enumerated(EnumType.STRING)
    lateinit var type: RoomType

    var duration: Int = 0

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    var course: Course? = null

    @OneToMany(mappedBy = "lecture", cascade = [CascadeType.ALL], orphanRemoval = true)
    lateinit var groups: MutableList<Group>

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime

    @OneToMany(mappedBy = "lecture", cascade = [CascadeType.ALL], orphanRemoval = true)
    lateinit var tasks: MutableList<Task>

    constructor() // Needed for JPA
}
