package octoping.scenariostudy.domain.users.model

data class Username(
    private val _value: String,
) {
    init {
        require(_value.length >= 2) { "사용자 이름은 2글자 이상이어야 합니다" }
    }

    val value: String
        get() = _value
}
