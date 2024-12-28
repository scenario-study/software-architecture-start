package octoping.scenariostudy.domain.users.model

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class Password(
    @Column(name = "password", nullable = false)
    var value: String,
) {
    init {
        require(value.length >= 2) { "비밀번호는 2글자 이상이어야 합니다" }
    }

    fun matches(password: String) = value == password
}
