package me.steliosmagalios.prologserver.models

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class Course {

    @Id
    lateinit var id: String

    @Column(unique = true)
    lateinit var code: String

    lateinit var name: String

    var semester: Int = 0

    @OneToMany(mappedBy = "course", cascade = [CascadeType.ALL], orphanRemoval = true)
    lateinit var lectures: MutableList<Lecture>

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime

    constructor() // Needed for JPA
}