package com.demo.common.controller

import com.demo.common.domain.exception.BusinessException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler


@ControllerAdvice
class ExceptionControllerAdvice {


    @ExceptionHandler(BusinessException::class)
    fun handleBusinessException(ex: BusinessException): ResponseEntity<String> {
        return ResponseEntity.status(400)
            .body(ex.message!!)
    }
}
