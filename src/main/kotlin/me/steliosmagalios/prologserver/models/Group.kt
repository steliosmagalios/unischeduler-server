package me.steliosmagalios.prologserver.models

import com.parctechnologies.eclipse.AbstractCompoundTerm
import com.parctechnologies.eclipse.EclipseException

class Group(private val id: Int, private val size: Int, private val overlapping: List<Int>) : AbstractCompoundTerm("group", 3) {
    override fun arg(index: Int): Any {
        return when (index) {
            1 -> id
            2 -> size
            3 -> overlapping
            else -> throw EclipseException()
        }
    }
}