pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MovieBrowser"
include(":androidApp")
include(":shared:core:network")
include(":shared:data")
include(":shared:domain")
include(":shared:common")
