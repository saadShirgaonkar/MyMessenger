package com.example.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

    }
    public void onClickSendMessage(View view) {
        EditText messageSent = findViewById(R.id.message);
        String messageText = messageSent.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle=getString(R.string.chooser);
        Intent chosenIntent=Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);

    }
}