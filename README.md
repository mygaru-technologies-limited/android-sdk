## myGaru SDK for Android

Get started on integrating the **myGaru SDK** into your native Android app through these guides:

## Installation

### Step 1 - Install **myGaru SDK**

**myGaru SDK** for Android supports [API 21](https://developer.android.com/about/versions/android-5.0) and above.
Recommend using the latest available `compileSdkVersion`.
JavaVersion: `1.8`

**First**, in Your root build.gradle file:
```
   allprojects {
    repositories {
        ...
        maven {
            url 'https://dl.bintray.com/mygaru/android-sdk'
        }
        ...
    }
   }
```
 
**Then**, in app module build.gradle file:
```
   android {
    ...
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    ...
   }
   dependencies {
    ...
    implementation 'com.mygaru:android-sdk:0.+'
    ...
   }
```
Finally in Android Studio - Tools -> Android -> Sync Project with Gradle Files 

#### Permissions

myGaru SDK included the INTERNET, READ_PHONE_STATE, READ_EXTERNAL_STORAGE, RECEIVE_BOOT_COMPLETED permissions by default:
```xml
<manifest>

   <uses-permission android:name="android.permission.INTERNET" />
   <uses-permission android:name="android.permission.READ_PHONE_STATE" />
   <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
   <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />
   
</manifest>
```
For all features provided by myGaru you need to include in your app manifest file:
```xml
<manifest>

    <uses-permission android:name="android.permission.BLUETOOTH" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.CALL_PHONE" />
    <uses-permission android:name="android.permission.GET_ACCOUNTS" />
    <uses-permission android:name="android.permission.READ_CONTACTS" />
    <uses-permission android:name="android.permission.READ_CALL_LOG" />
    <uses-permission android:name="android.permission.READ_SMS" />
    <uses-permission android:name="android.permission.READ_CALENDAR" />
    <uses-permission android:name="android.permission.PACKAGE_USAGE_STATS"
                 tools:ignore="ProtectedPermissions" />
</manifest>
```

### Step 2 - Initialize **myGaru SDK**

First, you'll need to get your **myGaru** Android API key. To find these, just select the 'myGaru for Android' option in your [app settings](https://forinfinite.pw/#/dev/my-apps) .


Then, initialize **myGaru** by calling the following in the onCreate() method of your application class:
```
MyGaru.initialize(this, "your api key");
```
If you don't currently implement a custom application, you’ll need to create one. Like this:
```java
public class YourAppApplication extends Application {
    @Override public void onCreate() {
        super.onCreate();
        MyGaru.initialize(this, "your api key");
   }
}
```
And update your manifest to use your application:
```xml
<application
    android:name=".YourAppApplication">
    ...
</application>
```
