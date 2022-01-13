package com.example.tituscommunityproject

import android.content.SharedPreferences
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.ColorSpace
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


//        LIST OF PLANTS///

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


        p.title = "Antigonon leptopus var alba"
        p.img = R.drawable.antigononleptopusvaralba
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Corallita"
        p.family = "Polygonaceae"
        p.method_of_propagation = "Seed, Cutting, Tubers and layering"
        p.uses_or_type =
            "Suitable for pergolas, Archways and Verandah gardening ,Specimen plants, Climbers,  Climbing plants"
        p.condition = ""
        p.serial_numbers = "004"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Asparagus plumosus"
        p.description =
            "LIFE CYCLE: Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Compound    FRUITING: Yes (high fruits)    MATURED HEIGHT: 24 inches      LEAF SHAPE: Acicular.        LEAF MARGIN:  Entire.       LEAF LENGTH: 0.75 to 1 inch      LEAF COLOR: Green.            LEAF ARRANGEMENT:   Alternate       STEM CHARACTERISTICS: Stem emerges directly from the ground and become woody and spiny."
        p.img = R.drawable.asparagusplumosus
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Asparagus fern, Foxtail fern"
        p.family = "Asparagaceae"
        p.origin = "South Africa"
        p.special_advantage_or_disadvantage =
            "Poisonous (This plant renders a low toxicity if eaten)"
        p.condition =
            "Needs a well-drained soil. Sandy to loamy soil best, relatively high nitrogen requirement."
        p.uses_or_type =
            "Cut foliage, Medicinal plants, Ground covers, Accents, Border plants, Indoors, Climbers, Climbing plants, House plants."
        p.method_of_propagation = "Division (dividing the clumps)/ Seed"
        p.common_disease_and_infection =
            "Root rot if soil poorly drained. Be careful not to allow intrusion of Bermuda grass."
        p.pronounce_botanical_name = "{Ass-SPAR-uh-gus Plu-Mos-sus }"
        p.serial_numbers = "005 "
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Bougainvillea glabra"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.img = R.drawable.bougainvilleaglabra
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Wax begonia/ Purple bougainvillea/ Paper flowe"
        p.family = "Nyctaginaceae"
        p.method_of_propagation = "Hardwood cutting/ Air layering"
        p.uses_or_type =
            "Cut flowers, Specimen, Flowering house plants, Flowering shrubs, Climbers, Climbing plants"
        p.condition = "Usually trained to grow up walls and over arches trellis."
        p.serial_numbers = "006"
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{Ah-SKLEE-pee-us Kur-ah-SAV-ih-kah}"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Bougainvillea spectabillis"
        p.img = R.drawable.bougainvilleaspectabillis
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Paper flower (Red, Orange, Pink, White)"
        p.family = "Nyctaginaceae"
        p.method_of_propagation = "Hardwood cutting, Air layering"
        p.uses_or_type = "Flowering house plants, Flowering shrubs, Climbers, Climbing plants"
        p.condition =
            "Usually trained to grow up walls and over arches trellis. Cut flowers/ Specimen"
        p.serial_numbers = "007"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Clerodendron thomsonii"
        p.img = R.drawable.clerodendronthomsonii
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Bleeding heart"
        p.family = "Verbenaceae"
        p.method_of_propagation = "Hard wood cutting"
        p.uses_or_type = "Suitable as a climber, Climbers, Climbing plants"
        p.condition = ""
        p.serial_numbers = "008"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)



        p = ModelForPlantList()
        p.title = "Monstera deliciosa"
        p.img = R.drawable.monsteradeliciosa
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Swiss cheese plant/ Split leaf philodendron/ Ceriman"
        p.family = "Araceae"
        p.method_of_propagation = "Air layering/ Cuttings/ Suckers"
        p.uses_or_type = "Foliage house plant, Creeper, Climbing plants, Climbers"
        p.condition = ""
        p.serial_numbers = "009"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)

        //CHECK AGAIN//

        //CHECK AGAIN//
        p = ModelForPlantList()
        p.title = "Petrea volubilis"
        p.img = R.drawable.petreavolubilis
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Purple wreath/blue bird vine"
        p.family = "Verbenaceae"
        p.method_of_propagation = "Layering, Cutting or Seed"
        p.uses_or_type = "Climbers,Climbing plants, Useful in verandah gardening"
        p.condition = ""
        p.serial_numbers = "010"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Scindapsus aureus"
        p.img = R.drawable.scindapsusaureus
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Devil’s Ivy/ Golden Pothos"
        p.family = "Araceae"
        p.method_of_propagation = "Stem cuttings"
        p.uses_or_type = "Foliage house plants, Climbers, Houseplants, Climbing plants"
        p.condition = "Well lit but slues spot"
        p.serial_numbers = "011"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Solandra maxima"
        p.img = R.drawable.solandramaxima
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Cup of gold"
        p.family = "Solanaceae"
        p.method_of_propagation = "Cuttings"
        p.uses_or_type = "Climbing plants,  Climbers"
        p.condition = ""
        p.serial_numbers = "012"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Thunbergia alata"
        p.img = R.drawable.thumbergiaalata
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Black-eyed susan"
        p.family = "Acanthaceae"
        p.method_of_propagation = "Seed"
        p.uses_or_type = "Flowering pot plants, Climbers, Houseplants, Climbing plants"
        p.condition = "Bright light"
        p.serial_numbers = "013"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Ficus pumila"
        p.img = R.drawable.ficuspumila
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Creeping fig"
        p.family = "Moraceae"
        p.method_of_propagation = "Stem cutting"
        p.uses_or_type =
            "Flowering pot plants, Climbers, Houseplants, Climbing plants, To cover up walls"
        p.condition = "Bright light"
        p.serial_numbers = "014"
        p.description =
            "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:       LEAF SHAPE:        LEAF MARGIN:         LEAF LENGTH:       LEAF COLOR:             LEAF ARRANGEMENT:        STEM CHARACTERISTICS:  "
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{}"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Tristellateia australasiae"
        p.img = R.drawable.tristellateiaaustralasiae
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Galphimia vine"
        p.family = "Malpighiaceae"
        p.method_of_propagation = "Air layering"
        p.uses_or_type = "Good screen"
        p.condition = ""
        p.serial_numbers = "015"
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