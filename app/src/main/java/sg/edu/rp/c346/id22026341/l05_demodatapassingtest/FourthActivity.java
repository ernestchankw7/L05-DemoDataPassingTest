package sg.edu.rp.c346.id22026341.l05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswerDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tvAnswerDouble = findViewById(R.id.textView3);
        Intent intentReceivedDouble = getIntent();
        Double ansDouble = intentReceivedDouble.getDoubleExtra("Double",0);
        tvAnswerDouble.setText("Double value received is: " + ansDouble);
    }
}