# HelloWorld Gradle NDK
Hello world sample for SDK &amp; NDK integration and use with configuration files using gradle build system in IntelliJIDEA 14.0.1

See http://chesnerdesir.blogspot.fr/2015/02/hello-world-ndk-using-gradle.html for more details.

This Hello World includes:

* Call of native functions
* JNI header generation
* NDK configuration in gradle
* Unit test

#Tools used

* IntelliJIDEA 14.0.1 : https://www.jetbrains.com/idea/
+ IntelliJIDEA JNI Helper plugin : https://plugins.jetbrains.com/plugin/7670
* Java JDK 1.6
* Android SDK 24.0.2
* NDK r10d

![Hello World](http://4.bp.blogspot.com/-Euel7kpjSYo/VOXLoQOBbjI/AAAAAAAAD7w/qTRZiLbrxjk/s1600/demo_helloworldgradlendk.png)

![Hello World](http://3.bp.blogspot.com/-Hbdz1a-_v48/VOXLI15PyvI/AAAAAAAAD7o/XJzVXaRiS-U/s1600/demo_layout.png)


The JNI part

![Hello World](http://3.bp.blogspot.com/-pJX76xasH9Q/VOVWUd4o-vI/AAAAAAAAD64/iifAwD2C1Co/s1600/demo_jni.png)

The configuration of NDK in build.gradle script

![Hello World](http://1.bp.blogspot.com/-q5go9_OKQdA/VOVWUFfvKuI/AAAAAAAAD6o/ZQtA3o1UnNE/s1600/demo_build_gradle.png)

The tricky part is :
```
project.plugins.findPlugin('com.android.application').getNdkFolder().absolutePath + File.separator
```

to integrate correctly the path to the NDK (see below).

Configure the path to the NDK in ./local.properties file (no space nor special characters in path name):
```
sdk.dir=path_to_android_sdk
ndk.dir=path_to_android_ndk
```

The unit testing part

![Hello World](http://2.bp.blogspot.com/-NKKEysp_Yxg/VOVWV8MNSHI/AAAAAAAAD7A/JiQ2588TlnU/s1600/demo_unit_test_method.png)

