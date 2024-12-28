package com.hunhui.common.error

import jakarta.servlet.http.HttpServletRequest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    private val logger: Logger = LoggerFactory.getLogger(GlobalExceptionHandler::class.java)

    @ExceptionHandler(Exception::class)
    protected fun handleException(e: Exception): ErrorResponse {
        logger.error(e.message, e)
        return ErrorResponse.of(GlobalErrorCode.INTERNAL_SERVER_ERROR)
    }

    @ExceptionHandler(BusinessException::class)
    protected fun handleRuntimeException(e: BusinessException): ErrorResponse {
        logger.warn(e.message, e)
        return ErrorResponse.of(e.errorCode)
    }

    @ExceptionHandler(AccessDeniedException::class)
    protected fun handleAccessDeniedException(
        e: AccessDeniedException,
        request: HttpServletRequest,
    ): ErrorResponse {
        logger.warn(e.message, e)
        return ErrorResponse.of(GlobalErrorCode.ACCESS_DENIED)
    }
}