package com.example.android.healthyrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);
        ImageView imageResource = findViewById(R.id.healthyImageView);

        Intent intent = getIntent();
        if (intent !=null) {
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));
            int image_link = getIntent().getIntExtra("imageResource", 1);
                imageResource.setImageResource(image_link);
        }
    }
}