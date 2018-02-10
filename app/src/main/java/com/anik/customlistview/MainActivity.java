package com.anik.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryList[]={"Bangladesh","India","China","USA","New Zealand","Portugle"};
    int flag[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.america,R.drawable.new_zealand,R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList=(ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),countryList,flag);
        customList.setAdapter(customAdapter);



    }
}
