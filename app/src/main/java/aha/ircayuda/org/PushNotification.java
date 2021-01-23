package aha.ircayuda.org;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

public class PushNotification extends Application {

    private static PushNotification mInstance;
    SharedPreferences.Editor prefEditor;

    public PushNotification(){
        mInstance = this;
    }

    @SuppressLint("CommitPrefEdits")
    @Override
    public void onCreate(){
        super.onCreate();
        mInstance = this;

        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();

        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .setNotificationOpenedHandler(new NotificationHandler())
                .init();
    }

    class NotificationHandler implements OneSignal.NotificationOpenedHandler {


        @Override
        public void notificationOpened(OSNotificationOpenResult result) {

            JSONObject data = result.notification.payload.additionalData;

            if (data !=null && data.has("name")) {
                prefEditor.putString("nameRecieved", data.optString("name"));
                prefEditor.apply();
            }

            if (data !=null && data.has("location")) {
                prefEditor.putString("lugarRecieved", data.optString("location"));
                prefEditor.apply();
            }


            if (data !=null && data.has("date")) {
                prefEditor.putString("fechaRecieved", data.optString("date"));
                prefEditor.apply();
            }

            if (data !=null && data.has("time")) {
                prefEditor.putString("horaRecieved", data.optString("time"));
                prefEditor.apply();
            }

            if (data !=null && data.has("message")) {
                prefEditor.putString("mensajeRecieved", data.optString("message"));
                prefEditor.apply();

            }

        }
    }

    public static synchronized  PushNotification getInstance() {

        return mInstance;
    }

}