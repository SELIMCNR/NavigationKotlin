plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id ("androidx.navigation.safeargs")
}

android {
    namespace = "com.selimcinar.navigationkotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.selimcinar.navigationkotlin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
val nav_version = "2.7.7"
dependencies {
    
      



        // Kotlin
        implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
        implementation ("androidx.navigation:navigation-ui-ktx:$nav_version")

        // Feature module Support
        implementation ("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

        // Testing Navigation
        androidTestImplementation ("androidx.navigation:navigation-testing:$nav_version")

        // Jetpack Compose Integration
        implementation ("androidx.navigation:navigation-compose:$nav_version")
    
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}