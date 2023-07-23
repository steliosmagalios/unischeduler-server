package me.steliosmagalios.prologserver.models

import com.parctechnologies.eclipse.AbstractCompoundTerm
import com.parctechnologies.eclipse.EclipseException

class Room(private val id: Int, private val type: String, private val capacity: Int, private val availability: List<Int>) : AbstractCompoundTerm("room", 4) {
    override fun arg(index: Int): Any {
        return when (index) {
            1 -> id
            2 -> type
            3 -> capacity
            4 -> availability
            else -> throw EclipseException()
        }
    }
}