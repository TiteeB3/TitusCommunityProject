package com.example.tituscommunityproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class HolderForPlantsList extends RecyclerView.ViewHolder implements View.OnClickListener{


    ImageView mImageIv;
    ImageView mDetailedImage;
    TextView mTitleTv, mDescrTv,mCommonnameTv,mFamilyTv,mOriginTv,mSpecialadvantageordisadvantage,mCondition,mUsesortype,mMethodofpropagation,mCommondiseasesandinfection,mpronouncebotanicalname;
    TextView mSerialNu;
    ItemClickListener itemClickListener;

    public HolderForPlantsList(View view){
        super(view);
        this.mImageIv=itemView.findViewById(R.id.modelImageIv);
        this.mDetailedImage=itemView.findViewById(R.id.imageView3);
        this.mTitleTv=itemView.findViewById(R.id.modelTitleTv);
        this.mDescrTv=itemView.findViewById(R.id.modelDescrTv);
        this.mCommonnameTv=itemView.findViewById(R.id.common_name);
        this.mFamilyTv=itemView.findViewById(R.id.family);
        this.mOriginTv=itemView.findViewById(R.id.origin);
        this.mSpecialadvantageordisadvantage=itemView.findViewById(R.id.special_advantage_or_disadvantage);
        this.mCondition=itemView.findViewById(R.id.condition);
        this.mUsesortype=itemView.findViewById(R.id.uses_or_type);
        this.mMethodofpropagation=itemView.findViewById(R.id.method_of_propagation);
        this.mCommondiseasesandinfection=itemView.findViewById(R.id.common_diseases_and_infection);
        this.mpronouncebotanicalname=itemView.findViewById(R.id.pronouncebotanicalname);
        this.mSerialNu = itemView.findViewById(R.id.serialnumber);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v,getLayoutPosition());

    }
    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
