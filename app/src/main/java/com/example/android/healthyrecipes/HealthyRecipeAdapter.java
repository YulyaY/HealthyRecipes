package com.example.android.healthyrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HealthyRecipeAdapter extends RecyclerView.Adapter<HealthyRecipeAdapter.HealthyRecipeViewHolder>
 {

    ArrayList<HealthyRecipeItem> healthyRecipeItems;
    Context context;


    public HealthyRecipeAdapter(ArrayList<HealthyRecipeItem> healthyRecipeItems, Context context) {
        this.healthyRecipeItems = healthyRecipeItems;
        this.context = context;
    }

    @NonNull
    @Override
    public HealthyRecipeAdapter.HealthyRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.healthy_recipes_item,
                parent, false);
        HealthyRecipeViewHolder healthyRecipeViewHolder = new HealthyRecipeViewHolder(view);
        return healthyRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HealthyRecipeViewHolder holder, int position) {
        HealthyRecipeItem healthyRecipeItem = healthyRecipeItems.get(position);
        holder.healthyImageView.setImageResource(healthyRecipeItem.getImageResource());
        holder.title.setText(healthyRecipeItem.getTitle());
        holder.description.setText(healthyRecipeItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return healthyRecipeItems.size();
    }

    class HealthyRecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView healthyImageView;
        public TextView title;
        public TextView description;

        public HealthyRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            healthyImageView = itemView.findViewById(R.id.healthyImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }

        @Override
        public void onClick(View view) {
            int position = getBindingAdapterPosition();
            HealthyRecipeItem healthyRecipeItem = healthyRecipeItems.get(position);

            Intent intent = new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResource", healthyRecipeItem.getImageResource());
            intent.putExtra("title", healthyRecipeItem.getTitle());
            intent.putExtra("description", healthyRecipeItem.getDescription());
            intent.putExtra("recipe", healthyRecipeItem.getRecipe());
            context.startActivity(intent);
        }
    }

}
