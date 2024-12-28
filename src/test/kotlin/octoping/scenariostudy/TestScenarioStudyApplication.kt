package octoping.scenariostudy

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<ScenarioStudyApplication>().with(TestcontainersConfiguration::class).run(*args)
}
