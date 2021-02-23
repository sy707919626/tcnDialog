package com.tcn.tcndialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tcn.cpt_dialog.LoginDialog;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginDialog loginDialog = new LoginDialog(MainActivity.this);
        loginDialog.setCallback(new LoginDialog.callBackButton() {
            @Override
            public void onCallback(View view) {
//                view.setBackgroundColor(getResources().getColor(R.color.teal_200));
//                view.setBackground(getResources().getDrawable(R.drawable.btn_blue_border_selector));
            }
        });
        loginDialog.show();
    }
}