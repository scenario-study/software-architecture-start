package octoping.scenariostudy.persistence.model.users

import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import octoping.scenariostudy.domain.users.model.User
import octoping.scenariostudy.persistence.common.BaseEntity

@Entity
class UserEntity(
    @Column(name = "username", nullable = false)
    var username: String,
    @Embedded
    var password: String,
) : BaseEntity() {
    companion object {
        fun from(user: User) {
            throw NotImplementedError()
            // return UserEntity( )
        }
    }
}
