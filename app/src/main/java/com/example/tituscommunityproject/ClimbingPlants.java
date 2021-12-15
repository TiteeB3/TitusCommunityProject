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

public class ClimbingPlants extends AppCompatActivity {

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
        setContentView(R.layout.activity_climbing_plants);

        adjustFontScale( getResources().getConfiguration(),1.0f);

        // Animation when activity is launching
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);




        pref = this.getSharedPreferences("MY Data", MODE_PRIVATE);

        mRecyclerView = findViewById(R.id.recycler_view);


        showData();

        // Changing ActionBar Color
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("CLIMBING PLANTS");
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
        p.setTitle("Allamanda cathartica");
        p.setDescription("      [OTHER DESCRIPTIONS]                                                  LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 5 to 8 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). The stems and leaves both contain a milky sap (i.e. latex).");
        p.setImg(R.drawable.allamandacathartica);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Golden trumpet");
        p.setFamily("Apocynaceae");
        p.setOrigin("South America, Tropical America, and Brazil");
        p.setSpecial_advantage_or_disadvantage("Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)");
        p.setCondition("Grows well on a good drainage and occasionally wet soil.");
        p.setUses_or_type("Perennials,Hedge, Vines or Climbers, Woodys, Windbreaks, Climbing plants, House plants, Flowering shrubs");
        p.setMethod_of_propagation("Seed, Stem cutting");
        p.setCommon_disease_and_infection("Allamanda is regarded to be a plant that is resistant to most parasites and diseases But aphids and red spiders can attack the plant.");
        p.setPronounce_botanical_name("{al-ah-MAN-dah kah-THAR-tik-ah}");
        p.setSerial_numbers("001");
        ModelForPlantsLists.add(p);


        p = new ModelForPlantList();
        p.setTitle("Allamanda violacea");
        p.setDescription("LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5.4 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 7.5 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). ");
        p.setImg(R.drawable.allamandaviolaceae);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Purple allamanda");
        p.setFamily("Apocynaceae");
        p.setOrigin("Not native to North America");
        p.setSpecial_advantage_or_disadvantage("Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)");
        p.setCondition("Allamanda do well on a good drainage and occasionally wet soil.");
        p.setUses_or_type("Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Climbing plants, Windbreaks, House plants, Flowering shrubs");
        p.setMethod_of_propagation("Cuttings");
        p.setCommon_disease_and_infection("No pests or diseases are of major concern except for nematodes. Purple allamanda is only occasionally bothered by scale and mites.");
        p.setPronounce_botanical_name("{al-luh-MAN-duh vye-o-LAY-see-uh}");
        p.setSerial_numbers("002");
        ModelForPlantsLists.add(p);


        //2. CHECK AGAIN//
        p = new ModelForPlantList();
        p.setTitle("Antigonon leptopus");
        p.setImg(R.drawable.antigononleptopus);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Corallita, Brides tears");
        p.setFamily("Polygonaceae");
        p.setMethod_of_propagation("Seed, Cutting");
        p.setUses_or_type("Suitable for pergolas, Archways and Verandah gardening ,Specimen plants, Climbing plants, verandah gardening, Bouquets");
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