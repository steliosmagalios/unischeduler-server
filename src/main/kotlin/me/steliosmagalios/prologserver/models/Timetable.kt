package me.steliosmagalios.prologserver.models

import jakarta.persistence.*
import me.steliosmagalios.prologserver.utils.TimetableSemester
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class Timetable {

    @Id
    lateinit var id: String

    lateinit var name: String

    @Enumerated(EnumType.STRING)
    lateinit var semester: TimetableSemester

    @OneToMany(mappedBy = "timetable", cascade = [CascadeType.ALL], orphanRemoval = true)
    lateinit var tasks: MutableList<Task>

    var published: Boolean = false
    var generated: Boolean = false

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime

    constructor() // Needed for JPA
}
