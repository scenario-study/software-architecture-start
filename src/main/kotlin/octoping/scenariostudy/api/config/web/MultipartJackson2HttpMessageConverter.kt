package octoping.scenariostudy.api.config.web

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.MediaType
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter
import org.springframework.stereotype.Component
import java.lang.reflect.Type

/**
 * Converter for support http request with header Content-Type: multipart/form-data
 */
@Component
class MultipartJackson2HttpMessageConverter(
    objectMapper: ObjectMapper,
) : AbstractJackson2HttpMessageConverter(objectMapper, MediaType.APPLICATION_OCTET_STREAM) {
    override fun canWrite(clazz: Class<*>, mediaType: MediaType?) = false

    override fun canWrite(type: Type?, clazz: Class<*>, mediaType: MediaType?) = false

    override fun canWrite(mediaType: MediaType?) = false
}
