/**
 * Called if InstanceID token is updated. This may occur if the security of
 * the previous token had been compromised. Note that this is called when the InstanceID token
 * is initially generated so this is where you would retrieve the token.
 */

package kkooyyaa.io;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {


    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        // channelidを設定
        addChannelId();
    }

    // レシーバー
    @Override
    public void onMessageReceived(RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d("DEBUGGG", "onMessageReceived token:${"+ message.toString() + "}");

        //message.getData().get("title");

        //Toast.makeText(this, message.getData().get("title"), Toast.LENGTH_LONG).show();

        Log.d("DEBUGGG", message.getData().get("title"));
    }

    private void addChannelId() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            // ヘッドアップ通知を出す場合はチャンネルの重要度も最大にする
            NotificationChannel channel = new NotificationChannel("sample", "sample", NotificationManager.IMPORTANCE_HIGH);

            // ロック画面での表示レベル
            channel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
            // チャンネル登録
            manager.createNotificationChannel(channel);

        }
    }
}