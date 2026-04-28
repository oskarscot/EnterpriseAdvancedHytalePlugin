plugins {
    id("java")
}

group = "scot.oskar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.hytale.com/release")
}

dependencies {
    compileOnly("com.hypixel.hytale:Server:2026.03.26-89796e57b")

    // Enterprise libraries only
    annotationProcessor("org.immutables:value:2.12.1")
    compileOnly("org.immutables:value-annotations:2.12.1")
    implementation("io.projectreactor:reactor-core:3.8.5")

}

tasks.test {
    useJUnitPlatform()
}