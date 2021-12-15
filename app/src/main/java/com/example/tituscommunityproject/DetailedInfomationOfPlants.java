package com.example.tituscommunityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedInfomationOfPlants extends AppCompatActivity {
    private Button goToHome;
    TextView mdetailTitleTv, mdetailDescrTv, mdetailCommonnameTv, mdetailFamilyTv, mdetailOriginTv, mdetailSpecialadvantageordisadvantage,mdetailCondition, mdetailUsesortype, mdetailMethodofpropagation, mdetailCommondiseasesandinfection, mdetailpronouncebotanicalname, mdetailserialnumber;
    ImageView mdetailImage;



    /// This together with the manifest code 'android:configChanges="keyboardHidden|orientation|screenSize"' Acoount for disabling of notificatio bar
    public  void adjustFontScale(Configuration configuration, float scale) {

        configuration.fontScale = scale;
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        wm.getDefaultDisplay().getMetrics(metrics);

        metrics.scaledDensity = configuration.fontScale * metrics.density;
        getBaseContext().getResources().updateConfiguration(configuration, metrics);

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_infomation_of_plants);



        goToHome = (Button) findViewById(R.id.gotohome);
        goToHome.getBackground().setAlpha(12);
        goToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategoryPage();
            }
        });



        //i ignored to set the back button//
        //ActionBar actionBar  = getSupportActionBar();
        // ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF090D0D"));
        // actionBar.setBackgroundDrawable(colorDrawable);


        mdetailTitleTv=findViewById(R.id.detailmodelTitleTv);
        mdetailDescrTv=findViewById(R.id.detailmodelDescrTv);
        mdetailCommonnameTv=findViewById(R.id.detailcommon_name);
        mdetailFamilyTv=findViewById(R.id.detailfamily);
        mdetailOriginTv=findViewById(R.id.detailorigin);
        mdetailSpecialadvantageordisadvantage=findViewById(R.id.detailspecial_advantage_or_disadvantage);
        mdetailCondition=findViewById(R.id.detailcondition);
        mdetailUsesortype=findViewById(R.id.detailuses_or_type);
        mdetailMethodofpropagation=findViewById(R.id.detailmethod_of_propagation);
        mdetailCommondiseasesandinfection=findViewById(R.id.dcommondiseasesandinfection);
        mdetailpronouncebotanicalname=findViewById(R.id.detailprouncebotanicalname);
        mdetailserialnumber=findViewById(R.id.detailedserialnumber);
        mdetailImage=findViewById(R.id.detail_image);




        Intent intent = getIntent();
        String mTitleTv=intent.getStringExtra("iTitleTv");
        String mpronouncebotanicalname=intent.getStringExtra("ipronouncebotanicalname");
        String mDescrTv=intent.getStringExtra("iDescrTv");
        String mCommonnameTv=intent.getStringExtra("iCommonnameTv");
        String mFamilyTv=intent.getStringExtra("iFamilyTv");
        String mOrigin=intent.getStringExtra("iOriginTv");
        String mSpecialadvantageordisadvantage=intent.getStringExtra("iSpecialadvantageordisadvantage");
        String mCondition=intent.getStringExtra("iCondition");
        String mUsesortype=intent.getStringExtra("iUsesortype");
        String mMethodofpropagation=intent.getStringExtra("iMethodofpropagation");
        String mCommondiseasesandinfection=intent.getStringExtra("iCommondiseasesandinfection");
        String mSerialNu=intent.getStringExtra("iSerialNu");

        // Below is for image in detils
        byte[] mBytes  = getIntent().getByteArrayExtra("imageInDetails");

        // Now i decode the image because we got it bytes in the previous activity

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);

        /// Title of theactionBar is set below
        //actionBar.setTitle("DETAILED INFORMATION");


        // Setting the Data in the View
        mdetailpronouncebotanicalname.setText(mpronouncebotanicalname);
        mdetailTitleTv.setText(mTitleTv);
        mdetailDescrTv.setText(mDescrTv);
        mdetailCommonnameTv.setText(mCommonnameTv);
        mdetailFamilyTv.setText(mFamilyTv);
        mdetailOriginTv.setText(mOrigin);
        mdetailSpecialadvantageordisadvantage.setText(mSpecialadvantageordisadvantage);
        mdetailCondition.setText(mCondition);
        mdetailUsesortype.setText(mUsesortype);
        mdetailMethodofpropagation.setText(mMethodofpropagation);
        mdetailCommondiseasesandinfection.setText(mCommondiseasesandinfection);
        mdetailserialnumber.setText(mSerialNu);

        // That for the Image is below
        mdetailImage.setImageBitmap(bitmap);


    }

    public void openCategoryPage(){
        Intent intent = new Intent(this, CategoryPage.class);
        startActivity(intent);
    }
}