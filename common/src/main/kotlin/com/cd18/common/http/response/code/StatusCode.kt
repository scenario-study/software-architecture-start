package com.cd18.common.http.response.code

import org.springframework.http.HttpStatus

interface SuccessCode {
    val name: String
    val message: String
}

interface ErrorCode {
    val name: String
    val message: String
    val status: HttpStatus
}
