package com.demo.demodomain.controller

import com.demo.demodomain.controller.port.DemoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val demoService: DemoService
) {


    @GetMapping("/hello")
    fun hello(): ResponseEntity<String> {
        val result = demoService.getHello()
        return ResponseEntity.ok(result);
    }

}
