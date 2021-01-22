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

            if (data !=null && data.has("lugar")) {
                prefEditor.putString("lugarRecieved", data.optString("lugar"));
                prefEditor.apply();
            }


            if (data !=null && data.has("fecha")) {
                prefEditor.putString("fechaRecieved", data.optString("fecha"));
                prefEditor.apply();
            }

            if (data !=null && data.has("hora")) {
                prefEditor.putString("horaRecieved", data.optString("hora"));
                prefEditor.apply();
            }

            if (data !=null && data.has("mensaje")) {
                prefEditor.putString("mensajeRecieved", data.optString("mensaje"));
                prefEditor.apply();

            }

        }
    }

    public static synchronized  PushNotification getInstance() {

        return mInstance;
    }

}