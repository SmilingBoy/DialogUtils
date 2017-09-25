package com.smile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.smile.zqdialog.OnCancelBtnListener;
import com.smile.zqdialog.OnOkListener;
import com.smile.zqdialog.ZQAlertView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ZQAlertView(MainActivity.this)
                        .setText("你好啊")
                        .setOkListener(new OnOkListener() {
                            @Override
                            public void onOk() {
                                Log.e("TGA", "ok");
                            }
                        })
                        .setCancelBtnListener(new OnCancelBtnListener() {
                            @Override
                            public void onCancel() {
                                Log.e("TGA", "cancel");
                            }
                        })
                        .show();
            }
        });

    }
}
