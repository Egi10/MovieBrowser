plugins {
    id("buaja.multiplatform")
}

kotlin {
    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        framework {
            baseName = "common"
            isStatic = false

            export(project(":shared:core:network"))
            export(project(":shared:data"))
            export(project(":shared:domain"))
        }
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":shared:core:network"))
                api(project(":shared:data"))
                api(project(":shared:common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "id.co.buaja.common"
    // Change in gradle.properties
    compileSdk = (findProperty("android.compileSdk") as String).toInt()
    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
    }
}