package octoping.scenariostudy.domain.exception

abstract class DomainException(
    override val message: String,
) : RuntimeException(message)
