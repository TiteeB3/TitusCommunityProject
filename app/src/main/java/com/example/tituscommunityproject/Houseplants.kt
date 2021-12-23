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

class Houseplants : AppCompatActivity() {
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
        setContentView(R.layout.activity_houseplants)
        adjustFontScale(resources.configuration, 1.0f)

        // Animation when activity is launching
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right)
        pref = getSharedPreferences("MY Data", MODE_PRIVATE)
        mRecyclerView = findViewById(R.id.recycler_view)
        showData()

        // Changing ActionBar Color
        val actionBar: ActionBar?
        actionBar = supportActionBar
        actionBar!!.title = "[HOUSE PLANTS]"
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
        p.title = "Acalypha wilkesiana"
        p.description =
            "LIFE CYCLE:Annual and perennial,  GROWING ZONE:Tropical and sub tropical,  LEAF TYPE:Simple but broad,  FRUITING:Yes,  MATURED HEIGHT:3 feet tall,  LEAF SHAPE:Cordate, elliptical and  Ovate,  LEAF MARGIN:Serrate,  LEAF LENGTH:3-6 inches,  LEAF COLOR:Gold/Yellow, Green, Orange, Pink, Purple/Lavender, Red/Burgundy, Variegated, White,  STEM CHARACTERISTICS:Stem is erect with many branches and  closely arranged crown"
        p.img = R.drawable.acalyphawilkesiana
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Acalypha tricolor/ Irish petticoat/cupper leaf acalypha/Jacob's coat"
        p.family = "Euphorbiaceae"
        p.origin = "Fiji and South Pacific Islands"
        p.special_advantage_or_disadvantage = "medicinal (leaves)"
        p.condition =
            "Does well in bright light, on a good drainage soil,and it need about 3-6 feet space to plant"
        p.uses_or_type = "Foliage house plants"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection =
            "Mealybugs and whiteflies on Flowers and the foliage, Two spotted spider mite"
        p.pronounce_botanical_name = "{ Ah-CAL-eFA wel-KI-seea-NA}"
        p.serial_numbers = "001"
        ModelForPlantsLists.add(p)
        p = ModelForPlantList()
        p.title = "Acalypha wilkesiana var marginata"
        p.description =
            "LIFE CYCLE:Annual,  GROWING ZONE:Tropical and sub tropical,  LEAF TYPE:Simple but broad,  FRUITING:Yes,  MATURED HEIGHT:3 feet tall,  LEAF SHAPE:Cordate, elliptical and  Ovate, LEAF MARGIN:Serrate,  LEAF LENGTH:3-6 inches,  LEAF COLOR:Gold/Yellow, Green, Orange, Pink, Purple/Lavender, Red/Burgundy, Variegated and White.  STEM CHARACTERISTICS:Stem is erect with many branches and  closely arranged crown"
        p.img = R.drawable.acalyphamarginata
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Acalypha Marginata/Marginated acalypha"
        p.family = "Euphorbiaceae"
        p.origin = "Polynesia"
        p.special_advantage_or_disadvantage = "Medicinal"
        p.condition =
            "Does well in bright light, on a good drainage soil,and it need about 3-6 feet space to plant"
        p.uses_or_type = "Flowering house plants, Foliage shrubs"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection =
            "Indoor:  scale insects, spider mites, whiteflies, and mealybugs. Outdoor: downy mildew, powdery mildew, rust leaf spots and fungal root rots"
        p.pronounce_botanical_name = "{Ah-CAL-eFA wel-KI-seea-NA VAAR maH-GI-naa-TA}"
        p.serial_numbers = "002"
        ModelForPlantsLists.add(p)


        //2. CHECK AGAIN//
        p = ModelForPlantList()
        p.title = "Acalypha hispida"
        p.description =
            "LIFE CYCLE:Annual,  GROWING ZONE:Tropical and sub tropical,  LEAF TYPE:Simple but broad,  FRUITING:Yes,  MATURED HEIGHT:3 feet tall,  LEAF SHAPE:Cordate, elliptical and  Ovate, LEAF MARGIN:Serrate,  LEAF LENGTH:3-6 inches,  LEAF COLOR:Gold/Yellow, Green, Orange, Pink, Purple/Lavender, Red/Burgundy, Variegated and White.  STEM CHARACTERISTICS:Stem is erect with many branches and  closely arranged crown"
        p.img = R.drawable.acalyphahispida
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Red fingers, Red hot catstail"
        p.family = "Euphorbiaceae"
        p.origin = "Polynesia"
        p.special_advantage_or_disadvantage = "Medicinal"
        p.condition =
            "Does well in bright light, on a good drainage soil,and it need about 3-6 feet space to plant"
        p.uses_or_type = "Flowering house plants, Flowering shrubs"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection =
            "Indoor:  scale insects, spider mites, whiteflies, and mealybugs. Outdoor: downy mildew, powdery mildew, rust leaf spots and fungal root rots"
        p.pronounce_botanical_name = "{Ah-CAL-eFA wel-KI-seea-NA VAAR maH-GI-naa-TA}"
        p.serial_numbers = "003"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.setTitle("Adenium obesum");
        p.setDescription("LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 5 to 8 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). The stems and leaves both contain a milky sap (i.e. latex).");
        p.setImg(R.drawable.adeniumobesum);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Desert Rose");
        p.setFamily("Apocynaceae");
        p.setOrigin("");
        p.setSpecial_advantage_or_disadvantage("");
        p.setCondition("Grows well on a good drainage and occasionally wet soil.");
        p.setUses_or_type("Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Windbreaks, House plants, Flowering shrubs");
        p.setMethod_of_propagation("Stem cuttings");
        p.setCommon_disease_and_infection("Allamanda is regarded to be a plant that is resistant to most parasites and diseases But aphids and red spiders can attack the plant.");
        p.setPronounce_botanical_name("{al-ah-MAN-dah kah-THAR-tik-ah}");
        p.setSerial_numbers("004");
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.setTitle("Allamanda cathartica");
        p.setDescription("LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 5 to 8 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). The stems and leaves both contain a milky sap (i.e. latex).");
        p.setImg(R.drawable.allamandacathartica);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Golden trumpet");
        p.setFamily("Apocynaceae");
        p.setOrigin("South America, Tropical America, and Brazil");
        p.setSpecial_advantage_or_disadvantage("Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)");
        p.setCondition("Grows well on a good drainage and occasionally wet soil.");
        p.setUses_or_type("Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Windbreaks, House plants, Flowering shrubs");
        p.setMethod_of_propagation("Seed, cuttings");
        p.setCommon_disease_and_infection("Allamanda is regarded to be a plant that is resistant to most parasites and diseases But aphids and red spiders can attack the plant.");
        p.setPronounce_botanical_name("{al-ah-MAN-dah kah-THAR-tik-ah}");
        p.setSerial_numbers("005");
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.setTitle("Allamanda violacea");
        p.setDescription("LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5.4 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 7.5 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). ");
        p.setImg(R.drawable.allamandaviolaceae);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Purple allamanda");
        p.setFamily("Apocynaceae");
        p.setOrigin("Not native to North America");
        p.setSpecial_advantage_or_disadvantage("Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)");
        p.setCondition("Needs some amount of direct sunlight, Allamanda do well on a good drainage and occasionally wet soil.");
        p.setUses_or_type("Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Windbreaks, House plants, Flowering shrubs");
        p.setMethod_of_propagation("Stem Cuttings");
        p.setCommon_disease_and_infection("No pests or diseases are of major concern except for nematodes. Purple allamanda is only occasionally bothered by scale and mites.");
        p.setPronounce_botanical_name("{al-luh-MAN-duh vye-o-LAY-see-uh}");
        p.setSerial_numbers("006");
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.setTitle("Aglaonema modestrum");
        p.setDescription("LIFE CYCLE: Perennial   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple    FRUITING: Yes  MATURED HEIGHT: 24 inches           LEAF SHAPE: Ovate              LEAF MARGIN:  Undulate       LEAF LENGTH: 10 to 20 cm         LEAF COLOR: Green            LEAF ARRANGEMENT:   Spiral          STEM CHARACTERISTICS:  It is an evergreen perennial herb with dark green, erect, 20-50 cm tall, 0.4-2.0 cm thick stem, internodes 0.4-3.0 cm long");
        p.setImg(R.drawable.aglaonemamodestrum);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Chinese evergreen, Aglaonema acutispathum, Aglaonema costatum var. viride, Aglaonema laoticum");
        p.setFamily("Araceae");
        p.setOrigin("Not native to north America");
        p.setSpecial_advantage_or_disadvantage("Poisonous (Other: All parts of plant contain calcium oxalate crystals, an irritant to the mouth and oesophagus. Toxic to cats and dogs.");
        p.setCondition("It is shade tolerant and it will grow well In a good drainage and a moist soil");
        p.setUses_or_type("Foliage Houseplant, Perennial plant, Herbaceous plant, Poisonous plant");
        p.setMethod_of_propagation("Basal shoot or Suckers");
        p.setCommon_disease_and_infection("The plant is humidity tolerant");
        p.setPronounce_botanical_name("{ag-lay-o-NEE-muh mo-DESS-tum.}");
        p.setSerial_numbers("007");
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.setTitle("Aglaonema commutatum");
        p.setDescription("LIFE CYCLE: Perennial  GROWING ZONE: Tropical      LEAF TYPE: Simple    FRUITING: Yes   MATURED HEIGHT:            LEAF SHAPE: Elliptical, Lanceolate, Oblong              LEAF MARGIN:  Entire       LEAF LENGTH:  6 inches        LEAF COLOR:  Green, Variegated                   LEAF ARRANGEMENT:  Alternate            STEM CHARACTERISTICS:  Stem color is gray or silver, it has no aroma. It is also Erect, becoming decumbent, encircled with leaf scars.");
        p.setImg(R.drawable.aglaonemacommutatum);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Silver spear, Chinese evergreen, Golden Evergreen, Philippine Evergreen, Poison Dart Plant");
        p.setFamily("Araceae");
        p.setOrigin("Philippines, North eastern Celebes");
        p.setUses_or_type("Foliage Houseplant,Herbaceous, Perennial, Poisonous");
        p.setSpecial_advantage_or_disadvantage("Poisonous (The plant has a medium severity poison)");
        p.setCondition("It is shade tolerant and it will grow well In a good drainage and a moist soil");
        p.setMethod_of_propagation("Basal shoot or Suckers");
        p.setCommon_disease_and_infection("High humidity affects the plant");
        p.setPronounce_botanical_name("{ag-lay-o-NEE-muh kom-yoo-TAY-tum}");
        p.setSerial_numbers("008");
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.setTitle("Aglaonema commutatum");
        p.setTitle("Aglaonema pseudobracteatum");
        p.setDescription("LIFE CYCLE: Perennial   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple    FRUITING: Yes  MATURED HEIGHT: 24 inches           LEAF SHAPE: Ovate              LEAF MARGIN:  Undulate       LEAF LENGTH: 9 to 20 cm         LEAF COLOR: Green            LEAF ARRANGEMENT:   Spiral          STEM CHARACTERISTICS:  It is an evergreen perennial herb with dark green, erect, internodes 0.5-3.2 cm long");
        p.setImg(R.drawable.aglaonemapseudebracteatum1);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Golden evergreen");
        p.setFamily("Araceae");
        p.setOrigin("Malaya");
        p.setSpecial_advantage_or_disadvantage("Poisonous (Aglaonema plants are poisonous due to calcium oxalate crystals. If ingested they cause irritation of the mucous membranes, and the juice can cause skin irritation and painful rash.)");
        p.setCondition("The plant is humidity tolerant");
        p.setUses_or_type("Foliage Housepant, Perennial plant, Herbaceous plant, Poisonous plant");
        p.setMethod_of_propagation("Basal shoot or Suckers");
        p.setCommon_disease_and_infection("The plant is humidity tolerant");
        p.setPronounce_botanical_name("{ag-lay-o-NEE-muh sio-Do brack-tee-AY-tum}");
        p.setSerial_numbers("009");
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.setTitle("Alocasia amazonica");
        p.setDescription("LIFE CYCLE: Perennial  GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple     FRUITING: Yes  MATURED HEIGHT: 60 to 90 cm         LEAF SHAPE: Arrow shaped, Oblong, Ovate.              LEAF MARGIN:  Sinuate, Undulate.       LEAF LENGTH: 16 inches        LEAF COLOR: Dark bronze- green, White and green.            LEAF ARRANGEMENT:   Basal        STEM CHARACTERISTICS: This plant lacks a stem.");
        p.setImg(R.drawable.alocasiaamazonica);
        p.setImageView3(R.drawable.secondpicture);
        p.setCommon_name("Kris plant, Amozonian Elephant Ear, African Mask, Alocasia Polly.");
        p.setFamily("Araceae");
        p.setOrigin("Tropical Asia");
        p.setSpecial_advantage_or_disadvantage("Poisonous (Ingestion may cause severe discomfort)");
        p.setCondition("It is shade tolerant and Performs best in par shade in organically rich, moist to wet soils.");
        p.setUses_or_type("Foliage house plants");
        p.setMethod_of_propagation("Division");
        p.setCommon_disease_and_infection("When given proper care and grown in preferred conditions, Alocasia Amazonica is not plagued by any major disease problems. The biggest threat is root rot due to overly wet conditions. The only major pest that affects indoor grown Alocasia Amazonica’s is spider mites.");
        p.setPronounce_botanical_name("{al-oh-KAY-shah am-ah-ZON-ih-kah}");
        p.setSerial_numbers("010");
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