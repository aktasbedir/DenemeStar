pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //repodakini kullanabilmek icin bunun eklenmesi lazim
        maven("https://jitpack.io")
    }
}

rootProject.name = "Deneme Star"
include(":app")
include(":star-framework")
