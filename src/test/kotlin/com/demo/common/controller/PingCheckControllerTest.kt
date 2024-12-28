package com.demo.common.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

@SpringBootTest
@AutoConfigureMockMvc
class PingCheckControllerTest(
    @Autowired private val mockMvc: MockMvc
) {


    @Test
    fun Ping요청시_응답을_받을_수_있다() {
        //given
        //when
        //then
        mockMvc.perform(get("/ping"))
            .andExpect(status().isOk)
            .andExpect(content().string("pong"))
    }
}
