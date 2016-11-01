package com.omonayajo.emptystates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LaunchScreen extends AppCompatActivity {

    @BindView(R.id.base_list) ListView bListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        ButterKnife.bind(this);
    }
}
