package cn.somputon.aircleaner.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.somputon.aircleaner.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        ((TextView)findViewById(R.id.tv_title)).setText("注册");
    }

    public void gotoNext(){
        Intent intent=new Intent(RegisterActivity.this,SendSMSActivity.class);
        //todo
        startActivityForResult(intent,1);
    }
}
