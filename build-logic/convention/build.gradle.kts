plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("buajaMultiplatform") {
            id = "buaja.multiplatform"
            implementationClass = "KotlinMultiplatformLibraryPlugin"
        }
    }
}