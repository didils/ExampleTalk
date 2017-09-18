package com.example.patearn.exampletalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.patearn.exampletalk.fragment.PeopleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().replace(R.id.mainActivity_framelayout, new PeopleFragment()).commit();
    }
}
