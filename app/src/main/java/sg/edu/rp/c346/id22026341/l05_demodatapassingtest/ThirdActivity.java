package sg.edu.rp.c346.id22026341.l05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswerChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvAnswerChar = findViewById(R.id.textView2);
        Intent intentReceivedChar = getIntent();
        String Char = intentReceivedChar.getStringExtra("Char");
        tvAnswerChar.setText("Character value received is: " + Char);
    }
}