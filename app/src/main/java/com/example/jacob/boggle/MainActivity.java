package com.example.jacob.boggle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button tile1Button;
    protected Button tile2Button;
    protected Button tile3Button;
    protected Button tile4Button;
    protected Button tile5Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tile1Button = (Button)findViewById(R.id.tile1Button);
        tile1Button.setOnClickListener(this);

        tile2Button = (Button)findViewById(R.id.tile2Button);
        tile2Button.setOnClickListener(this);

        tile3Button = (Button)findViewById(R.id.tile3Button);
        tile3Button.setOnClickListener(this);

        tile4Button = (Button)findViewById(R.id.tile4Button);
        tile4Button.setOnClickListener(this);

        tile5Button = (Button)findViewById(R.id.tile5Button);
        tile5Button.setOnClickListener(this);

    }


@Override
public void onClick(View v) {
    if (v.getId() == R.id.tile1Button) {
        tile1Button.setBackgroundColor(0x86090404);
            }
    else if(v.getId() == R.id.tile2Button) {
        tile2Button.setBackgroundColor(0x86090404);
    }
    else if (v.getId() == R.id.tile3Button) {
        tile3Button.setBackgroundColor(0x86090404);
    }
    else if (v.getId() == R.id.tile4Button) {
        tile4Button.setBackgroundColor(0x86090404);
    }
    else if (v.getId() == R.id.tile5Button) {
        tile5Button.setBackgroundColor(0x86090404);
    }

}
}
