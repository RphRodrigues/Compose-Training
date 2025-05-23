pluginManagement {
  repositories {
    google {
      content {
        includeGroupByRegex("com\\.android.*")
        includeGroupByRegex("com\\.google.*")
        includeGroupByRegex("androidx.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
  }
}

rootProject.name = "Compose Training"
include(":app")
include(":codelab1")
include(":codelab1:app")
include(":codelab2")
include(":codelab2:app")
include(":designSystem")
include(":codelab3")
include(":codelab3:app")
include(":codelab4")
include(":codelab4:app")
include(":codelab1:feature")
