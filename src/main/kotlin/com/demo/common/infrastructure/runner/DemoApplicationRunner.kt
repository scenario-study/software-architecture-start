package com.demo.common.infrastructure.runner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["com.demo"])
@SpringBootApplication
class DemoApplicationRunner

fun main(args: Array<String>) {
    runApplication<DemoApplicationRunner>(*args)
}
