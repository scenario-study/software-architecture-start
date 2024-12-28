package octoping.scenariostudy.api.controller.users

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @PostMapping("/users")
    fun createUser() {
        println("User created")
    }
}
