plugins {
    kotlin("jvm") version "1.3.40"
    java
}

group = "de.tfr.presentation"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    
    // Kotlin Scripting - needed for script files
    compile(kotlin("main-kts"))
    
    // Coroutines
    implementation("org.jetbrains.kotlinx","kotlinx-coroutines-core","1.2.2")

    implementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}