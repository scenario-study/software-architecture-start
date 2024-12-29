package octoping.scenariostudy.persistence.exception

abstract class PersistenceException(
    override val message: String,
) : RuntimeException(message)
