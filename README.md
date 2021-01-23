# AHA
<strong>Android Hybrid App</strong>
<p>V.0.1-BETA</p>
<br/>

### WHAT IS THIS ?
AHA (Android Hybrid App) is a emulator full app for android.<br/>
You can use your CMS URL or your Responsive web URL like a Android app.

<strong>Programs</strong>
<p>Android Studio: https://developer.android.com</p>
<p>NotePad++: https://notepad-plus-plus.org</p>
<p>Visual Studio Code: https://code.visualstudio.com/</p>

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
	- OneSignal Push : https://onesignal.com/
	- Firebase : https://firebase.google.com/
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
 