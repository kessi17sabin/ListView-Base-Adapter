package com.example.welcome.listviewbaseadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

     ListView lv;
     int[] symbolno={1,2,3,4,5,6,7,8,9,10};
     String[] name={"avi","manish","sabin","mingmar","rashik","hari","bikash","gora","sete","boiler"};
     String[] address={"abc","ajdfhh","afhds","ajdfjhd","akfkdh","akfh","akdfh","akfh","kaf","adkfh"};
     String[] phone={"981","323","32423","34234","4234","1234","123455","2355","4243234","324234"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.list);
        lv.setAdapter(new Myadapter(MainActivity.this,symbolno,name,address,phone));
    }
}
