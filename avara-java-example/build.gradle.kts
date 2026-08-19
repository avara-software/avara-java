plugins {
    id("avara.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":avara-java-core"))
    implementation(project(":avara-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :avara-java-example:run` to run `Main`
    // Use `./gradlew :avara-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.avarasoftware.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
