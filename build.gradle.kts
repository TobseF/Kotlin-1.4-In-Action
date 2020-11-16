import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    java
}

group = "de.tfr.presentation"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // Coroutines
    implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.4.1")

    // Tests
    testImplementation(kotlin("test-junit5"))
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}
val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    // Support inline classes
    freeCompilerArgs = listOf("-Xinline-classes")
}