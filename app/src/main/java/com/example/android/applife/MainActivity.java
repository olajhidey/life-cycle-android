package com.example.android.applife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

     /*
        Called when the activity is first created.
         This is where you should do all of your normal static set up: create views, bind data to lists, etc.
         This method also provides you with a Bundle containing the activity's previously frozen state, if there was one.
         Always followed by onStart().
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("OnCreate", "The oncreate() function life cycle");
        setContentView(R.layout.activity_main);
    }

    /*

    Called when the activity is becoming visible to the user.
    Followed by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.

    */


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("OnStart", "The onstart() function life cycle");
    }

    /*
    Called when the activity will start interacting with the user.
    At this point your activity is at the top of the activity stack, with user input going to it.
    Always followed by onPause().

     */

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("onResume", "The onresume() function life cycle");
    }

    /*

    Called as part of the activity lifecycle when an activity is going into the background, but has not (yet) been killed.
    The counterpart to onResume(). When activity B is launched in front of activity A, this callback will be invoked on A.
    B will not be created until A's onPause() returns, so be sure to not do anything lengthy here.

     */

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("onPause", "The onPause() function life cycle");
    }

    /*

    Called when you are no longer visible to the user.
    You will next receive either onRestart(), onDestroy(), or nothing, depending on later user activity.

    Note that this method may never be called, in low memory situations where the system does not have enough memory to keep your activity's process running after its onPause() method is called.

     */

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("onStop", "The onStop() function life cycle");
    }

    /*
        The final call you receive before your activity is destroyed.
        This can happen either because the activity is finishing (someone called finish() on it, or because the system is temporarily destroying this instance of the activity to save space.
        You can distinguish between> these two scenarios with the isFinishing() method.

     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("onDestroy", "The onDestroy() function life cycle");
    }

    /*
        Called after your activity has been stopped, prior to it being started again. Always followed by onStart()
     */

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("onRestart", "The onRestart() function life cycle");
    }
}
