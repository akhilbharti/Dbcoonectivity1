package com.akhilbharti.dbcoonectivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
        EditText name,rn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (EditText) findViewById(R.id.editText3);
        rn=(EditText) findViewById(R.id.editText4);

    }

    public void regd(View view)
    {
        String stu_name=name.getText().toString();
        String stu_roll=rn.getText().toString();
        String method="register";
        background bg=new background(this);
        bg.execute(method,stu_name,stu_roll);
           // finish();
    }
    public void OnLogin(View view) {
        String stu_name=name.getText().toString();
        String stu_roll=rn.getText().toString();
        String type = "login";
        background bg = new background(this);
        bg.execute(type, stu_name, stu_roll);
    }

}
