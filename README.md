# AHA
<strong>Android Hybrid App</strong>
<p>V.0.1-BETA</p>

### What is this ?
AHA (Android Hybrid App) is a emulator full app for android.<br/>
You can use your CMS URL or your Responsive web URL like a Android app.

### Features
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
	
	
### How TO ?
`1` <b>Step:</b> You need a `Responsive` URL <br/>
`2` <b>Step:</b> You need edit `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` line 25: `String target_url=`
`3` <b>Step:</b> Gmail Login `AHA/app/src/main/java/aha/ircayuda/org/MainActivity.java` line 173: `if (url.contains("Your-Google-CallBack-URL")) {return false; }`<br/>
on this step you need to make sure you got a gmail API + a APP on Google for make this login work in your web first.