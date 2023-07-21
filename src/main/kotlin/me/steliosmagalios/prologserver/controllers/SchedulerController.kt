package me.steliosmagalios.prologserver.controllers

import me.steliosmagalios.prologserver.services.PrologService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SchedulerController(val prologService: PrologService) {
    @PostMapping("/", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun schedule(@RequestBody body: ScheduleRequest): Array<String> {
        // Fetch lectures, groups, professors, rooms


        // Call prolog

        return arrayOf(prologService.execute(0, 1));
    }

    data class ScheduleRequest(val id: String, val lectures: Array<String>) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as ScheduleRequest

            if (id != other.id) return false
            return lectures.contentEquals(other.lectures)
        }

        override fun hashCode(): Int {
            var result = id.hashCode()
            result = 31 * result + lectures.contentHashCode()
            return result
        }
    }
}
