package me.steliosmagalios.prologserver.models

import com.parctechnologies.eclipse.AbstractCompoundTerm
import com.parctechnologies.eclipse.EclipseException

class Lecture(private val id: Int, private val duration: Int, private val type: String, private val groups: List<Int>, private val professors: List<Int>) : AbstractCompoundTerm("lecture", 5) {
    override fun arg(index: Int): Any {
        return when (index) {
            1 -> id
            2 -> duration
            3 -> type
            4 -> groups
            5 -> professors
            else -> throw EclipseException()
        }
    }
}

