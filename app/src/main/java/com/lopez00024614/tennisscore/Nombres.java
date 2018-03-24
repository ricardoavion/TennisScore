package com.lopez00024614.tennisscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Nombres extends AppCompatActivity {

    private Button btnGo;
    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres);

        Spinner sets = (Spinner) findViewById(R.id.spinner_sets);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sets, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sets.setAdapter(adapter);

        btnGo = (Button) findViewById(R.id.btn_go);
        editText1 = (EditText) findViewById(R.id.edit_name1);
        editText2 = (EditText) findViewById(R.id.edit_name2);
    }

    private void SendNames(View view){
        String name1, name2;
        name1 = editText1.getText().toString();
        name2 = editText2.getText().toString();

        Intent nameIntent = new Intent(this,Match.class);
        nameIntent.putExtra("Name1", name1);
        nameIntent.putExtra("Name2", name2);
        startActivity(nameIntent);
    }
}