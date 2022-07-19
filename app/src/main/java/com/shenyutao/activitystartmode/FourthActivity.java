package com.shenyutao.activitystartmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.shenyutao.activitystartmode.databinding.ActivityFourthBinding;
import com.shenyutao.activitystartmode.databinding.ActivityThirdBinding;

/**
 * @author asus
 */
public class FourthActivity extends AppCompatActivity {
    private ActivityFourthBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityFourthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
        initListener();
    }


    private void initView(){
    }

    private void initListener(){
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}