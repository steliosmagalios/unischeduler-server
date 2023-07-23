package me.steliosmagalios.prologserver.services

import com.parctechnologies.eclipse.CompoundTerm
import com.parctechnologies.eclipse.EclipseEngine
import com.parctechnologies.eclipse.EclipseEngineOptions
import com.parctechnologies.eclipse.OutOfProcessEclipse
import me.steliosmagalios.prologserver.models.*
import org.springframework.stereotype.Service
import java.io.File
import java.util.*

@Suppress("UNCHECKED_CAST")
@Service
class PrologService() {

    private val engine: EclipseEngine

    init {
        val engineOptions = EclipseEngineOptions()
        engineOptions.setUseQueues(false)

        engine = OutOfProcessEclipse(engineOptions)
        engine.compile(File("prolog/scheduler.ecl"))
    }

    fun schedule(lectures: List<Lecture>, groups: List<Group>, rooms: List<Room>, professors: List<Professor>): List<Task> {
        // FIXME: Handle Fail throwing
        val result = engine.rpc("schedule", lectures, professors, groups, rooms, null)

        // we have to parse the tasks like that
        val taskList = ArrayList<Task>()
        for (item in result.arg(5) as LinkedList<CompoundTerm>) {
            taskList.add(convertTermToTask(item))
        }

        return taskList
    }

    private fun convertTermToTask(term: CompoundTerm): Task {
        return Task(term.arg(1)as Int, term.arg(2)as Int, term.arg(3) as Int)
    }
}