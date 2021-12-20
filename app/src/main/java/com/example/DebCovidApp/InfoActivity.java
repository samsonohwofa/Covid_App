package com.example.DebCovidApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView mTitleName;
    private TextView mTextBox;
    private TextView mTitle2;
    private TextView mTextBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);

        mTitleName = (TextView)findViewById(R.id.text_covid);
        mTextBox = (TextView)findViewById(R.id.box);
        mTitle2 = (TextView)findViewById(R.id.ttl);
        mTextBox2 = (TextView)findViewById(R.id.tbx);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Titlenames");
        String info = intent.getExtras().getString("Information");
        String expl = intent.getExtras().getString("Explanation");
        String Covid = intent.getExtras().getString("Covid19");

        mTitleName.setText(Title);
        mTextBox.setText(info);
        mTitle2.setText(expl);
        mTextBox2.setText(Covid);

    }
}
