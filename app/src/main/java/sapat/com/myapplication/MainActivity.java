package sapat.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import sapat.com.myapplication.Interface.Loginview;
import sapat.com.myapplication.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements Loginview {

    Button myclick;
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myclick = findViewById(R.id.b1);

        loginPresenter = new LoginPresenter(this);

        myclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            loginPresenter.getReg("tredr");

            }
        });

    }

    @Override
    public void showRErrorMeassage() {

    }

    @Override
    public void showRLoginSuccessMsg(String success, String regid, String email, String mobile, String msg, String name, String recode, String otp, String relateId) {

    }

    @Override
    public void showFLoginSuccessMsg(String success, String msg, String name, String otp) {

    }

    @Override
    public void showNetoworkError() {

    }

    @Override
    public void showprogress() {

    }

    @Override
    public void hideprogress() {

    }
}