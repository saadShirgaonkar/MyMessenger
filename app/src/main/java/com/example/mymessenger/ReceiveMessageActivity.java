 package com.example.mymessenger;


 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.widget.TextView;

 public class ReceiveMessageActivity extends Activity{
     public static final String Extra_String="Message";
     @Override
     public void onCreate(Bundle savedInstanceState)
     {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_recieve_message);
         Intent intent=getIntent();
         String messageText=intent.getStringExtra(Extra_String);
         TextView messageView=findViewById(R.id.message);
         messageView.setText(messageText);
     }
 }
