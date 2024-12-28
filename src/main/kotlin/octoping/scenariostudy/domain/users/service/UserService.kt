package octoping.scenariostudy.domain.users.service

import octoping.scenariostudy.domain.users.model.User
import octoping.scenariostudy.domain.users.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    @Transactional
    fun createUser() {
        val user = User(
            username = "octoping",
            password = "password",
        )
    }
}
