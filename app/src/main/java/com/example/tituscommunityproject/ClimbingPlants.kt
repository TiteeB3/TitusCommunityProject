package com.example.tituscommunityproject

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tituscommunityproject.AdapterForPlantList
import android.content.SharedPreferences
import android.util.DisplayMetrics
import android.view.WindowManager
import android.os.Bundle
import com.example.tituscommunityproject.R
import android.graphics.drawable.ColorDrawable
import com.example.tituscommunityproject.ModelForPlantList
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.core.view.MenuItemCompat
import android.content.DialogInterface
import android.content.res.Configuration
import android.graphics.Color
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import java.util.*

class ClimbingPlants : AppCompatActivity() {
    var mRecyclerView: RecyclerView? = null
    var myAdapter: AdapterForPlantList? = null
    var pref: SharedPreferences? = null

    /// This together with the manifest code 'android:configChanges="keyboardHidden|orientation|screenSize"' Acoount for disabling of notificatio bar
    fun adjustFontScale(configuration: Configuration, scale: Float) {
        configuration.fontScale = scale
        val metrics = resources.displayMetrics
        val wm = getSystemService(WINDOW_SERVICE) as WindowManager
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        wm.defaultDisplay.getMetrics(metrics)
        metrics.scaledDensity = configuration.fontScale * metrics.density
        baseContext.resources.updateConfiguration(configuration, metrics)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_climbing_plants)
        adjustFontScale(resources.configuration, 1.0f)

        // Animation when activity is launching
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right)
        pref = getSharedPreferences("MY Data", MODE_PRIVATE)
        mRecyclerView = findViewById(R.id.recycler_view)
        showData()

        // Changing ActionBar Color
        val actionBar: ActionBar?
        actionBar = supportActionBar
        actionBar!!.title = "CLIMBING PLANTS"
        val colorDrawable = ColorDrawable(Color.parseColor("#EC008C"))
        actionBar.setBackgroundDrawable(colorDrawable)

        //Set recyclerView background color
        val recyclerView: RecyclerView
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.background.alpha = 130
    }

    private fun showData() {
        val ModelForPlantsLists = ArrayList<ModelForPlantList>()


        ////CHECK THE NUMBERING WELL
        //1//
        var p = ModelForPlantList()
        p.title = "Allamanda cathartica"
        p.description =
            "      [OTHER DESCRIPTIONS]                                                  LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 5 to 8 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). The stems and leaves both contain a milky sap (i.e. latex)."
        p.img = R.drawable.allamandacathartica
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Golden trumpet"
        p.family = "Apocynaceae"
        p.origin = "South America, Tropical America, and Brazil"
        p.special_advantage_or_disadvantage =
            "Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)"
        p.condition = "Grows well on a good drainage and occasionally wet soil."
        p.uses_or_type =
            "Perennials,Hedge, Vines or Climbers, Woodys, Windbreaks, Climbing plants, House plants, Flowering shrubs"
        p.method_of_propagation = "Seed, Stem cutting"
        p.common_disease_and_infection =
            "Allamanda is regarded to be a plant that is resistant to most parasites and diseases But aphids and red spiders can attack the plant."
        p.pronounce_botanical_name = "{al-ah-MAN-dah kah-THAR-tik-ah}"
        p.serial_numbers = "001"
        ModelForPlantsLists.add(p)
        p = ModelForPlantList()
        p.title = "Allamanda violacea"
        p.description =
            "LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5.4 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 7.5 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). "
        p.img = R.drawable.allamandaviolaceae
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Purple allamanda"
        p.family = "Apocynaceae"
        p.origin = "Not native to North America"
        p.special_advantage_or_disadvantage =
            "Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)"
        p.condition = "Allamanda do well on a good drainage and occasionally wet soil."
        p.uses_or_type =
            "Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Climbing plants, Windbreaks, House plants, Flowering shrubs"
        p.method_of_propagation = "Cuttings"
        p.common_disease_and_infection =
            "No pests or diseases are of major concern except for nematodes. Purple allamanda is only occasionally bothered by scale and mites."
        p.pronounce_botanical_name = "{al-luh-MAN-duh vye-o-LAY-see-uh}"
        p.serial_numbers = "002"
        ModelForPlantsLists.add(p)


        //2. CHECK AGAIN//
        p = ModelForPlantList()
        p.title = "Antigonon leptopus"
        p.img = R.drawable.antigononleptopus
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Corallita, Brides tears"
        p.family = "Polygonaceae"
        p.method_of_propagation = "Seed, Cutting"
        p.uses_or_type =
            "Suitable for pergolas, Archways and Verandah gardening ,Specimen plants, Climbing plants, verandah gardening, Bouquets"
        p.condition = ""
        p.serial_numbers = "003"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)
        val msortSettings = pref!!.getString("Sort", "ascending")
        if (msortSettings == "ascending") {
            Collections.sort(ModelForPlantsLists, ModelForPlantList.By_TITLE_ASCENDING)
        } else if (msortSettings == "descending") {
            Collections.sort(ModelForPlantsLists, ModelForPlantList.By_TITLE_DESCENDING)
        }
        mRecyclerView!!.layoutManager = LinearLayoutManager(this)
        myAdapter = AdapterForPlantList(this, ModelForPlantsLists)
        mRecyclerView!!.adapter = myAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.plant_list_menu, menu)
        val item = menu.findItem(R.id.action_search)
        val searchView = MenuItemCompat.getActionView(item) as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                myAdapter!!.getFilter().filter(query)
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                myAdapter!!.getFilter().filter(newText)
                return false
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_sort) {
            showSortDialog()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showSortDialog() {
        val option = arrayOf("Ascending", "Descending")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Sort By?")
        builder.setIcon(R.drawable.ic_action_sort)
        builder.setItems(option) { dialog, which ->
            if (which == 0) {
                val editor = pref!!.edit()
                editor.putString("Sort", "ascending")
                editor.apply()
                showData()
            }
            if (which == 1) {
                val editor = pref!!.edit()
                editor.putString("Sort", "descending")
                editor.apply()
                showData()
            }
        }
        builder.create().show()
    }

    // To apply transition when back is pressed
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right)
    }
}