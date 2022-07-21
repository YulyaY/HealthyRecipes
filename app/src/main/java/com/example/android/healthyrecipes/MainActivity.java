package com.example.android.healthyrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<HealthyRecipeItem> healthyRecipeItems = new ArrayList<>();

        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_1,
                Utils.HEALTHY_1_TITLE, Utils.HEALTHY_1_DESCRIPTION, Utils.HEALTHY_1_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_2,
                Utils.HEALTHY_2_TITLE, Utils.HEALTHY_2_DESCRIPTION, Utils.HEALTHY_2_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_3,
                Utils.HEALTHY_3_TITLE, Utils.HEALTHY_3_DESCRIPTION, Utils.HEALTHY_3_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_4,
                Utils.HEALTHY_4_TITLE, Utils.HEALTHY_4_DESCRIPTION, Utils.HEALTHY_4_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_5,
                Utils.HEALTHY_5_TITLE, Utils.HEALTHY_5_DESCRIPTION, Utils.HEALTHY_5_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_6,
                Utils.HEALTHY_6_TITLE, Utils.HEALTHY_6_DESCRIPTION, Utils.HEALTHY_6_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_7,
                Utils.HEALTHY_7_TITLE, Utils.HEALTHY_7_DESCRIPTION, Utils.HEALTHY_7_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_8,
                Utils.HEALTHY_8_TITLE, Utils.HEALTHY_8_DESCRIPTION, Utils.HEALTHY_8_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_9,
                Utils.HEALTHY_9_TITLE, Utils.HEALTHY_9_DESCRIPTION, Utils.HEALTHY_9_RECIPE));
        healthyRecipeItems.add(new HealthyRecipeItem(R.drawable.healthy_10,
                Utils.HEALTHY_10_TITLE, Utils.HEALTHY_10_DESCRIPTION, Utils.HEALTHY_10_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new HealthyRecipeAdapter(healthyRecipeItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}