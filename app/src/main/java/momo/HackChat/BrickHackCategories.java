package momo.HackChat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.moxtra.sdk.MXChatManager;
import com.moxtra.sdk.MXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Momo on 4/4/15.
 */
public class BrickHackCategories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brickhackteamoptions);
    }

    public void buttonOnClick28(View v)  throws MXException.AccountManagerIsNotValid {
//            ImageButton button = (ImageButton) v;
        buttonOnClick29Chat();
    }



    public void buttonOnClick29Chat()
    {
        List<String> uniqueIds = new ArrayList<String>();
        uniqueIds.add("abc");
        try {
            MXChatManager.getInstance().createChat("topic", uniqueIds, new MXChatManager.OnCreateChatListener() {
                @Override
                public void onCreateChatSuccess(String binderID) {
                    Log.d("s", "onCreateChatSuccess(), binderID = " + binderID);
                }

                @Override
                public void onCreateChatFailed(int errorCode, String message) {
                    Log.d("asd", "onCreateChatFailed(), errorCode = " + errorCode + ", message = " + message);
                }
            });
        } catch (MXException.AccountManagerIsNotValid e) {
            e.printStackTrace();
            Log.e("assad","Asdasd");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void buttonOnClick29(View v)
    {
        ImageButton button = (ImageButton) v;
        buttonOnClick29Chat();
    }

    public void buttonOnClick31(View v) {
        ImageButton button = (ImageButton) v;
        buttonOnClick29Chat();
    }

    public void buttonOnClick32(View v) {
        ImageButton button = (ImageButton) v;
        buttonOnClick29Chat();
    }


}
