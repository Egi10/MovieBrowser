plugins {
    /**
     * trick: for the same plugin versions in all sub-modules
     * TODO https://youtrack.jetbrains.com/issue/KTIJ-19369
     */
    id("com.android.application").version("7.4.2").apply(false)
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("android").version("1.8.10").apply(false)
    kotlin("multiplatform").version("1.8.10").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
