package com.example.androidstorygame

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainMenu : AppCompatActivity() {


    lateinit var mainStory : TextView;

    lateinit var choice1 : Button;
    lateinit var choice2 : Button;
    lateinit var choice3 : Button;
    lateinit var choice4 : Button
    lateinit var action1 : String;
    lateinit var action2 : String;
    lateinit var action3 : String;
    lateinit var action4 : String;
    var storyinit = Story(this);
    val sharedPref = getSharedPreferences("playerData", 0)
    val editor = sharedPref.edit()
    val checkpoint = sharedPref.getInt("Checkpoint", 0)
    var health: Int = 0;
    var mana: Int = 0
    var silver: Int = 0
    var manaPotionAmount: Boolean = false;




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_menu2)

        // Actions

        fun selectAction(action: String){
            when(action){
                "Chapter 1" -> storyinit.beginning()
                "Mix the liquid with your Potion" -> storyinit.mixLiquid()
                "What exactly would it do?" -> mainStory.setText("Question!")
                "Are you sure it is a good idea?" -> mainStory.setText("Doubt!")
                "No, i'll think of something else" -> mainStory.setText("Refuse!")


            }
        }

        // Stats

        val healthAmount  = findViewById<TextView>(R.id.healthAmount)
        val manaAmount  = findViewById<TextView>(R.id.manaAmount)
        val silverAmount  = findViewById<TextView>(R.id.silverCoinAmount)
        val manaPotion = findViewById<TextView>(R.id.manaPotion)

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










        if(checkpoint == 1){
            editor.putInt("Checkpoint", 1)
            editor.putInt("Health",  5);
            editor.putInt("Mana", 0)
            editor.putInt("Silver", 10)
            editor.putBoolean("Mana Potion", true)
            editor.apply()
            health = sharedPref.getInt("Health", 0)
            mana = sharedPref.getInt("Mana", 1)
            silver = sharedPref.getInt("Silver", 2)
            manaPotionAmount = sharedPref.getBoolean("Mana Potion", true)
            if(manaPotionAmount){
                manaPotion.setText("True")
            }else{
                manaPotion.setText("False")
            }

            healthAmount.setText(health.toString())
            manaAmount.setText(mana.toString())
            silverAmount.setText((silver.toString()))
            selectAction("Chapter 1")



        } else {
            health = sharedPref.getInt("Health", 0)
            mana = sharedPref.getInt("Mana", 1)
            silver = sharedPref.getInt("Silver", 2)
            manaPotionAmount = sharedPref.getBoolean("Mana Potion", true)
            healthAmount.setText(health.toString())
            manaAmount.setText(mana.toString())
            silverAmount.setText((silver.toString()))

        }
    }
}


