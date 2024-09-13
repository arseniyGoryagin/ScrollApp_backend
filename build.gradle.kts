
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "2.0.20"
    id("io.ktor.plugin") version "3.0.0-rc-1"

    kotlin("plugin.serialization") version "2.0.20"
}


tasks{

    shadowJar{
        archiveBaseName.set("com.example")
        archiveVersion.set("0.0.1")
        archiveClassifier.set("all")

    }


}

group = "com.example"
version = "0.0.1"

application {


    mainClass.set("com.example.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {

    val ktor_version = "3.0.0-beta-2"


    //Serialization
    val kotlin_serialization = "1.6.1"
    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlin_serialization")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0")
    implementation("com.squareup.retrofit2:converter-kotlinx-serialization:2.11.0")

    // Ktor serialization
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.x.x")


    // .env
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1") //



    implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")


    implementation("io.ktor:ktor-server-netty:2.x.x")
    implementation("io.ktor:ktor-server-core:2.x.x")
    implementation("io.ktor:ktor-server-host-common:2.x.x")


    implementation("io.ktor:ktor-server-default-headers-jvm")
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-config-yaml")
    testImplementation("io.ktor:ktor-server-test-host-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
