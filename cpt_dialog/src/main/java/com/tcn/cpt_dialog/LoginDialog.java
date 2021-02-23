package com.tcn.cpt_dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LoginDialog extends Dialog {
    private ImageView closeImage;
    private Button button;
//
//    private callBackButton mCallback;
//    public void setCallback(callBackButton callback) {
//        this.mCallback = callback;
//    }
//
//    public interface callBackButton {
//        void onCallback(View view);
//    }

    public LoginDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_dialog);
        closeImage = findViewById(R.id.close);
        button = findViewById(R.id.select_btn);
//        button.setBackground(getContext().getDrawable(R.drawable.btn_blue_border_selector));
//        mCallback.onCallback(button);

        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

}
