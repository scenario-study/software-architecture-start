package com.demo.demodomain.service

import com.demo.demodomain.controller.port.DemoService
import org.springframework.stereotype.Component

class DemoServiceImpl : DemoService {

    override fun getHello(): String {
        return "Hello World"
    }

}
