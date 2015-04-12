package momo.HackChat;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.moxtra.sdk.MXAccountManager;
import com.moxtra.sdk.MXSDKConfig;


public class MainActivity extends ActionBarActivity {

    private MXAccountManager acctMgr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        acctMgr = ((MoxtraApplication) super.getApplication()).getAccountMgr();
        MXSDKConfig.MXUserInfo userInfo = new MXSDKConfig.MXUserInfo("useridentity", MXSDKConfig.MXUserIdentityType.IdentityUniqueId);
        if (acctMgr.isLinked()){
            Log.e("Test","Test");
        }
        else {
            acctMgr.setupUser(userInfo, null ,null, new MXAccountManager.MXAccountLinkListener(){
                @Override
                public void onLinkAccountDone(boolean bSuccess){
                    // Do something in the callback.
                    Log.d("hello","hallo");
                    if (bSuccess) {
                    }
                }
            });
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonOnClick(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), LAOptions.class));
    }

    public void buttonOnClick1(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), BitCampOptions.class));
    }

    public void buttonOnClick2(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), BrickHackOptions.class));
    }

    public void buttonOnClick3(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), HackRUOptions.class));
    }

    public void buttonOnClick4(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), CarlHacksOptions.class));
    }

    public void buttonOnClick5(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), RedbirdHacksOptions.class));
    }

    public void buttonOnClick6(View v)
    {
        ImageButton button = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), Project34Options.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
