plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.connectme"
    compileSdk = 35


    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
    defaultConfig {
        applicationId = "com.example.connectme"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        dataBinding = true
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

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation ("androidx.activity:activity-ktx:1.4.0")
    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    implementation ("com.google.android.material:material:1.5.0")
    implementation ( "de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation ("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.test.espresso:espresso-intents:3.5.1")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test:runner:1.5.2")
    androidTestImplementation ("androidx.test:rules:1.5.0")
}