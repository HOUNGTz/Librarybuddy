plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.houng.mobile_app_development"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.houng.mobile_app_development"
        minSdk = 24
        //targetSdk = 33 //Policy center still shows a warning to target sdk 33
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("androidx.cardview:cardview:1.0.0")
    implementation ("androidx.fragment:fragment:1.6.2")
    implementation ("com.google.android.material:material:1.11.0")
    implementation ("com.airbnb.android:lottie:3.4.0")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")

}