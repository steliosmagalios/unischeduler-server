package me.steliosmagalios.prologserver.services

import org.springframework.stereotype.Service
import com.parctechnologies.eclipse.EclipseEngine;
import com.parctechnologies.eclipse.EclipseEngineOptions
import com.parctechnologies.eclipse.OutOfProcessEclipse
import java.io.File

@Service
class PrologService() {

    private val engine: EclipseEngine = OutOfProcessEclipse(EclipseEngineOptions())

    init {
        engine.compile(File("program.ecl"))
    }

    fun execute(a: Int, b: Int): String {
        val result = engine.rpc("xor_gate(%d, %d, B)".format(a, b))

        return result.arg(3).toString()
    }

}