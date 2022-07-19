package com.shenyutao.activitystartmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.shenyutao.activitystartmode.databinding.ActivityFifthBinding;

/**
 * @author shenyutao
 */
public class FifthActivity extends AppCompatActivity {
    private static final String TAG = "FifthActivity";
    private ActivityFifthBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFifthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
        initListener();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), TAG + "has destroy", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy: ");
    }

    private void initView() {
    }

    private void initListener() {
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
    


}