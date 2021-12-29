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


//        LIST OF PLANTS IN THE HOUSEPLANTS
//        DETAILS ARE INCOMPLETE, WILL ADD MORE INFORMATION LATER


        var p = ModelForPlantList()
        p.title = "Acalypha wilkesiana"
        p.description = "LIFE CYCLE:Annual and perennial,  GROWING ZONE:Tropical and sub tropical,  LEAF TYPE:Simple but broad,  FRUITING:Yes,  MATURED HEIGHT:3 feet tall,  LEAF SHAPE:Cordate, elliptical and  Ovate,  LEAF MARGIN:Serrate,  LEAF LENGTH:3-6 inches,  LEAF COLOR:Gold/Yellow, Green, Orange, Pink, Purple/Lavender, Red/Burgundy, Variegated, White,  STEM CHARACTERISTICS:Stem is erect with many branches and  closely arranged crown"
        p.img = R.drawable.acalyphawilkesiana
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Acalypha tricolor/ Irish petticoat/cupper leaf acalypha/Jacob's coat"
        p.family = "Euphorbiaceae"
        p.origin = "Fiji and South Pacific Islands"
        p.special_advantage_or_disadvantage = "medicinal (leaves)"
        p.condition = "Does well in bright light, on a good drainage soil,and it need about 3-6 feet space to plant"
        p.uses_or_type = "Foliage house plants"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection = "Mealybugs and whiteflies on Flowers and the foliage, Two spotted spider mite"
        p.pronounce_botanical_name = "{ Ah-CAL-eFA wel-KI-seea-NA}"
        p.serial_numbers = "001"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Acalypha wilkesiana var marginata"
        p.description = "LIFE CYCLE:Annual,  GROWING ZONE:Tropical and sub tropical,  LEAF TYPE:Simple but broad,  FRUITING:Yes,  MATURED HEIGHT:3 feet tall,  LEAF SHAPE:Cordate, elliptical and  Ovate, LEAF MARGIN:Serrate,  LEAF LENGTH:3-6 inches,  LEAF COLOR:Gold/Yellow, Green, Orange, Pink, Purple/Lavender, Red/Burgundy, Variegated and White.  STEM CHARACTERISTICS:Stem is erect with many branches and  closely arranged crown"
        p.img = R.drawable.acalyphamarginata
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Acalypha Marginata/Marginated acalypha"
        p.family = "Euphorbiaceae"
        p.origin = "Polynesia"
        p.special_advantage_or_disadvantage = "Medicinal"
        p.condition = "Does well in bright light, on a good drainage soil,and it need about 3-6 feet space to plant"
        p.uses_or_type = "Flowering house plants, Foliage shrubs"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection = "Indoor:  scale insects, spider mites, whiteflies, and mealybugs. Outdoor: downy mildew, powdery mildew, rust leaf spots and fungal root rots"
        p.pronounce_botanical_name = "{Ah-CAL-eFA wel-KI-seea-NA VAAR maH-GI-naa-TA}"
        p.serial_numbers = "002"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Acalypha hispida"
        p.description = "LIFE CYCLE:Annual,  GROWING ZONE:Tropical and sub tropical,  LEAF TYPE:Simple but broad,  FRUITING:Yes,  MATURED HEIGHT:3 feet tall,  LEAF SHAPE:Cordate, elliptical and  Ovate, LEAF MARGIN:Serrate,  LEAF LENGTH:3-6 inches,  LEAF COLOR:Gold/Yellow, Green, Orange, Pink, Purple/Lavender, Red/Burgundy, Variegated and White.  STEM CHARACTERISTICS:Stem is erect with many branches and  closely arranged crown"
        p.img = R.drawable.acalyphahispida
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Red fingers, Red hot catstail"
        p.family = "Euphorbiaceae"
        p.origin = "Polynesia"
        p.special_advantage_or_disadvantage = "Medicinal"
        p.condition = "Does well in bright light, on a good drainage soil,and it need about 3-6 feet space to plant"
        p.uses_or_type = "Flowering house plants, Flowering shrubs"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection = "Indoor:  scale insects, spider mites, whiteflies, and mealybugs. Outdoor: downy mildew, powdery mildew, rust leaf spots and fungal root rots"
        p.pronounce_botanical_name = "{Ah-CAL-eFA wel-KI-seea-NA VAAR maH-GI-naa-TA}"
        p.serial_numbers = "003"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title ="Adenium obesum"
        p.description ="LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 5 to 8 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). The stems and leaves both contain a milky sap (i.e. latex)."
        p.img = R.drawable.adeniumobesum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Desert Rose"
        p.family = "Apocynaceae"
        p.origin = ""
        p.special_advantage_or_disadvantage = ""
        p.condition = "Grows well on a good drainage and occasionally wet soil."
        p.uses_or_type = "Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Windbreaks, House plants, Flowering shrubs"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection = "Allamanda is regarded to be a plant that is resistant to most parasites and diseases But aphids and red spiders can attack the plant."
        p.pronounce_botanical_name = "{aadi-neom oh-be-som}"
        p.serial_numbers = "004"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Allamanda cathartica"
        p.description = "LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 5 to 8 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous). The stems and leaves both contain a milky sap (i.e. latex)."
        p.img = R.drawable.allamandacathartica
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Golden trumpet"
        p.family = "Apocynaceae"
        p.origin = "South America, Tropical America, and Brazil"
        p.special_advantage_or_disadvantage = "Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)"
        p.condition = "Grows well on a good drainage and occasionally wet soil."
        p.uses_or_type = "Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Windbreaks, House plants, Flowering shrubs"
        p.method_of_propagation = "Seed, cuttings"
        p.common_disease_and_infection = "Allamanda is regarded to be a plant that is resistant to most parasites and diseases But aphids and red spiders can attack the plant."
        p.pronounce_botanical_name = "{al-ah-MAN-dah kah-THAR-tik-ah}"
        p.serial_numbers = "005"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Allamanda violacea"
        p.description = "LIFE CYCLE: Perennial, Annual   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple but broad    FRUITING: Yes  MATURED HEIGHT: 3 to 5.4 m         LEAF SHAPE: Obovate              LEAF MARGIN:  Entire       LEAF LENGTH: 7.5 cm        LEAF COLOR: Green            LEAF ARRANGEMENT:   Opposite, Whorled          STEM CHARACTERISTICS:  Stem has no aroma. The older stems are mostly woody and brownish in colour, while the younger branches are generally green and hairless (i.e. glabrous)."
        p.img = R.drawable.allamandaviolaceae
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Purple allamanda"
        p.family = "Apocynaceae"
        p.origin = "Not native to North America"
        p.special_advantage_or_disadvantage = "Medicinal and Poisonous (Poisonous to mammals but Medicinal to Traditional/ folklore)"
        p.condition = "Needs some amount of direct sunlight, Allamanda do well on a good drainage and occasionally wet soil."
        p.uses_or_type = "Perennials, Seed propagateds, Vegetatively propagated plants, Vines or Climbers, Woodys, Windbreaks, House plants, Flowering shrubs"
        p.method_of_propagation = "Stem Cuttings"
        p.common_disease_and_infection = "No pests or diseases are of major concern except for nematodes. Purple allamanda is only occasionally bothered by scale and mites."
        p.pronounce_botanical_name = "{al-luh-MAN-duh vye-o-LAY-see-uh}"
        p.serial_numbers = "006"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Aglaonema modestrum"
        p.description = "LIFE CYCLE: Perennial   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple    FRUITING: Yes  MATURED HEIGHT: 24 inches           LEAF SHAPE: Ovate              LEAF MARGIN:  Undulate       LEAF LENGTH: 10 to 20 cm         LEAF COLOR: Green            LEAF ARRANGEMENT:   Spiral          STEM CHARACTERISTICS:  It is an evergreen perennial herb with dark green, erect, 20-50 cm tall, 0.4-2.0 cm thick stem, internodes 0.4-3.0 cm long"
        p.img = R.drawable.aglaonemamodestrum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Chinese evergreen, Aglaonema acutispathum, Aglaonema costatum var. viride, Aglaonema laoticum"
        p.family = "Araceae"
        p.origin = "Not native to north America"
        p.special_advantage_or_disadvantage = "Poisonous (Other: All parts of plant contain calcium oxalate crystals, an irritant to the mouth and oesophagus. Toxic to cats and dogs."
        p.condition = "It is shade tolerant and it will grow well In a good drainage and a moist soil"
        p.uses_or_type = "Foliage Houseplant, Perennial plant, Herbaceous plant, Poisonous plant"
        p.method_of_propagation = "Basal shoot or Suckers"
        p.common_disease_and_infection = "The plant is humidity tolerant"
        p.pronounce_botanical_name = "{ag-lay-o-NEE-muh mo-DESS-tum.}"
        p.serial_numbers = "007"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Aglaonema commutatum"
        p.description = "LIFE CYCLE: Perennial  GROWING ZONE: Tropical      LEAF TYPE: Simple    FRUITING: Yes   MATURED HEIGHT:            LEAF SHAPE: Elliptical, Lanceolate, Oblong              LEAF MARGIN:  Entire       LEAF LENGTH:  6 inches        LEAF COLOR:  Green, Variegated                   LEAF ARRANGEMENT:  Alternate            STEM CHARACTERISTICS:  Stem color is gray or silver, it has no aroma. It is also Erect, becoming decumbent, encircled with leaf scars."
        p.img = R.drawable.aglaonemacommutatum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Silver spear, Chinese evergreen, Golden Evergreen, Philippine Evergreen, Poison Dart Plant"
        p.family = "Araceae"
        p.origin = "Philippines, North eastern Celebes"
        p.uses_or_type = "Foliage Houseplant,Herbaceous, Perennial, Poisonous"
        p.method_of_propagation = "Poisonous (The plant has a medium severity poison)"
        p.condition = "It is shade tolerant and it will grow well In a good drainage and a moist soil"
        p.method_of_propagation = "Basal shoot or Suckers"
        p.common_disease_and_infection = "High humidity affects the plant"
        p.pronounce_botanical_name = "{ag-lay-o-NEE-muh kom-yoo-TAY-tum}"
        p.serial_numbers = "008"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Aglaonema pseudobracteatum"
        p.description = "LIFE CYCLE: Perennial   GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple    FRUITING: Yes  MATURED HEIGHT: 24 inches           LEAF SHAPE: Ovate              LEAF MARGIN:  Undulate       LEAF LENGTH: 9 to 20 cm         LEAF COLOR: Green            LEAF ARRANGEMENT:   Spiral          STEM CHARACTERISTICS:  It is an evergreen perennial herb with dark green, erect, internodes 0.5-3.2 cm long"
        p.img = R.drawable.aglaonemapseudebracteatum1
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Golden evergreen"
        p.family = "Araceae"
        p.origin = "Malaya"
        p.special_advantage_or_disadvantage = "Poisonous (Aglaonema plants are poisonous due to calcium oxalate crystals. If ingested they cause irritation of the mucous membranes, and the juice can cause skin irritation and painful rash.)"
        p.condition = "The plant is humidity tolerant"
        p.uses_or_type = "Foliage Housepant, Perennial plant, Herbaceous plant, Poisonous plant"
        p.method_of_propagation = "Basal shoot or Suckers"
        p.common_disease_and_infection = "The plant is humidity tolerant"
        p.pronounce_botanical_name = "{ag-lay-o-NEE-muh sio-Do brack-tee-AY-tum}"
        p.serial_numbers = "009"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Alocasia amazonica"
        p.description = "LIFE CYCLE: Perennial  GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple     FRUITING: Yes  MATURED HEIGHT: 60 to 90 cm         LEAF SHAPE: Arrow shaped, Oblong, Ovate.              LEAF MARGIN:  Sinuate, Undulate.       LEAF LENGTH: 16 inches        LEAF COLOR: Dark bronze- green, White and green.            LEAF ARRANGEMENT:   Basal        STEM CHARACTERISTICS: This plant lacks a stem."
        p.img = R.drawable.alocasiaamazonica
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Kris plant, Amozonian Elephant Ear, African Mask, Alocasia Polly."
        p.family = "Araceae"
        p.origin = "Tropical Asia"
        p.special_advantage_or_disadvantage = "Poisonous (Ingestion may cause severe discomfort)"
        p.condition = "It is shade tolerant and Performs best in par shade in organically rich, moist to wet soils."
        p.uses_or_type = "Foliage house plants"
        p.method_of_propagation = "Division"
        p.common_disease_and_infection = "When given proper care and grown in preferred conditions, Alocasia Amazonica is not plagued by any major disease problems. The biggest threat is root rot due to overly wet conditions. The only major pest that affects indoor grown Alocasia Amazonica’s is spider mites."
        p.pronounce_botanical_name = "{al-oh-KAY-shah am-ah-ZON-ih-kah}"
        p.serial_numbers = "010"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Alocasia sanderiana"
        p.description = "LIFE CYCLE: Perennial  GROWING ZONE: Tropical and Subtropical     LEAF TYPE: Simple     FRUITING: Yes  MATURED HEIGHT: 60 to 90 cm         LEAF SHAPE: Arrow shaped, Oblong, Ovate.              LEAF MARGIN:  Sinuate, Undulate.       LEAF LENGTH: 16 inches        LEAF COLOR: Dark bronze- green, White and green.            LEAF ARRANGEMENT:   Basal        STEM CHARACTERISTICS: This plant lacks a stem."
        p.img = R.drawable.alocasiasanderiana
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Kris plant, Sander's Alocasia, Jewel Alocasia, Horse face"
        p.family = "Araceae"
        p.origin = "Tropical Asia"
        p.special_advantage_or_disadvantage = "Toxicity (All parts of plant contain calcium oxalate crystals, an irritant to the mouth and esophagus. Toxic to cats and dogs.)"
        p.condition = "Performs best in par shade in organically rich, moist to wet soils."
        p.uses_or_type = "Foliage house plants, Evergreens, Indoors."
        p.method_of_propagation = "Division"
        p.common_disease_and_infection = "When given proper care and grown in preferred conditions, plant will not be prone to disease. The biggest threat is root rot due to overly wet conditions. The only major pest that affects indoor grown Alocasia sanderiana’s is spider mites."
        p.pronounce_botanical_name = "{a-low-KAY-see-a-san-dare-ee-AH-na}"
        p.serial_numbers = "011"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Anthurium andreanum"
        p.description = "LIFE CYCLE: Annual,Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Simple but broad    FRUITING: Yes    MATURED HEIGHT: 0.6 to 0.9 m      LEAF SHAPE: Oblong.        LEAF MARGIN:  Entire.       LEAF LENGTH: 30 cm        LEAF COLOR: Dark green.            LEAF ARRANGEMENT:   Spiral        STEM CHARACTERISTICS: It has a shorter and elongated stem between 15 to 30 cm."
        p.img = R.drawable.anthuriumandreanum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Oil cloth flower, flamingo lily, painter’s palette, flamingo flower."
        p.family = "Araceae"
        p.origin = "Colombia, Ecuador, Venezuelan Antilles, Windward Islands."
        p.special_advantage_or_disadvantage = "Poisonous ( it is toxic to cats and dogs but no reported toxicity to human horses and birds."
        p.condition = "Needs partial shade to full shady area"
        p.uses_or_type = "Foliage house plant, Flowering House plant"
        p.method_of_propagation = "Stem Cutting, Offset, Division"
        p.common_disease_and_infection = "Anthurium is very susceptible to bacterial and fungal diseases that can seriously limit commercial production. Bacterial blight caused by Xanthomonas is probably the most serious. Root rots caused by Rhizoctonia, Pythium, and Phytophthora also occur in Anthurium production."
        p.pronounce_botanical_name = "{an-THUR-ee-um an-dree-AY-num}"
        p.serial_numbers = "012"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Anthurium crystallinum"
        p.description = "LIFE CYCLE: Annual,Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Simple but broad    FRUITING: Yes    MATURED HEIGHT: 0.6 to 0.9 m      LEAF SHAPE: Oblong.        LEAF MARGIN:  Entire.       LEAF LENGTH: 30 cm        LEAF COLOR: Dark green.            LEAF ARRANGEMENT:   Spiral        STEM CHARACTERISTICS: It has a shorter and elongated stem between 15 to 30 cm."
        p.img = R.drawable.anthuriumcrystallinum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Crystal anthurium, Oil cloth flower, flamingo lily, painter’s palette, flamingo flower."
        p.family = "Araceae"
        p.origin = "Central and South America, from Panama to Peru."
        p.special_advantage_or_disadvantage = "Poisonous ( All parts are poisonous)."
        p.condition = "Protect it from direct sunlight. Needs partial shade to full shady area"
        p.uses_or_type = "Foliage house plant"
        p.method_of_propagation = "Division, Stem Cutting, Offset."
        p.common_disease_and_infection = "Anthurium is very susceptible to bacterial and fungal diseases that can seriously limit commercial production. Bacterial blight caused by Xanthomonas is probably the most serious. Root rots caused by Rhizoctonia, Pythium, and Phytophthora also occur in Anthurium production"
        p.pronounce_botanical_name = "{an-THUR-ee-um cri-TAL-Enum}"
        p.serial_numbers = "013"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Anthurium scherzerianum"
        p.description = "LIFE CYCLE: Annual,Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Simple but broad    FRUITING: Yes    MATURED HEIGHT: 0.6 to 0.9 m      LEAF SHAPE: Oblong.        LEAF MARGIN:  Entire.       LEAF LENGTH: 30 cm        LEAF COLOR: Dark green.            LEAF ARRANGEMENT:   Spiral        STEM CHARACTERISTICS: It has a shorter and elongated stem between 15 to 30 cm."
        p.img = R.drawable.anthuriumscherzerianum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "flamingo flower."
        p.family = "Araceae"
        p.origin = "Central and South America, from Panama to Peru."
        p.special_advantage_or_disadvantage = "Poisonous ( All parts are poisonous)."
        p.condition = "Protect it from direct sunlight. Needs partial shade to full shady area"
        p.uses_or_type = "Foliage house plant"
        p.method_of_propagation = "Division, Stem Cutting, Offset."
        p.common_disease_and_infection = "Anthurium is very susceptible to bacterial and fungal diseases that can seriously limit commercial production. Bacterial blight caused by Xanthomonas is probably the most serious. Root rots caused by Rhizoctonia, Pythium, and Phytophthora also occur in Anthurium production"
        p.pronounce_botanical_name = "{an-THUR-ee-um cri-TAL-Enum}"
        p.serial_numbers = "014"
        ModelForPlantsLists.add(p)


        p = ModelForPlantList()
        p.title = "Aphelandra squarrosa"
        p.description = "LIFE CYCLE:   GROWING ZONE:     LEAF TYPE:     FRUITING:     MATURED HEIGHT:      LEAF SHAPE:         LEAF MARGIN:         LEAF LENGTH:        LEAF COLOR:             LEAF ARRANGEMENT:           STEM CHARACTERISTICS: "
        p.img = R.drawable.aphelandrasquarosa
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Zebra plant"
        p.family = "Acanthaceae"
        p.origin = ""
        p.special_advantage_or_disadvantage = "Poisonous ( All parts are poisonous)."
        p.condition = "Brightly lit spot."
        p.uses_or_type = "Flowering house plant, House plant"
        p.method_of_propagation = "Stem cuttings"
        p.common_disease_and_infection = ""
        p.pronounce_botanical_name = "{an-THUR-ee-um cri-TAL-Enum}"
        p.serial_numbers = "015"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Araucaria heterophylla"
        p.description = "LIFE CYCLE: Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Compound    FRUITING: Yes    MATURED HEIGHT: 50 to 65 cm      LEAF SHAPE: Pyramidal.        LEAF MARGIN:  Ciliate, Denticulate.       LEAF LENGTH: 0.5 inch      LEAF COLOR: Green.            LEAF ARRANGEMENT:   Spiral        STEM CHARACTERISTICS: Stem color can be brown, gray, silver, copper. This plant has whorled branches with typically five branches per whorl. Hard, gray-brown, resinous; branches whorled, spreading, herringbone, branchlets covered with upturned leaves."
        p.img = R.drawable.araucariaheterophylla
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Norfolk island pine , Andes pine"
        p.family = "Araucariaeceae or Pinaceae"
        p.origin = "Endemic to Norfolk Island"
        p.special_advantage_or_disadvantage = "Edible (seed are edible)"
        p.condition = "For indoors, use fertile, porous, sandy, peaty, slightly acidic, well-drained soils"
        p.uses_or_type = "Foliage Houseplants, Trees, Conifers"
        p.method_of_propagation = "Difficult to propagate but can be done by Seed or Cutting"
        p.common_disease_and_infection = "severe needle blight and stem canker with brown color."
        p.pronounce_botanical_name = "{a-row-KAY-ree-a he-te-ro-FILL-a}"
        p.serial_numbers = "016"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Asparagus plumosus"
        p.description = "LIFE CYCLE: Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Compound    FRUITING: Yes (high fruits)    MATURED HEIGHT: 24 inches      LEAF SHAPE: Acicular.        LEAF MARGIN:  Entire.       LEAF LENGTH: 0.75 to 1 inch      LEAF COLOR: Green.            LEAF ARRANGEMENT:   Alternate       STEM CHARACTERISTICS: Stem emerges directly from the ground and become woody and spiny."
        p.img = R.drawable.asparagusplumosus
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Asparagus fern, Foxtail fern"
        p.family = "Asparagaceae or Liliaceae"
        p.origin = "South Africa"
        p.special_advantage_or_disadvantage = "Poisonous (This plant renders a low toxicity if eaten)"
        p.condition = "Needs a well-drained soil. Sandy to loamy soil best, relatively high nitrogen requirement."
        p.uses_or_type = "Foliage houseplant, Medicinal plants,Ground covers, accents, border plants, indoors, Climbers,House plants."
        p.method_of_propagation = "Division (dividing the clumps)"
        p.common_disease_and_infection = "Root rot if soil poorly drained. Be careful not to allow intrusion of Bermuda grass."
        p.pronounce_botanical_name = "{Ass-SPAR-uh-gus Plu-Mos-sus }"
        p.serial_numbers = "017"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Asparagus densiflorus sprengeri"
        p.description = "LIFE CYCLE: Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Compound    FRUITING: Yes (high fruits)    MATURED HEIGHT: 24 inches      LEAF SHAPE: Acicular.        LEAF MARGIN:  Entire.       LEAF LENGTH: 0.75 to 1 inch      LEAF COLOR: Green.            LEAF ARRANGEMENT:   Alternate       STEM CHARACTERISTICS: Stem emerges directly from the ground and become woody and spiny."
        p.img = R.drawable.asparagusdensiflorussprengeri
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Asparagus fern, Plume Asparagus, Foxtail fern"
        p.family = "Asparagaceae or Liliaceae"
        p.origin = "South Africa"
        p.special_advantage_or_disadvantage = "Poisonous (This plant renders a low toxicity if eaten)"
        p.condition = "Can adopt to bright light as well as semi shady conditions. It needs a well-drained soil. Sandy to loamy soil best, relatively high nitrogen requirement."
        p.uses_or_type = "Medicinal,Ground covers, accents, border plants, indoorss, Houseplants."
        p.method_of_propagation = "Division (dividing the clumps)/ Seed"
        p.common_disease_and_infection = "Root rot if soil poorly drained. Be careful not to allow intrusion of Bermuda grass."
        p.pronounce_botanical_name = "{Ass-SPAR-uh-gus den-sif-FLOR-us }"
        p.serial_numbers = "018"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Asparagus meyeri"
        p.description = "LIFE CYCLE: Perennial  GROWING ZONE: Tropical and subtropical    LEAF TYPE: Compound    FRUITING: Yes (high fruits)    MATURED HEIGHT: 24 inches      LEAF SHAPE: Acicular.        LEAF MARGIN:  Entire.       LEAF LENGTH: 0.75 to 1 inch      LEAF COLOR: Green.            LEAF ARRANGEMENT:   Alternate       STEM CHARACTERISTICS: Stem emerges directly from the ground and become woody and spiny."
        p.img = R.drawable.asparagusmeyeri1
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Plume Asparagus, Foxtail fern"
        p.family = "Asparagaceae or Liliaceae"
        p.origin = "South Africa"
        p.special_advantage_or_disadvantage = "Poisonous (This plant renders a low toxicity if eaten)"
        p.condition = "Needs a well-drained soil. Sandy to loamy soil best, relatively high nitrogen requirement."
        p.uses_or_type = "Medicinal plants,Ground covers, accents, border plants, indoors, Foliage house plants."
        p.method_of_propagation = "Division (dividing the clumps) or Seed"
        p.common_disease_and_infection = "Root rot if soil poorly drained. Be careful not to allow intrusion of Bermuda grass."
        p.pronounce_botanical_name = "{Ass-SPAR-uh-gus Meye-rii}"
        p.serial_numbers = "019"
        ModelForPlantsLists.add(p)

        p = ModelForPlantList()
        p.title = "Adiantum raddianum"
        p.description = "LIFE CYCLE: Perennial   GROWING ZONE: Tropics      LEAF TYPE: Compound (Pinnately, Bipinnately,Palmately), Fronds    FRUITING: No fruit rather reproduces via spores    MATURED HEIGHT: 1 to 2 feet           LEAF SHAPE: Obovate              LEAF MARGIN: Lobed        LEAF LENGTH:          LEAF COLOR: Green     LEAF ARRANGEMENT:  Other/more complex                 STEM CHARACTERISTICS: Stem is black with no aroma"
        p.img = R.drawable.addiantumraddiannum
        p.imageView3 = R.drawable.secondpicture
        p.common_name = "Delta maiden hair, Maiden hair fern"
        p.family = "Polypodiaceae or Pteridaceae"
        p.origin = "Tropical Americas and West "
        p.special_advantage_or_disadvantage = "Medicinal (Maidenhair fern is used for cough, whooping cough (pertussis), menstrual cramps (dysmenorrhea), hair loss, and several other conditions, but there is no good scientific evidence to support these uses)"
        p.condition = "Dappled sunlight, partial or Cool shady and a good drainage soil which is occasionally wet"
        p.uses_or_type = "Fern, Foliage houseplants"
        p.method_of_propagation = "Division or Spares"
        p.common_disease_and_infection = "This plant is seldom damaged by deer"
        p.pronounce_botanical_name = "{ae-dee-AN-tum rad-dee-AE-num}"
        p.serial_numbers = "020"
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