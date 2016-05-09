package android.com.demo_dynamicdatabinding.handler;

import android.util.Log;
import android.view.View;

/**
 * Created by amitrai on 9/5/16.
 */
public class MyHandler {
    private String TAG = MyHandler.class.getSimpleName();

    public void onClickFriend(View view) {
        Log.e(TAG, "I AM FRIEND HANDLER");
    }
    public void onClickEnemy(View view) {
        Log.e(TAG, "I AM ENEMY HANDLER");
    }
}
