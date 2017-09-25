package com.smile.zqdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Smile on 2017/9/25.
 */

public class ZQShowView extends Dialog implements View.OnClickListener {

    private OnOkListener okListener = null;

    private TextView tvContent;
    private Button btnOk;

    private String contentText = "";

    public ZQShowView(@NonNull Context context) {
        super(context, R.style.BaseDialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zqdilog_showview);

        tvContent = findViewById(R.id.tv_content);
        btnOk = findViewById(R.id.btn_ok);

        btnOk.setOnClickListener(this);
        tvContent.setText(contentText);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_ok) {
            if (null != okListener) {
                okListener.onOk();
            }
            dismiss();
        }
    }

    public ZQShowView setText(String content) {
        if (!content.isEmpty()) {
            contentText = content;
        }
        return this;
    }

    public ZQShowView setOkListener(OnOkListener okListener) {
        this.okListener = okListener;
        return this;
    }

}
