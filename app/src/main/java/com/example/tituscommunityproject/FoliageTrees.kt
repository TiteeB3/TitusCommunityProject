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

class FoliageTrees : AppCompatActivity() {
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
        setContentView(R.layout.activity_foliage_trees)
        adjustFontScale(resources.configuration, 1.0f)

        // Animation when activity is launching
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right)
        pref = getSharedPreferences("MY Data", MODE_PRIVATE)
        mRecyclerView = findViewById(R.id.recycler_view)
        showData()

        // Changing ActionBar Color
        val actionBar: ActionBar?
        actionBar = supportActionBar
        actionBar!!.title = "FOLIAGE TREES"
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
        p.title = "Adenanthera pavonina"
        p.description =
            "LIFE CYCLE: Perennial  GROWING ZONE: Tropical      LEAF TYPE: Simple    FRUITING: Yes   MATURED HEIGHT:            LEAF SHAPE: Elliptical, Lanceolate, Oblong              LEAF MARGIN:  Entire       LEAF LENGTH:  6 inches        LEAF COLOR:  Green, Variegated                   LEAF ARRANGEMENT:  Alternate            STEM CHARACTERISTICS:  Stem color is gray or silver, it has no aroma. It is also Erect, becoming decumbent, encircled with leaf scars."
        p.img = R.drawable.adenantherapavonina
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Bead tree"
        p.family = "Mimosoideae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Avenue trees, shade plants"
        p.condition = ""
        p.serial_numbers = "001"
        p.origin = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)
        p = ModelForPlantList()
        p.title = "Albizia saman (Pithecellobium samam)"
        p.description =
            "LIFE CYCLE: Perennial  GROWING ZONE: Tropical      LEAF TYPE: Simple    FRUITING: Yes   MATURED HEIGHT:            LEAF SHAPE: Elliptical, Lanceolate, Oblong              LEAF MARGIN:  Entire       LEAF LENGTH:  6 inches        LEAF COLOR:  Green, Variegated                   LEAF ARRANGEMENT:  Alternate            STEM CHARACTERISTICS:  Stem color is gray or silver, it has no aroma. It is also Erect, becoming decumbent, encircled with leaf scars."
        p.img = R.drawable.albiziasaman
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Rain tree"
        p.family = "Mimosoideae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Avenue trees,shade plants"
        p.condition = ""
        p.serial_numbers = "002"
        p.origin = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        //2. CHECK AGAIN//
        p = ModelForPlantList()
        p.title = "Artocarpus incisus"
        p.description =
            "LIFE CYCLE: Perennial  GROWING ZONE: Tropical      LEAF TYPE: Simple    FRUITING: Yes   MATURED HEIGHT:            LEAF SHAPE: Elliptical, Lanceolate, Oblong              LEAF MARGIN:  Entire       LEAF LENGTH:  6 inches        LEAF COLOR:  Green, Variegated                   LEAF ARRANGEMENT:  Alternate            STEM CHARACTERISTICS:  Stem color is gray or silver, it has no aroma. It is also Erect, becoming decumbent, encircled with leaf scars."
        p.img = R.drawable.artocarpusincisus
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Bread fruit/ bread nut tree"
        p.family = "Moraceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen plants"
        p.condition = ""
        p.serial_numbers = "003"
        p.origin = ""
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