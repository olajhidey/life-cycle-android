<h2>life-cycle-android</h2>
<div>
    The basic android life cycle callbacks. The callbacks override function from the appCompactActivity class
</div>
<ul>
  <li><a href="#oncreate">onCreate()</a></li>
  <li><a href="#onstart">onStart()</a></li>
  <li><a href="#onresume">onResume()</a></li>
  <li><a href="#onpause">onPause()</a></li>
  <li><a href="#onstop">onStop()</a></li>
  <li><a href="#ondestroy">onDestroy()</a></li>
  <li><a href="#onrestart">onRestart()</a></li>
  <li><a href="#resources">Resources</a></li>
</ul>

<div id="oncreate">
  <h3>onCreate() </h3>
  <div>
    The oncreate callback function is called when our app is instantiated and helps 
    set up our layout view. this callback is the start point of the app you could do alot in the onCreate function.
    e.g display list of data, start a music or video and many more
  </div>
  
   <pre>
      //start the oncreate callback
      @Override
      protected void onCreate(){
      //inherit from super class 
      super.onCreate();

      //Log a message on Create 
      Log.v("onCreate callback", "This is the oncreate callback wow!");
      }    
   </pre>
  
    
</div>

    
<div id="onstart">
<h3>onStart()</h3>
  
  <div>
     The onStart() callback is called when the activity is becoming visible to the user which then change state to 
    the onResume callback  
  </div>
  
   <pre>
      //start the onstart callback
      @Override
      protected void onStart(){
          //inherit from super class 
          super.onStart();

          //Log a message on Create 
          Log.v("onStart callback", "Yaay! our activity is about to start");
      }  
   </pre>

  
 
</div>

<div id="onresume">
<h3>onResume()</h3>

<div>
    The onResume() callback is called when the activity is visible to the user such that the user can actually interact with screen
    and see components in the app. this callback is always followed by the onPause

</div>

 <pre>
    //start the onResume callback
    @Override
    protected void onResume(){
        //inherit from super class 
        super.onResume();

        //Log a message on Create 
        Log.v("onResume callback", "Woaw! I love this image");
    }      
  </pre>
</div>

<div id="onpause">
<h3>onPause()</h3>

<div>
    Called as part of the activity lifecycle when an activity is going into the background, but has not (yet) been killed.
    The counterpart to onResume(). When activity B is launched in front of activity A, this callback will be invoked on A.
    B will not be created until A's onPause() returns, so be sure to not do anything lengthy here.
</div>

<pre>
    //start the onPause callback
    @Override
    protected void onPause(){
        //inherit from super class 
        super.onPause();

        //Log a message on Create 
        Log.v("onPause callback", "The activity has been paused");
    }
</pre>

</div>

<div id="onstop">

<h3>onStop()</h3>

<div>
    Called when you are no longer visible to the user.
    You will next receive either onRestart(), onDestroy(), or nothing, depending on later user activity.
    Note that this method may never be called, in low memory situations where the system does not have enough memory to keep 
    your activity's process running after its onPause() method is called.
</div>

<pre>
    //start the onStop callback
    @Override
    protected void onStop(){
        //inherit from super class 
        super.onStop();

        //Log a message on Create 
        Log.v("onStop callback", "The activity is in the background");
    }

</pre>


</div>

<div id="ondestroy">
<h3>onDestroy()</h3>
  
<div>
   The final call you receive before your activity is destroyed.
        This can happen either because the activity is finishing (someone called finish() on it, or because the system is temporarily destroying this instance of the activity to save space.
        You can distinguish between> these two scenarios with the isFinishing() method.
</div>

<pre>
    //start the onDestroy callback
    @Override
    protected void onDestroy(){
        //inherit from super class 
        super.onDestroy();

        //Log a message on Create 
        Log.v("onDestroy callback", "This activity have been destroyed");
    }
</pre>
</div>

<div id="onrestart">
<h3>onRestart()</h3>

  <div>
  Called after your activity has been stopped, prior to it being started again. Always followed by onStart()
  </div>
  
  <pre>
    //start the onRestart callback
    @Override
    protected void onRestart(){
        //inherit from super class 
        super.onRestart();

        //Log a message on Create 
        Log.v("onRestart callback", "This activity is restarting");
    }
</pre>

</div>

<div id="resources">
  <h2>Resources</h2>

<ul>
   <li><a href="https://stackoverflow.com/questions/8515936/android-activity-life-cycle-what-are-all-these-methods-for/8516056#8516056">Comment from stackoverflow</a></li>
   <li><a href="https://developer.android.com/guide/components/activities/activity-lifecycle">Understanding android life cycle</a></li>

</ul>



</div>






