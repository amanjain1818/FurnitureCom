package com.example.furniturecom.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.furniturecom.Adapter.ExploreCategoryAdapter;
import com.example.furniturecom.Adapter.ExploreItemsLeftAdapter;
import com.example.furniturecom.Adapter.ExplorePopularAdapter;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.Model.ExploreItems;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ExploreCategoryList> lists;
    RecyclerView recyclerView1;
    List<ExploreItems> item1;
    ImageView gridview , exploreprofile, explorebeg;
    int a=0;
    AlertDialog.Builder builder;
    TextView dialogbox;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.explorecategoryitems);
        recyclerView1 = findViewById(R.id.exploreitemsleft);
        gridview=findViewById(R.id.gridview);
        exploreprofile=findViewById(R.id.exploreprofilepage);
         explorebeg=findViewById(R.id.explorebegpage);
         dialogbox=findViewById(R.id.dialogbox);
        builder = new AlertDialog.Builder(this);

        lists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 5; i++) {
            lists.add(new ExploreCategoryList("Living rooms"));
        }
        recyclerView.setAdapter(new ExploreCategoryAdapter(this, lists));


        item1 = new ArrayList<>();
        recyclerView1.setHasFixedSize(true);

        recyclerView1.setLayoutManager(new GridLayoutManager(this,2));
        for (int i = 0; i < 10; i++) {
            item1.add(new ExploreItems("Coffee table", "$2000"));
        }
        recyclerView1.setAdapter(new ExploreItemsLeftAdapter(this, item1));


        gridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this,ExploreCategoryActivtiy.class) ;
//                startActivity(intent);
                if(a==0){
                    gridview.setImageResource(R.drawable.ic_list_black_24dp);
//                  recyclerView1.setLayoutManager(new GridLayoutManager( MainActivity.this, 2));
//
//                    for (int i = 0; i < 10; i++) {
//            item1.add(new ExploreItems("Coffee table", "$2000"));
//        }
//        recyclerView1.setAdapter(new ExploreItemsLeftAdapter(MainActivity.this, item1));
                   recyclerView1.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
                   recyclerView1.getAdapter().notifyDataSetChanged();
                    a=1;


                }else
                {
                    gridview.setImageResource(R.drawable.ic_apps_black_24dp);
                        recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        recyclerView1.getAdapter().notifyDataSetChanged();
                    a=0;
                }


            }
        });

        exploreprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ProfileActivity.class) ;
                startActivity(intent);
            }
        });

        explorebeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MyBegActivity.class) ;
                startActivity(intent);
            }
        });

        dialogbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Uncomment the below code to Set the message and title from the strings.xml file
                builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

                //Setting message manually and performing action on button click
                builder.setMessage("Popular choice ")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Welcome");
                alert.show();
            }
        });



    }
}
