plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.rafapps.materialyouadaptive"
    compileSdk = 34
    buildToolsVersion = "34.0.0"

    defaultConfig {
        applicationId = "com.rafapps.materialyouadaptive"
        versionCode = 2
        versionName = "2"

        minSdk = 26
        targetSdk = 34
    }

    buildTypes {
        release {
            isShrinkResources = false
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules")
        }

        aaptOptions.setNoCompress("zip", "komp", "klwp", "kwgt", "klck", "kwch", "kntf")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17

        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_17.toString()
        }
    }
}

dependencies {
    implementation("org.bitbucket.frankmonza:kustomapi:21")
    implementation("org.bitbucket.frankmonza:kustompreset:22")
    implementation("org.bitbucket.frankmonza:kustomdashboard:24")

    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")
}
