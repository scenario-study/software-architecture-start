package octoping.scenariostudy.api.exception

import octoping.scenariostudy.domain.exception.DomainException
import octoping.scenariostudy.domain.exception.NotFoundException
import octoping.scenariostudy.domain.exception.ValidationException
import org.springframework.http.HttpStatus

class HttpException(
    val status: HttpStatus,
    override val message: String,
) : RuntimeException(message) {
    constructor(status: HttpStatus, throwable: Throwable) : this(status, throwable.message ?: "")

    companion object {
        fun from(exception: DomainException): HttpException {
            val code = when (exception) {
                is NotFoundException -> HttpStatus.NOT_FOUND
                is ValidationException -> HttpStatus.BAD_REQUEST
                else -> HttpStatus.INTERNAL_SERVER_ERROR
            }

            return HttpException(code, exception.message)
        }
    }
}
