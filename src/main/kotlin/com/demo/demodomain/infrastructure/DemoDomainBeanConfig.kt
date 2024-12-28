package com.demo.demodomain.infrastructure

import com.demo.demodomain.controller.port.DemoService
import com.demo.demodomain.service.DemoServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DemoDomainBeanConfig {
    @Bean
    fun demoService(): DemoService = DemoServiceImpl()
}
