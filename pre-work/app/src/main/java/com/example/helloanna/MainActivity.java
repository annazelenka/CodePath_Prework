package com.example.helloanna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Anna","Button clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Anna","Button clicked");
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.gold));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grab the text the user entered
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                //put the text into label field
                Log.i("Anna","Button clicked");
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Yay Android!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

            }
        });


        findViewById(R.id.rootView).setOnClickListener((view) -> {
            //reset text color back to black
            ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.offwhite));
            //reset backgroundColor to colorAccent
            findViewById(R.id.rootView).setBackgroundColor(
                    getResources().getColor(R.color.colorPrimaryDark));
            //reset text back to "Hello from Anna!"
            ((TextView) findViewById(R.id.textView)).setText("Hello from Anna!");
        });

    }


}