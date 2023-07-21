package me.steliosmagalios.prologserver.models

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class Group {

    @Id
    lateinit var id: String

    lateinit var name: String

    @ManyToMany
    @JoinTable(
            name = "group_overlapping",
            joinColumns = [JoinColumn(name = "group_id")],
            inverseJoinColumns = [JoinColumn(name = "overlapping_group_id")]
    )
    lateinit var overlapping: MutableList<Group>

    @ManyToMany(mappedBy = "overlapping")
    lateinit var overlappedBy: MutableList<Group>

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime

    @ManyToMany(mappedBy = "groups")
    lateinit var lectures: MutableList<Lecture>

    constructor() // Needed for JPA
}
