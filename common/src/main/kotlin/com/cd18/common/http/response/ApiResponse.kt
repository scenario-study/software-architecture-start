package com.cd18.common.http.response

import com.cd18.common.http.response.code.BaseSuccessCode
import com.cd18.common.http.response.code.ErrorCode
import com.cd18.common.http.response.code.SuccessCode

data class ApiResponse<T>(
    val status: ApiStatus = ApiStatus.of(BaseSuccessCode.OK),
    val result: T? = null,
)

data class ApiStatus(
    val code: String,
    val message: String,
) {
    companion object {
        fun of(status: SuccessCode): ApiStatus = ApiStatus(status.name, status.message)

        fun of(status: ErrorCode): ApiStatus = ApiStatus(status.name, status.message)

        fun of(
            code: String,
            message: String,
        ): ApiStatus = ApiStatus(code, message)
    }
}
