package com.bit.myapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv01;
    private EditText et01;

    public void showMsg(View view){
        Toast toast = Toast.makeText(this, "메세지 출력",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clear(View view){
        ((EditText)view).setText("");
    }

    public void click(View view){
        Log.d("myTest","출력");
        tv01.setText(et01.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et01 = findViewById(R.id.et01);
        tv01 = findViewById(R.id.tv01);
        Button btn01 = findViewById(R.id.btn01);

//        View v1=tv01;
//        View v2=et01;
//        View v3=btn01;
//
//        btn01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String msg = et01.getText().toString();
//                tv01.setText(msg);
//                et01.setText("");
//                Log.d("myTest",msg);
//            }
//        });



    }
}
