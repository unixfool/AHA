# AHA
<strong>Android Hybrid App</strong>
<p>V.0.1-BETA</p>

### WHAT IS THIS ?
AHA (Android Hybrid App) is a emulator full app for android.<br/>
You can use your CMS URL or your Responsive web URL like a Android app.

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
`2` <b>Step:</b> You need edit `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` <br/><b style='color:red;'>Line 25:</b> `String target_url=`<br/>
`3` <b>Step:</b> Gmail Login `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` <br/><b>Line 173:</b> `if (url.contains("Your-Google-CallBack-URL")) {return false; }`<br/>
on this step you need to make sure you got a gmail API + a APP on Google for make this login work in your web first.<br/>
`4` <b>Step:</b> Gmail Login `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` <br/><b>Line 174:</b> `if (url.contains("Your-Facebook-CallBack-URL")) {return false;}`<br/>
on this step you need to make sure you got a Facebook Developer API for make this login work in your web first.<br/>