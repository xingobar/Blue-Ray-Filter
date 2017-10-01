package com.example.xingobar.bluelightfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import com.example.xingobar.bluelightfilter.FilterService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FilterService.class);

                if (toggleButton.isChecked()) {

                    /*
                     * service 可長時間的於背景中執行
                     * 還可以做網路交易 播放音樂等動作
                     */
                    startService(intent);
                } else {
                    stopService(intent);
                }
            }
        });
    }
}
