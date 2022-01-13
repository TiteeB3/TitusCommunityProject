package com.example.tituscommunityproject

import android.content.SharedPreferences
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import android.widget.SearchView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuItemCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class FloweringTrees : AppCompatActivity() {
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
        setContentView(R.layout.activity_flowering_trees)
        adjustFontScale(resources.configuration, 1.0f)

        // Animation when activity is launching
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right)
        pref = getSharedPreferences("MY Data", MODE_PRIVATE)
        mRecyclerView = findViewById(R.id.recycler_view)
        showData()

        // Changing ActionBar Color
        val actionBar: ActionBar?
        actionBar = supportActionBar
        actionBar!!.title = "FLOWERING TREES"
        val colorDrawable = ColorDrawable(Color.parseColor("#EC008C"))
        actionBar.setBackgroundDrawable(colorDrawable)

        //Set recyclerView background color
        val recyclerView: RecyclerView
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.background.alpha = 130
    }

    private fun showData() {
        val ModelForPlantsLists = ArrayList<ModelForPlantList>()


//        LIST OF PLANTS ///
        var p = ModelForPlantList()
        p.title = "Acacia auriculiformis"
        p.img = R.drawable.acaciaauriculiforis
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Ear leaf acacia"
        p.family = "Mimosoideae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen trees, avenue plants"
        p.condition = ""
        p.serial_numbers = "001"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)



        p = ModelForPlantList()
        p.title = "Bauhinia purpurea"
        p.img = R.drawable.bauhiniapupurea
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Purple bauhinia"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen, Hedge, Shelter belts"
        p.condition = ""
        p.serial_numbers = "002"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Bauhinia variegata"
        p.img = R.drawable.bauhiniavariegata
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Orchid tree"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen, Hedges, Shelter belts"
        p.condition = ""
        p.serial_numbers = "003"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Bauhinia tomentosa"
        p.img = R.drawable.bauhiniatomentosa
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Yellow bauhinia"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen, Hedges, Shelter belts"
        p.condition = ""
        p.serial_numbers = "004"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Bauhinia galpinii"
        p.img = R.drawable.bauhiniagalpinii
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Red bauhinia"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Shelter, Hedges, Avenue trees"
        p.condition = ""
        p.serial_numbers = "005"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Bauhinia purpurea"
        p.img = R.drawable.bauhiniapupurea
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Purple Bauhinia"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Shelter, Hedges, Avenue trees"
        p.condition = ""
        p.serial_numbers = "006"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Calliandra surinamensis"
        p.img = R.drawable.calliandrasurinamensis
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Pink Powder Puff"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "007"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Cassia fistula"
        p.img = R.drawable.cassiafistula
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Golden shower"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed, Stem cutting"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "008"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Cassia nodosa"
        p.img = R.drawable.cassianodosa
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Pink cassia"
        p.family = "Caesalpinoideae"
        p.method_of_propagation = "Seed, cutting"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "009"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Cassia spectabilis"
        p.img = R.drawable.cassiaspectabilis
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Yellow cassia"
        p.family = "Caesalpinoideae"
        p.method_of_propagation = "Seed, cutting"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "010"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Erythrina indica"
        p.img = R.drawable.erythrinaindica
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Indian coral tree"
        p.family = "Papilionaceae"
        p.method_of_propagation = "Seed, cutting"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "011"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Erythrina variegata"
        p.img = R.drawable.erythrinavarigata
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Indian coral tree"
        p.family = "Papilionaceae"
        p.method_of_propagation = "Seed, cutting"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "012"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Jacaranda mimosifolia"
        p.img = R.drawable.jacarandamimosifolia
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Jacaranda"
        p.family = "Bignoniaceae"
        p.method_of_propagation = "Stem cuttings/seed"
        p.uses_or_type = "Avenue/ Specimen planting"
        p.condition = "Bright light but some direct sun is beneficial"
        p.serial_numbers = "013"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Lagerstroemia speciosa"
        p.img = R.drawable.lagerstroemiaspeciosa
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Queen flower or pride of India"
        p.family = "Lythraceae"
        p.method_of_propagation = "Seed, cutting"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "014"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Milletia thonningii"
        p.img = R.drawable.milletiathonningii1
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Indian Cork Tree"
        p.family = "Bignoniaceae"
        p.method_of_propagation = "Suckers"
        p.uses_or_type = "Specimen plants, Avenue trees"
        p.condition = ""
        p.serial_numbers = "015"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Moringa oleifera"
        p.img = R.drawable.moringaoleifera
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Drumstick tree/ Horseradish tree"
        p.family = "Moringaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen plants"
        p.condition = ""
        p.serial_numbers = "016"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)




        p = ModelForPlantList()
        p.title = "Peltophorum pterocarpum"
        p.img = R.drawable.peltophorumpterocarpum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Rust Tree"
        p.family = "Fabaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Specimen at times shade"
        p.condition = ""
        p.serial_numbers = "017"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Plumeria alba"
        p.img = R.drawable.plumeriaalba
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Frangipani/ Forget-me-not"
        p.family = "Apocynaceae"
        p.method_of_propagation = "Stem cutting"
        p.uses_or_type = "Specimen tree"
        p.condition = ""
        p.serial_numbers = "018"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = ""
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