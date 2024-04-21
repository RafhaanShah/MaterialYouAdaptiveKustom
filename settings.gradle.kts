include(":app")

// Local dashboard for development
if (file("../KustomLibs/dashboard").exists()) {
    logger.warn("Using local libs")
    include(":dashboard")
    project(":dashboard").projectDir = file("../KustomLibs/dashboard")
    // Local api for development
    include(":api")
    project(":api").projectDir = file("../KustomLibs/api")
    // Local preset for development
    include(":preset")
    project(":preset").projectDir = file("../KustomLibs/preset")
}

