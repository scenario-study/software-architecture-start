package com.demo.common.domain.exception

open class BusinessException : RuntimeException {

    constructor(message: String) : super(message)
}
