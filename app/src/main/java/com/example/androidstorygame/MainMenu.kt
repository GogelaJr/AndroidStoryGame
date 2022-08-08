package com.example.androidstorygame

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainMenu : AppCompatActivity() {


    lateinit var mainStory : TextView
    lateinit var storyText : String

    lateinit var choice1 : Button
    lateinit var choice2 : Button
    lateinit var choice3 : Button
    lateinit var choice4 : Button
    lateinit var action1 : String
    lateinit var action2 : String
    lateinit var action3 : String
    lateinit var action4 : String

    lateinit var editor: SharedPreferences.Editor
    lateinit var sharedPref: SharedPreferences

    lateinit var healthAmount: TextView
    lateinit var manaAmount : TextView
    lateinit var silverAmount  : TextView
    lateinit var manaPotionAmount: TextView

    var health: Int = 0
    var mana: Int = 0
    var silver: Int = 0
    var manaPotion: Int = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_menu2)

        val storyline = Prologue(this)
        sharedPref = getSharedPreferences("playerData", 0)
        editor = sharedPref.edit()
        val checkpoint = sharedPref.getInt("Checkpoint", 0)

        // Actions

        fun selectAction(action: String){
            when(action){
                "Restart" -> storyline.beginning()
                "Prologue" -> storyline.beginning()

                /// Prologue

                "Mix the liquid with your Potion" -> storyline.oneOne()

                "What exactly would it do?" -> storyline.oneTwo()

                "Are you sure it is a good idea?" -> storyline.oneThree()

                "No, I'll think of something else" -> storyline.oneFour()

                "Throw it at the Wall" -> storyline.throwMixture()

                "ContinueToChapter1" -> storyline.throwMixture()

                /// Chapter 1


            }
        }

        // Stats

        healthAmount  = findViewById(R.id.healthAmount)
        manaAmount  = findViewById(R.id.manaAmount)
        silverAmount  = findViewById(R.id.silverCoinAmount)
        manaPotionAmount = findViewById(R.id.manaPotion)

        // Story

        mainStory = findViewById(R.id.mainTextView)

        // Buttons

        choice1 = findViewById(R.id.choice1Button)
        choice1.setOnClickListener{
            selectAction(action1)
        }
        choice2 = findViewById(R.id.choice2Button)
        choice2.setOnClickListener{
            selectAction(action2)
        }

        choice3 = findViewById(R.id.choice3Button)
        choice3.setOnClickListener{
            selectAction(action3)
        }

        choice4 = findViewById(R.id.choice4Button)
        choice4.setOnClickListener{
            selectAction(action4)
        }










        if(checkpoint == 0){
            editor.putInt("Checkpoint", 0)
            editor.apply()
            health = sharedPref.getInt("Health", 0)
            mana = sharedPref.getInt("Mana", 1)
            silver = sharedPref.getInt("Silver", 2)
            manaPotion = sharedPref.getInt("ManaPotion", 3)
            healthAmount.text = health.toString()
            manaAmount.text = mana.toString()
            silverAmount.text = (silver.toString())
            manaPotionAmount.text = (manaPotion.toString())
            storyline.beginning()






        } else if(checkpoint == 1) {
            health = sharedPref.getInt("Health", 0)
            mana = sharedPref.getInt("Mana", 1)
            silver = sharedPref.getInt("Silver", 2)
            manaPotion = sharedPref.getInt("ManaPotion", 3)
            healthAmount.text = health.toString()
            manaAmount.text = mana.toString()
            silverAmount.text = (silver.toString())
            manaPotionAmount.text = (manaPotion.toString())

        }
    }
}


