package mytest.manager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Splash(로딩화면) 띄우기
        startActivity(new Intent(this, SplashActivity.class));
        
        // do_something();
    }
}