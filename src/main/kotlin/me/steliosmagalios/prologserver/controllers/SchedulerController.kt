package me.steliosmagalios.prologserver.controllers

import me.steliosmagalios.prologserver.models.*
import me.steliosmagalios.prologserver.services.PrologService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SchedulerController(val prologService: PrologService) {
    @PostMapping("/", MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    fun schedule(@RequestBody body: ScheduleRequest): ScheduleResponse {
        return ScheduleResponse(prologService.schedule(body.lectures, body.groups, body.rooms, body.professors))
    }

    data class ScheduleRequest(val lectures: List<Lecture>, val groups: List<Group>, val professors: List<Professor>, val rooms: List<Room>)

    data class ScheduleResponse(val tasks: List<Task>)
}
