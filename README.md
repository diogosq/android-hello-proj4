android-hello-proj4
===================

Sample application that says hello to the Proj4 library. This app is built for the latest
Android platforms (v14) - adjust to suit.

To build and run:

~~~~~ bash
cd jni
ndk-build 
cd ..
ant clean debug install
~~~~~


The app is installed as 'Proj4 Native', when run you should see the cversion number displayed in a 
TextView, such as:

![Android Screenshot](https://raw.github.com/mapdrops/android-hello-proj4/master/proj4.native.screen.png "Android Screenshot")

