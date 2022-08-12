package com.example.androidstorygame

import android.view.View

class Functions(private val story: MainMenu) {

    /// Buttons

    fun hideButton1(){
        story.choice1.visibility = View.INVISIBLE
    }
    fun hideButton2(){
        story.choice2.visibility = View.INVISIBLE
    }
    fun hideButton3(){
        story.choice3.visibility = View.INVISIBLE
    }
    fun hideButton4(){
        story.choice4.visibility = View.INVISIBLE
    }
    fun showAll(){
        story.choice1.visibility = View.VISIBLE
        story.choice2.visibility = View.VISIBLE
        story.choice3.visibility = View.VISIBLE
        story.choice4.visibility = View.VISIBLE
    }
    fun hideAll(){
        story.choice1.visibility = View.INVISIBLE
        story.choice2.visibility = View.INVISIBLE
        story.choice3.visibility = View.INVISIBLE
        story.choice4.visibility = View.INVISIBLE

    }
    fun resetAction(){
        story.action1 = ""
        story.action2 = ""
        story.action3 = ""
        story.action4 = ""
    }

    /// Save & Reset Stats

    fun resetStats(){
        story.editor.putInt("Checkpoint", 0)
        story.editor.putInt("Health", 10)
        story.editor.putInt("Mana", 15)
        story.editor.putInt("Silver", 10)
        story.editor.putInt("ManaPotion", 1)
        story.editor.apply()
        story.health = story.sharedPref.getInt("Health", 0)
        story.mana = story.sharedPref.getInt("Mana", 1)
        story.silver = story.sharedPref.getInt("Silver", 2)
        story.manaPotion = story.sharedPref.getInt("ManaPotion", 3)
        story.healthAmount.text = story.health.toString()
        story.manaAmount.text = story.mana.toString()
        story.silverAmount.text = story.silver.toString()

    }
    fun saveHealth(Str: String, vararg healthNumber : Int){
        for(amount in healthNumber){
            val currentHealth = story.sharedPref.getInt("Health", 0)
            val totalHealth = currentHealth + amount
            story.editor.putInt("Health", totalHealth)
            story.editor.apply()
            val updatedHealth = story.sharedPref.getInt("Health", 0)
            story.health = updatedHealth
            story.healthAmount.text = updatedHealth.toString()

            if(updatedHealth <=  0){
                hideAll()
                story.choice1.visibility = View.VISIBLE
                story.editor.putInt("Health", 0)
                story.editor.apply()
                story.healthAmount.text = "0"
                story.mainStory.text = Str
                val restart = "Restart"
                story.choice1.text = restart
                story.action1 = restart
            }
        }
    }
    fun saveMana(vararg manaNumber : Int){
        for(amount in manaNumber){
            val currentMana = story.sharedPref.getInt("Mana", 0)
            val totalMana = currentMana + amount
            story.editor.putInt("Health", totalMana)
            story.editor.apply()
            val updatedMana = story.sharedPref.getInt("Mana", 0)
            story.mana = updatedMana
            story.manaAmount.text = updatedMana.toString()

        }
    }
    fun saveSilver(vararg silverNumber : Int){
        for(amount in silverNumber){
            val currentSilver = story.sharedPref.getInt("Silver", 0)
            val totalSilver = currentSilver + amount
            story.editor.putInt("Silver", totalSilver)
            story.editor.apply()
            val updatedSilver = story.sharedPref.getInt("Silver", 0)
            story.silver =  updatedSilver
            story.silverAmount.text = updatedSilver.toString()

        }
    }
    fun saveManaPotion(vararg potionNumber : Int){
        for(amount in potionNumber){
            val currentPotions = story.sharedPref.getInt("ManaPotion", 0)
            val totalPotions = currentPotions + amount
            story.editor.putInt("ManaPotion", totalPotions)
            story.editor.apply()

            val updatedPotions = story.sharedPref.getInt("ManaPotion", 0)
            story.manaPotion = updatedPotions

        }
    }
    fun saveGame(vararg chapterNumber : Int){
        for(chapter in  chapterNumber){
            story.editor.putInt("Checkpoint", chapter)
            story.editor.putInt("Health", story.health)
            story.editor.putInt("Mana", story.mana)
            story.editor.putInt("Silver", story.silver)
            story.editor.putInt("SavedHealth", story.health)
            story.editor.putInt("SavedMana", story.mana)
            story.editor.putInt("SavedSilver", story.silver)

            story.editor.apply()
        }
    }
    fun reloadCheckpoint(){
        story.health = story.sharedPref.getInt("SavedHealth",0)
        story.mana = story.sharedPref.getInt("SavedMana",1)
        story.silver = story.sharedPref.getInt("SavedSilver",2)

    }
}

