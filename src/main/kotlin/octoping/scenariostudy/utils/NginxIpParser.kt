package octoping.scenariostudy.utils

import jakarta.servlet.http.HttpServletRequest

fun HttpServletRequest.getForwardedIp(): String {
    val xForwardedFor = this.getHeader("x-forwarded-for")

    return if (xForwardedFor.isNullOrBlank()) {
        this.remoteAddr
    } else {
        xForwardedFor.split(",").first()
    }
}
