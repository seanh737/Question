package com.example.user.question;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static final int REQUEST_1 = 123;
    public static final int REQUEST_2 = 124;
    public static final int REQUEST_3 = 125;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView questions = (ListView) findViewById(R.id.list_questions);
        String[] ans = new String[]{"year?","last year?","next year?"};
        ArrayAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1, ans);
        questions.setAdapter(adapter);
        questions.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if (position == 0) {
            Intent intent = new Intent(this,Ques1.class);
            startActivityForResult(intent, REQUEST_1);
        }
        if (position == 1) {
            Intent intent = new Intent(this, Ques2.class);
            startActivityForResult(intent, REQUEST_2);
        }
        if (position == 2) {
            Intent intent = new Intent(this, Ques3.class);
            startActivityForResult(intent, REQUEST_3);
        }
    }
}
