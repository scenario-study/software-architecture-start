package octoping.scenariostudy.domain.users.repository

import octoping.scenariostudy.domain.users.model.User

interface UserRepository {
    fun findById(id: Long): User?

    fun save(user: User): User
}
