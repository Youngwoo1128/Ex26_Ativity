package com.mac_available.ex26ativity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //제목줄(Actionbar) 관리객체 얻어오기
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second 화면");
   }

    public void clickBtn(View view) {
        //SecondActivity class 실행!
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

        //이 액티비티(MainActivity)를 종료
        finish();

    }

    public void clickBtn2(View view) {
        //Thrid Activity 실행하기
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}

//App 4대 구성요소(Component)