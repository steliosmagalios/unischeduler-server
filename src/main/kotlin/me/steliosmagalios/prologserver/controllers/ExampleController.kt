package me.steliosmagalios.prologserver.controllers

import me.steliosmagalios.prologserver.services.PrologService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(val prologService: PrologService) {
    @GetMapping("/", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun schedulerCall(@RequestParam a: Int, @RequestParam b: Int): String {
        return prologService.execute(a, b);
    }
}
