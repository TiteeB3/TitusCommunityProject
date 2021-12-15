package com.example.tituscommunityproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.RelativeLayout

class CategoryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_page)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar!!.hide()

        val firsttransparentLayer = findViewById<RelativeLayout>(R.id.categoryPageLayout)
        firsttransparentLayer.background.alpha = 90

        val buttonForAppInformation = findViewById<Button>(R.id.appinfobutton)
        buttonForAppInformation.background.alpha = 0
        buttonForAppInformation.setOnClickListener() {
            startActivity(Intent(this, AppInformationPage::class.java))
        }

        //SETTING THE BUTTON CLICK LISTENER AND OTHER PROPERTIES
        val buttonForHouseplants = findViewById<Button>(R.id.HousePlants)
        buttonForHouseplants.background.alpha = 1
        buttonForHouseplants.setOnClickListener() {
            startActivity(Intent(this, Houseplants::class.java))
        }

        val buttonForAnnualsAndGroundCovers = findViewById<Button>(R.id.AnnualsAndGroundCovers)
        buttonForAnnualsAndGroundCovers.background.alpha = 1
        buttonForAnnualsAndGroundCovers.setOnClickListener() {
            startActivity(Intent(this, AnnualsAndGroundCovers::class.java))
        }

        val buttonForClimbingPlants = findViewById<Button>(R.id.ClimbingPlants)
        buttonForClimbingPlants.background.alpha = 1
        buttonForClimbingPlants.setOnClickListener() {
            startActivity(Intent(this, ClimbingPlants::class.java))
        }

        val buttonForConifers = findViewById<Button>(R.id.Conifers)
        buttonForConifers.background.alpha = 1
        buttonForConifers.setOnClickListener() {
            startActivity(Intent(this, Conifers::class.java))
        }

        val buttonForCreepingPlants = findViewById<Button>(R.id.CreepingPlants)
        buttonForCreepingPlants.background.alpha = 1
        buttonForCreepingPlants.setOnClickListener() {
            startActivity(Intent(this, CreepingPlants::class.java))
        }

        val buttonForFloweringShrubs = findViewById<Button>(R.id.floweringshrubs)
        buttonForFloweringShrubs.background.alpha = 1
        buttonForFloweringShrubs.setOnClickListener() {
            startActivity(Intent(this, FloweringShrubs::class.java))
        }

        val buttonForFloweringTrees = findViewById<Button>(R.id.FloweringTrees)
        buttonForFloweringTrees.background.alpha = 1
        buttonForFloweringTrees.setOnClickListener() {
            startActivity(Intent(this, FloweringTrees::class.java))
        }

        val buttonForFoliageShrubs = findViewById<Button>(R.id.FoliageShrubs)
        buttonForFoliageShrubs.background.alpha = 1
        buttonForFoliageShrubs.setOnClickListener() {
            startActivity(Intent(this, FoliageShrubs::class.java))
        }

        val buttonForFoliageTrees = findViewById<Button>(R.id.FoliageTrees)
        buttonForFoliageTrees.background.alpha = 1
        buttonForFoliageTrees.setOnClickListener() {
            startActivity(Intent(this, FoliageTrees::class.java))
        }

        val buttonForHerbsAndMedicinalPlants = findViewById<Button>(R.id.herbsAndMedicinalPlants)
        buttonForHerbsAndMedicinalPlants.background.alpha = 1
        buttonForHerbsAndMedicinalPlants.setOnClickListener() {
            startActivity(Intent(this, HerbsAndMedicinalPlants::class.java))
        }

        val buttonForPalmsAndPalmLikes = findViewById<Button>(R.id.PalmsAndPalmLike)
        buttonForPalmsAndPalmLikes.background.alpha = 1
        buttonForPalmsAndPalmLikes.setOnClickListener() {
            startActivity(Intent(this, PalmsAndPalmLikes::class.java))
        }

        val buttonForSucculents = findViewById<Button>(R.id.Succulents)
        buttonForSucculents.background.alpha = 1
        buttonForSucculents.setOnClickListener() {
            startActivity(Intent(this, Succulents::class.java))
        }


        val buttonForTurfgrasses = findViewById<Button>(R.id.TurfGrasses)
        buttonForTurfgrasses.background.alpha = 1
        buttonForTurfgrasses.setOnClickListener() {
            startActivity(Intent(this, TurfGrasses::class.java))
        }


        val buttonForWaterPlants = findViewById<Button>(R.id.WaterPlants)
        buttonForWaterPlants.background.alpha = 1
        buttonForWaterPlants.setOnClickListener() {
            startActivity(Intent(this, WaterPlants::class.java))
        }

    }
}