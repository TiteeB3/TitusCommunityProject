package com.example.tituscommunityproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class AdapterForPlantList extends RecyclerView.Adapter<HolderForPlantsList>implements Filterable {

    Context c;
    ArrayList<ModelForPlantList> models, filterList;
    CustomFilterForSearch filter;

    AdapterForPlantList(Context c, ArrayList<ModelForPlantList> models) {
        this.c = c;
        this.models = models;
        this.filterList = models;
    }
    @NonNull
    @Override
    public HolderForPlantsList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model_for_plant_list, null);
        return new HolderForPlantsList(v);
    }


    @Override
    public void onBindViewHolder(@NonNull final HolderForPlantsList holder, final int position) {
        holder.mTitleTv.setText(models.get(position).getTitle());
        holder.mpronouncebotanicalname.setText(models.get(position).getPronounce_botanical_name());
        holder.mDescrTv.setText(models.get(position).getDescription());
        holder.mImageIv.setImageResource(models.get(position).getImg());
        holder.mUsesortype.setText(models.get(position).getUses_or_type());
        holder.mCommonnameTv.setText(models.get(position).getCommon_name());
        holder.mFamilyTv.setText(models.get(position).getFamily());
        holder.mOriginTv.setText(models.get(position).getOrigin());
        holder.mSpecialadvantageordisadvantage.setText(models.get(position).getSpecial_advantage_or_disadvantage());
        holder.mCondition.setText(models.get(position).getCondition());
        holder.mMethodofpropagation.setText(models.get(position).getMethod_of_propagation());
        holder.mCommondiseasesandinfection.setText(models.get(position).getCommon_disease_and_infection());
        holder.mSerialNu.setText(models.get(position).getSerial_numbers());
        holder.mDetailedImage.setImageResource(models.get(position).getImageView3());


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {


                String gTitleTv = models.get(position).getTitle();
                String gDescrTv = models.get(position).getDescription();
                String gCommonnameTv = models.get(position).getCommon_name();
                String gFamilyTv = models.get(position).getFamily();
                String gOriginTv= models.get(position).getOrigin();
                String gSpecialadvantageordisadvantage= models.get(position).getSpecial_advantage_or_disadvantage();
                String gCondition= models.get(position).getCondition();
                String gUsesortype= models.get(position).getUses_or_type();
                String gMethodofpropagation= models.get(position).getMethod_of_propagation();
                String gCommondiseasesandinfection= models.get(position).getCommon_disease_and_infection();
                String gpronouncebname = models.get(position).getPronounce_botanical_name();
                String gSerialNumbers = models.get(position).getSerial_numbers();

                // Below is for image to be transformed and appear in detailed page
                BitmapDrawable bitmapDrawable = (BitmapDrawable)holder.mDetailedImage.getDrawable();


                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                byte[] bytes = stream.toByteArray();





                Intent intent = new Intent(c, DetailedInfomationOfPlants.class);
                intent.putExtra("ipronouncebotanicalname", gpronouncebname);
                intent.putExtra("iTitleTv", gTitleTv);
                intent.putExtra("iDescrTv", gDescrTv);
                intent.putExtra("iCommonnameTv", gCommonnameTv);
                intent.putExtra("iFamilyTv", gFamilyTv);
                intent.putExtra("iOriginTv", gOriginTv);
                intent.putExtra("iSpecialadvantageordisadvantage", gSpecialadvantageordisadvantage);
                intent.putExtra("iCondition", gCondition);
                intent.putExtra("iUsesortype", gUsesortype);
                intent.putExtra("iMethodofpropagation", gMethodofpropagation);
                intent.putExtra("iCommondiseasesandinfection", gCommondiseasesandinfection);
                intent.putExtra("iSerialNu", gSerialNumbers);

                // below is for image in details
                intent.putExtra("imageInDetails", bytes);
                c.startActivity(intent);
            }
        });



}

    @Override
    public int getItemCount() {
        return models.size();
    }

    public Filter getFilter() {
        if (filter==null){
            filter = new CustomFilterForSearch(filterList, this);
        }
        return filter;
    }
}
