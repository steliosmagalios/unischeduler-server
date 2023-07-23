package me.steliosmagalios.prologserver.models

import com.parctechnologies.eclipse.AbstractCompoundTerm
import com.parctechnologies.eclipse.EclipseException

class Professor(private val id: Int, private val availability: List<Int>) : AbstractCompoundTerm("professor", 2) {
    override fun arg(index: Int): Any {
        return when (index) {
            1 -> id
            2 -> availability
            else -> throw EclipseException()
        }
    }
}