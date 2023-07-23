package me.steliosmagalios.prologserver.models

import com.parctechnologies.eclipse.AbstractCompoundTerm
import com.parctechnologies.eclipse.EclipseException


class Task(val lectureId: Int, val roomId: Int, val startTime: Int) : AbstractCompoundTerm("task", 3) {

    override fun arg(index: Int): Any {
        return when (index) {
            1 -> lectureId
            2 -> roomId
            3 -> startTime
            else -> throw EclipseException()
        }
    }



}