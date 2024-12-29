package octoping.scenariostudy.domain.users.model

data class Username(
    val value: String,
) {
    init {
        require(value.length >= 2) { "사용자 이름은 2글자 이상이어야 합니다" }
    }
}
