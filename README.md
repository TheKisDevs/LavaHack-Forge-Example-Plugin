# LavaHack-Example-Plugin
Credits: [original phobos](https://github.com/3arthqu4ke/3arthh4ck), original example plugin
### How to build?
```
gradlew setupDecompWorkspace
```
```
gradlew build
```
### How to add LavaHack-Plugins-API?
```groovy
repositories {
    // ...
    maven {
        name = 'jitpack-repo'
        url = 'https://jitpack.io'
    }
}

dependencies {
    // ...
    compile('com.github.TheKisDevs:LavaHack-Plugins-API:main-SNAPSHOT')
}
```