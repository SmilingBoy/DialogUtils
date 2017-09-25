package com.smile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.smile.zqdialog.OnCancelBtnListener;
import com.smile.zqdialog.OnItemClickListener;
import com.smile.zqdialog.OnOkListener;
import com.smile.zqdialog.ZQAlertBottomView;
import com.smile.zqdialog.ZQAlertView;
import com.smile.zqdialog.ZQShowView;

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


        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ZQShowView(MainActivity.this)
                        .setText("没有取消哦")
                        .setOkListener(new OnOkListener() {
                            @Override
                            public void onOk() {
                                Log.e("TGA", "ok");
                            }
                        })
                        .show();
            }
        });


        final String[] s = {"一个", "er个", "san个"};

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ZQAlertBottomView(MainActivity.this)
                        .setItemsText(s)
                        .setCancelBtnListener(new OnCancelBtnListener() {
                            @Override
                            public void onCancel() {
                                Log.e("TGA", "cancel");
                            }
                        })
                        .setItemClickListener(new OnItemClickListener() {
                            @Override
                            public void onItemClick(int position) {
                                Log.e("TGA", "position =- " + position);
                            }
                        })
                        .show();
            }
        });

    }
}
