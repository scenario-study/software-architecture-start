plugins {
    kotlin("jvm") version "1.9.25"
    id("com.diffplug.spotless") version "6.25.0"

    kotlin("plugin.spring") version "1.9.25" apply false
    id("org.springframework.boot") version "3.4.1" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
}

group = "com.cd18"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }

    apply(plugin = "com.diffplug.spotless")
    spotless {
        kotlin {
            target("**/*.kt")
            targetExclude("$project/build/**/*.kt")
            ktlint()
        }
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}
