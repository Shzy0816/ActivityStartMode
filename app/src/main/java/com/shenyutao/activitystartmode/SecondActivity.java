package com.shenyutao.activitystartmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.shenyutao.activitystartmode.databinding.ActivitySecondBinding;

/**
 * @author shenyutao
 */
public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
        initListener();
    }

    private void initView() {
    }

    private void initListener() {
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchBySingleInstanceMode();
            }
        });

    }

    /**
     * SingleInstance
     */
    private void launchBySingleInstanceMode(){
        Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    //    private void initView() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder
//                .append(TAG)
//                .append("\n")
//                .append("TaskId")
//                .append(getTaskId())
//                .append("\n")
//                .append("MyTid:")
//                .append(Thread.currentThread().getId())
//                .append("\n")
//                .append("MyPid:")
//                .append(android.os.Process.myPid());
//        binding.textView.setText(stringBuilder);
//    }
}