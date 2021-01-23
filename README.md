# AHA
<strong>Android Hybrid App</strong>
<p>V.0.1-BETA</p>

### WHAT IS THIS ?
<p>
AHA (Android Hybrid App) is a emulator full app for android.<br/>
You can use your CMS URL or your Responsive web URL like a Android app.<br/>
<b>NOTE:</b> You need to export this project with Android Studio if you want to install .apk file.
<b>NOTE:</b> If you want just to upload the app. Use: Configure on-device developer options

</p>

<strong>Programs</strong>
<p>Android Studio: https://developer.android.com</p>
<p>NotePad++: https://notepad-plus-plus.org</p>
<p>Visual Studio Code: https://code.visualstudio.com/</p>
<p>OneSignal Push: https://onesignal.com/</p>
<p>Google Firebase: https://firebase.google.com/</p>

## Android API Test

<b>API 22:</b> Android <b>5.1</b> (Lollipop) <b>92,3%</b> of devices.<br/>
<b>API 23:</b> Android <b>6.0</b> (Marshmellow) <b>84,9%</b> of devices.<br/>
<b>API 24:</b> Android <b>7.0</b> (Nougat) <b>73,7%</b> of devices.<br/>
<b>API 25:</b> Android <b>7.1.1</b> (Nougat) <b>66,2%</b> of devices.<br/>
<b>API 26:</b> Android <b>8.0</b> (Oreo) <b>60,8%</b> of devices.<br/>
<b>API 27:</b> Android <b>8.1</b> (Oreo) <b>53,5%</b> of devices.<br/>
<b>API 28:</b> Android <b>9.0</b> (Pie) <b>39,5%</b> of devices.<br/>
<b>API 29:</b> Android <b>10</b> (Q) <b>8,2%</b> of devices.

### FEATURES
	- Splash Screen
	- News Screen
	- Intro Screen
	- Loading gif
	- OneSignal Push
	- Firebase
	- Gmail Login
	- Facebook Login
	- Icons
	- WhatsApp Chat
	
	
### HOWTO ?
`1` <b>Step:</b> You need a `Responsive` URL <br/>
`2` <b>Step:</b> You need edit `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` <br/><b>Line 25:</b> `String target_url=`<br/>
`3` <b>Step:</b> Gmail Login `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` <br/><b>Line 173:</b> `if (url.contains("Your-Google-CallBack-URL")) {return false; }`<br/>
on this step you need to make sure you got a gmail API + a APP on Google for make this login work in your web first.<br/>
`4` <b>Step:</b> Facebook Login `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` <br/><b>Line 174:</b> `if (url.contains("Your-Facebook-CallBack-URL")) {return false;}`<br/>
on this step you need to make sure you got a Facebook Developer API for make this login work in your web first.<br/>
`5` <b>Step:</b> Edit Bundle for OneSignal. ` AHA/app/build.gradle`<br/>
<b>Line 29:</b> `onesignal_app_id : 'YOUR-OneSignal-APP-ID'`<br/>
`6` <b>Step:</b> Remember this is a custom app. So you need to edit ID APP: `applicationId` in ` AHA/app/build.gradle`<br/>
<b>Line 21:</b> `applicationId "aha.ircayuda.org"` <br/>

### Configure on-device developer options

<p>The Settings app on Android includes a screen called Developer options that lets you configure system behaviors that help you profile and debug your app performance. 
For example, you can enable debugging over USB, capture a bug report, enable visual feedback for taps, flash window surfaces when they update, use the GPU for 2D graphics rendering, and more. </p>
<p>
<b>How to developer mode:</b> https://developer.android.com/studio/debug/dev-options
</p>


## THEME Colors / Style / Settings

<p>
<b>File:</b> colors.xml<br/>
<b>NOTE:</b> You can set APP color in RGB. Example: (Black Color): #000000 or #000

```
<resources>
    <color name="colorPrimary">#2a2a2a</color>
    <color name="colorPrimaryDark">#2a2a2a</color>
    <color name="colorAccent">#e84a5f</color>
    <color name="onesignal_bgimage_notif_title_color">#e84a5f</color>
    <color name="onesignal_bgimage_notif_body_color">#2a2a2a</color>
</resources>
```
</p>

<p>
<b>File:</b> styles.xml<br/>
<b>NOTE:</b> You can custom your settings colors. The file looks like: 

```
<resources>
    <!-- Base application theme. -->
<style name="AppTheme" parent="Theme.AppCompat.NoActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
 </style>

<style name="JsAlert" parent="Theme.AppCompat.Dialog.Alert" >
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
</style>

 <style name="onReceivedError" parent="Theme.AppCompat.Dialog.Alert" >
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
 </style>

</resources>
```
</p>



</p>

<p>
<b>File:</b> strings.xml<br/>
<b>NOTE:</b> You can string your APP text or msg. Make some shortcuts

```
<resources>
    <string name="app_name" translatable="false">Android Hybrid App</string>
    <string name="default_notification_channel_id" translatable="false">default_channel</string>
    <string name="noticias" translatable="false">Noticias</string>
    <string name="alertas" translatable="false">Alertas</string>
    <string name="AHA" translatable="false">Android Hybrid App</string>
    <string name="Inicio" translatable="false">Inicio</string>
    <string name="lugar" translatable="false">Lugar</string>
    <string name="fecha" translatable="false">Fecha</string>
    <string name="hora" translatable="false">Hora</string>
    <string name="mensaje" translatable="false">Mensaje</string>
    <string name="name" translatable="false">Nombre</string>
</resources>

```
</p>

<p>
<b>File:</b> AndroidManifest.xml<br/>
<b>NOTE:</b> Your app can be set like this with the strings.xml file.

```
    <application
        android:name=".PushNotification"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@drawable/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".Alertas" />
        <activity android:name=".SplashScreen">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".MainActivity" />

        <service
            android:name=".MyFirebaseMessagingService"
            android:enabled="true"
            android:exported="false" />
    </application>

```
</p>


## ICONS

`NOTE:` You can edit your APP incons. Make sure you use this example we got in this page. ( PX = Pixel ) 48x48px means. 48px with. 48px heigh.<br/>
`NOTE:` Android work with scale icons, you need to edit all this example for make sure work in all android version.

##### Mipmap-mdpi ( 48 x 48px )
<img src="https://ircayuda.org/aha/img/mipmap-mdpi/ic_launcher.png" alt="AHA - Android Hybrid App"/> <img src="https://ircayuda.org/aha/img/mipmap-mdpi/ic_launcher_round.png" alt="AHA - Android Hybrid App"/>

##### Mipmap-hdpi ( 72 x 72px ) 
<img src="https://ircayuda.org/aha/img/mipmap-hdpi/ic_launcher.png" alt="AHA - Android Hybrid App"/> <img src="https://ircayuda.org/aha/img/mipmap-hdpi/ic_launcher_round.png" alt="AHA - Android Hybrid App"/>

##### Mipmap-xhdpi ( 96 x 96px )
<img src="https://ircayuda.org/aha/img/mipmap-xhdpi/ic_launcher.png" alt="AHA - Android Hybrid App"/> <img src="https://ircayuda.org/aha/img/mipmap-xhdpi/ic_launcher_round.png" alt="AHA - Android Hybrid App"/>

##### Mipmap-xxhdpi ( 144 x 144px )
<img src="https://ircayuda.org/aha/img/mipmap-xxhdpi/ic_launcher.png" alt="AHA - Android Hybrid App"/> <img src="https://ircayuda.org/aha/img/mipmap-xxhdpi/ic_launcher_round.png" alt="AHA - Android Hybrid App"/>

##### Mipmap-xxxhdpi ( 192 x 192px )
<img src="https://ircayuda.org/aha/img/mipmap-xxxhdpi/ic_launcher.png" alt="AHA - Android Hybrid App"/> <img src="https://ircayuda.org/aha/img/mipmap-xxxhdpi/ic_launcher_round.png" alt="AHA - Android Hybrid App"/>


## APP IMG

<img src="https://ircayuda.org/aha/img/APP/appz/aha.jpg" alt="AHA - Android Hybrid App" /> 
<img src="https://ircayuda.org/aha/img/APP/appz/alertas.jpg" alt="AHA - Android Hybrid App" />

<img src="https://ircayuda.org/aha/img/APP/appz/ic_stat_ic_notification.png" alt="AHA - Android Hybrid App" /> <img src="https://ircayuda.org/aha/img/APP/appz/logo.png" alt="AHA - Android Hybrid App" /> <img src="https://ircayuda.org/aha/img/APP/appz/ic_launcher_round.png" alt="AHA - Android Hybrid App" />

## Android Studio IMG

#### Loading Screen
<img src="https://ircayuda.org/aha/img/APP/loading.jpg" alt="AHA - Android Hybrid App" />

#### News Screen
<img src="https://ircayuda.org/aha/img/APP/news.jpg" alt="AHA - Android Hybrid App" />

#### Splash Screen
<img src="https://ircayuda.org/aha/img/APP/splash.jpg" alt="AHA - Android Hybrid App" />
 
 
