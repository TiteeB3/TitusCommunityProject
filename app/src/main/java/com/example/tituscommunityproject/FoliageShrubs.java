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

public class FoliageShrubs extends AppCompatActivity {

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
        setContentView(R.layout.activity_foliage_shrubs);

        adjustFontScale( getResources().getConfiguration(),1.0f);

        // Animation when activity is launching
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);




        pref = this.getSharedPreferences("MY Data", MODE_PRIVATE);

        mRecyclerView = findViewById(R.id.recycler_view);


        showData();

        // Changing ActionBar Color
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("FOLIAGE SHRUBS");
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
        p.setTitle("Acalypha torta");
        p.setImg(R.drawable.acalyphatorta);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("");//check it
        p.setFamily("Euphorbiaceae");
        p.setMethod_of_propagation("Cutting");
        p.setUses_or_type("Bedding plants, Foliage shrubs, Specimen plants, Hedge plant");
        p.setCondition("");
        p.setSerial_numbers("001");
        p.setDescription("LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  ");
        p.setOrigin("");
        p.setSpecial_advantage_or_disadvantage("");
        p.setCommon_disease_and_infection("");
        p.setPronounce_botanical_name("");
        ModelForPlantsLists.add(p);


        p = new ModelForPlantList();
        p.setTitle("Acalypha willinckii/ Acalypha siamensis");
        p.setDescription("LIFE CYCLE:Annual,  GROWING ZONE:Tropical and sub tropical,  LEAF TYPE:Simple but broad,  FRUITING:Yes,  MATURED HEIGHT:3 feet tall,  LEAF SHAPE:Cordate, elliptical and  Ovate, LEAF MARGIN:Serrate,  LEAF LENGTH:3-6 inches,  LEAF COLOR:Gold/Yellow, Green, Orange, Pink, Purple/Lavender, Red/Burgundy, Variegated and White.  STEM CHARACTERISTICS:Stem is erect with many branches and  closely arranged crown");
        p.setImg(R.drawable.acalyphawillinckii);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Variegated acalypha");
        p.setFamily("Euphorbiaceae");
        p.setOrigin("Polynesia");
        p.setSpecial_advantage_or_disadvantage("Medicinal");
        p.setCondition("Does well in bright light, on a good drainage soil,and it need about 3-6 feet space to plant");
        p.setUses_or_type("Flowering house plants, Foliage shrubs");
        p.setMethod_of_propagation("Stem cuttings");
        p.setCommon_disease_and_infection("Indoor:  scale insects, spider mites, whiteflies, and mealybugs. Outdoor: downy mildew, powdery mildew, rust leaf spots and fungal root rots");
        p.setPronounce_botanical_name("{Ah-CAL-eFA wel-KI-seea-NA VAAR maH-GI-naa-TA}");
        p.setSerial_numbers("002");
        ModelForPlantsLists.add(p);


        //2. CHECK AGAIN//
        p = new ModelForPlantList();
        p.setTitle("Breynia nivosa");
        p.setImg(R.drawable.breynianivosa);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Ice plant/snow plant");
        p.setFamily("Euphorbiaceae");
        p.setMethod_of_propagation("Stem cutting");
        p.setUses_or_type("Foliage shrubs, Houseplants");
        p.setCondition("Does weed in bright light");
        p.setSerial_numbers("003");
        p.setDescription("LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  ");
        p.setOrigin("");
        p.setSpecial_advantage_or_disadvantage("");
        p.setCommon_disease_and_infection("");
        p.setPronounce_botanical_name("");
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