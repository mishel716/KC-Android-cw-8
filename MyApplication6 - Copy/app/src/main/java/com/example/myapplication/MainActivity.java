package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item>items =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item ice1 =new Item("lolo",0.5,R.drawable.name,"tjkdrgjllikigdhtgulkjighigotuolfjouikrjuiiyihjmuyeukgtu");
        Item ice2 =new Item("chocolate ice cream",0.725,R.drawable.name2,"fggggggggggggggggggsgfjsssdkdfjgisdkguksdrgujdsguiyshgyui");
        Item ice3 =new Item("sandwish",0.25,R.drawable.name3,"fjdfhkgfbgkjshfuhmjfhhmsdgfghjfdsj");

       items.add(ice1);
        items.add(ice2);
        items.add(ice3);
        itemmm adpter =new itemmm(this,0,items);

        ListView listView =findViewById(R.id.listV);
        listView.setAdapter(adpter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Item currentItem =items.get(i);
                 Intent intent =new Intent(MainActivity.this,DetailsActivity.class);
                 intent.putExtra("Phone",currentItem);
                  startActivity(intent);



             }
         });


            }
        }





        
