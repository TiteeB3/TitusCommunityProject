package com.example.tituscommunityproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Collections;

public class Conifers extends AppCompatActivity {
    RecyclerView mRecyclerView;
    AdapterForPlantList myAdapter;
    SharedPreferences pref;


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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conifers);

        adjustFontScale( getResources().getConfiguration(),1.0f);

        // Animation when activity is launching
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);




        pref = this.getSharedPreferences("MY Data", MODE_PRIVATE);

        mRecyclerView = findViewById(R.id.recycler_view);


        showData();

        // Changing ActionBar Color
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("CONIFERS");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#EC008C"));
        actionBar.setBackgroundDrawable(colorDrawable);

        //Set recyclerView background color
        RecyclerView recyclerView;
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.getBackground().setAlpha(130);



    }


    private void showData() {

        ArrayList<ModelForPlantList> ModelForPlantsLists = new ArrayList<>();


        ////CHECK THE NUMBERING WELL
        //1//
        ModelForPlantList p = new ModelForPlantList();
        p.setTitle("Araucaria heterophylla");
        p.setImg(R.drawable.araucariaheterophylla);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Norfolk Island pine");
        p.setFamily("Araucariaceae");
        p.setMethod_of_propagation("Difficult to propagate");
        p.setUses_or_type("Specimen/Sea-side planting");
        p.setCondition("");
        p.setSerial_numbers("001");
        p.setDescription("LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  ");
        p.setOrigin("");
        p.setSpecial_advantage_or_disadvantage("");
        p.setCommon_disease_and_infection("");
        p.setPronounce_botanical_name("{}");
        ModelForPlantsLists.add(p);


        p = new ModelForPlantList();
        p.setTitle("Thuja orientalis");
        p.setImg(R.drawable.thujaorientalis);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Oriental arborvitae");
        p.setFamily("Cupressaceae");
        p.setMethod_of_propagation("Seed/ Stem cutting");
        p.setUses_or_type("It makes a lovely specimen plant");
        p.setCondition("");
        p.setSerial_numbers("002");
        p.setDescription("LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  ");
        p.setOrigin("");
        p.setSpecial_advantage_or_disadvantage("");
        p.setCommon_disease_and_infection("");
        p.setPronounce_botanical_name("{}");
        ModelForPlantsLists.add(p);


        //2. CHECK AGAIN//
        p = new ModelForPlantList();
        p.setTitle("Thuja occidentalis");
        p.setImg(R.drawable.thujaoccidentalis);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Arborvitae");
        p.setFamily("Cupressaceae");
        p.setMethod_of_propagation("Seed/ Stem cutting");
        p.setUses_or_type("It makes a lovely specimen plant");
        p.setCondition("");
        p.setSerial_numbers("003");
        p.setDescription("LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  ");
        p.setOrigin("");
        p.setSpecial_advantage_or_disadvantage("");
        p.setCommon_disease_and_infection("");
        p.setPronounce_botanical_name("{}");
        ModelForPlantsLists.add(p);


        String msortSettings = pref.getString("Sort", "ascending");
        if (msortSettings.equals("ascending")){
            Collections.sort(ModelForPlantsLists, ModelForPlantList.By_TITLE_ASCENDING);
        }
        else if (msortSettings.equals("descending")){
            Collections.sort(ModelForPlantsLists, ModelForPlantList.By_TITLE_DESCENDING);
        }



        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new AdapterForPlantList(this, ModelForPlantsLists);
        mRecyclerView.setAdapter(myAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.plant_list_menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                myAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                myAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_sort){
            showSortDialog();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showSortDialog() {
        String[] option = {"Ascending", "Descending"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Sort By?");
        builder.setIcon(R.drawable.ic_action_sort);
        builder.setItems(option, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("Sort", "ascending");
                    editor.apply();
                    showData();
                }
                if (which == 1) {
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("Sort", "descending");
                    editor.apply();
                    showData();
                }
            }
        });
        builder.create().show();
    }

    // To apply transition when back is pressed
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}