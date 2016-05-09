package android.com.demo_dynamicdatabinding.handler;

import android.util.Log;
import android.view.View;

/**
 * Created by amitrai on 9/5/16.
 */
public class MyHandler{
    public String TAG = MyHandler.class.getSimpleName();
    public MyHandler handler = null;
    public MyHandler(){
        handler = new MyHandler();
    }

    public MyHandler getHandler() {
        if(handler == null)
            handler = new MyHandler();
        return handler;
    }

    public void setHandler(MyHandler handler) {
        this.handler = handler;
    }

    public void onClickFriend(View view) {
        Log.e(TAG, "I AM FRIEND HANDLER");
    }
    public void onClickEnemy(View view) {
        Log.e(TAG, "I AM ENEMY HANDLER");
    }
}
