package com.example.androidstorygame

import android.view.View

class Prologue(private val story: MainMenu) {
    private val functions = Functions(story)
    private var questionMix = false
    private var questionIdea =  false
    private var checkWall = false
    private var mixture  = false
    var mixturethrown = false
    val imgresid = R.drawable.heart
    /// Prologue
    fun beginning(){
        story.image.setImageResource(imgresid)
        story.image.setImageResource(0)
        questionIdea = false
        questionMix = false
        checkWall = false
        mixture = false
        functions.resetStats()
        functions.showAll()
        story.storyText = "Trying to catch your breath you hear a  voice. " +
                "\n-That was something." +
                "\nYou look up, and barely see a"+
                " silhouette of a person. You recognize the voice it's Roomvar." +
                "\n-Roomvar? Is that you?" +
                "\n-Of course not. He laughs, while rummaging trough his satchel." +
                "\n-You are going to need this, mix it with your Mana Potion and throw it at the Wall"
        story.mainStory.text = story.storyText
        val first = "Mix the liquid with your Potion"
        val second = "What exactly would it do?"
        val third = "Are you sure it is a good idea?"
        val fourth = "No, I'll think of something else"
        story.choice1.text = first
        story.action1 = first
        story.choice2.text = second
        story.action2 = second
        story.choice3.text = third
        story.action3 = third
        story.choice4.text = fourth
        story.action4 = fourth
    }
    fun oneOne(){
        functions.showAll()
        functions.resetAction()
        story.storyText = "You start mixing your Mana Potion with the unknown Liquid " +
                "and it has no reaction. You look at Roomvar with doubt, he wouldn't trick you right? Why would he do that?"
        story.mainStory.text = story.storyText
        mixture = true
        functions.saveManaPotion(-1)
        if(checkWall){
            val climb = "Climb the Wall"
            story.choice4.text = climb
            story.action4 = climb
        }
        else{
            val climb = "No, I'll think of something else"
            story.choice4.text = climb
            story.action4 = climb
        }
        if(questionMix and questionIdea){
            functions.hideButton1()
            functions.hideButton2()
            val first = "Throw it at the Wall"
            story.choice3.text = first
            story.action3 = "Throw it at the Wall"
        }
        else if (questionMix and !questionIdea){
            functions.hideButton1()
            val first = "Throw it at the Wall"
            val second = "Are you sure it is a good idea?"
            story.choice2.text = first
            story.action2 = first
            story.choice3.text = second
            story.action3 = second
        }
        else if (!questionMix and questionIdea){
            functions.hideButton1()
            val first = "Throw it at the Wall"
            val second = "What exactly would it do?"
            story.choice2.text = first
            story.action2 = first
            story.choice3.text = second
            story.action3 = second
        } else{
            val first = "Throw it at the Wall"
            val second = "What exactly would it do?"
            val third = "Are you sure it is a good idea?"
            story.choice1.text = first
            story.action1 = first
            story.choice2.text = second
            story.action2 = second
            story.choice3.text = third
            story.action3 = third
        }




    }
    fun oneTwo(){
        functions.showAll()
        functions.resetAction()
        story.storyText = "-What Exactly should i expect from it, if i mix them? You ask." +
                "\n-I thought you knew a bit of Alchemy. Roomvar sighs." +
                "\n-It will create an explosion if it is thrown at any physical object, so do not try to throw it at a spirit! He laughs."
        story.mainStory.text = story.storyText
        questionMix = true

        if(checkWall){
            val climb = "Climb the Wall"
            story.choice4.text = climb
            story.action4 = climb
        }
        else{
            val climb = "No, I'll think of something else"
            story.choice4.text = climb
            story.action4 = climb
        }
        if(questionIdea){
            functions.hideButton1()
            functions.hideButton2()
            if (mixture){
                val mixed = "Throw it at the Wall"
                story.choice3.text = mixed
                story.action3 = mixed
            }else{
                val mixed = "Mix the liquid with your Potion"
                story.choice3.text = mixed
                story.action3 = mixed
            }

        }
        else{
            functions.hideButton1()
            if(mixture){
                val mixed = "Throw it at the Wall"
                story.choice2.text = mixed
                story.action2 = mixed
            }else{
                val mixed = "Mix the liquid with your Potion"
                story.choice2.text = mixed
                story.action2 = mixed

            }
            val second = "Are you sure it is a good idea?"
            story.choice3.text = second
            story.action3 = second

        }
    }
    fun oneThree(){
        functions.showAll()
        functions.resetAction()
        story.storyText = "-Are you sure about it? Roomvar notices doubt in your voice." +
                "\n-I am, worked for me plenty of times. You can't tell if Roomvar is joking or not"
        story.mainStory.text = story.storyText
        questionIdea = true
        if(checkWall){
            val climb = "Climb the Wall"
            story.choice4.text = climb
            story.action4 = climb
        }
        else{
            val climb = "No, I'll think of something else"
            story.choice4.text = climb
            story.action4 = climb
        }
        if(questionMix){
            functions.hideButton1()
            functions.hideButton2()
            if(mixture){
                val mixed = "Throw it at the Wall"
                story.choice3.text = mixed
                story.action3 = mixed
            }
            else{
                val mixed = "Mix the liquid with your Potion"
                story.choice3.text = mixed
                story.action3 = mixed
            }
        }
        else{
            functions.hideButton1()

            if(mixture){
                val mixed = "Throw it at the Wall"
                story.choice2.text = mixed
                story.action2 = mixed
            }
            else{
                val first = "Mix the liquid with your Potion"
                story.choice2.text = first
                story.action2 = first
            }
            val second = "What exactly would it do?"
            story.choice3.text = second
            story.action3 = second
        }
    }
    fun oneFour(){
        functions.showAll()
        functions.resetAction()
        story.storyText= "No, there should be another way out of here. You think to yourself." +
                "\nYou look around  and see some bricks, that are slightly pushed outwards." +
                "\nAfter inspecting them, you realise they can be climbed."
        story.mainStory.text = story.storyText
        checkWall = true
        if(questionMix and questionMix){
            functions.hideButton1()
            functions.hideButton2()
            if(mixture){
                val mixed = "Throw it at the Wall"
                story.choice3.text = mixed
                story.action3 = mixed
            }
            else{
                val mixed = "Mix the liquid with your Potion"
                story.choice3.text = mixed
                story.action3 = mixed
            }
            val second = "Climb the Wall"
            story.choice4.text = second
            story.action4 = second
        }
        else if(questionMix and !questionIdea){
            functions.hideButton1()
            if(mixture){
                val mixed = "Throw it at the Wall"
                story.choice2.text = mixed
                story.action2 = mixed
            }
            else{
                val mixed = "Mix the liquid with your Potion"
                story.choice2.text = mixed
                story.action2 = mixed
            }
            val first = "Mix the liquid with your Potion"
            val second = "Are you sure it is a good idea?"
            val third = "Climb the Wall"
            story.choice2.text = first
            story.action2 = first
            story.choice3.text = second
            story.action3 = second
            story.choice4.text = third
            story.action4 = third
        }
        else if(!questionMix and questionIdea){
            if(mixture){
                val mixed = "Throw it at the Wall"
                story.choice2.text = mixed
                story.action2 = mixed
            }
            else{
                val mixed = "Mix the liquid with your Potion"
                story.choice2.text = mixed
                story.action2 = mixed
            }
            functions.hideButton1()
            val second = "What exactly would it do?"
            val third = "Climb the Wall"
            story.choice3.text = second
            story.action3 = second
            story.choice4.text = third
            story.action4 = third
        }
        else{
            if(mixture){
                val mixed = "Throw it at the Wall"
                story.choice1.text = mixed
                story.action1 = mixed
            }
            else{
                val mixed = "Mix the liquid with your Potion"
                story.choice1.text = mixed
                story.action1 = mixed
            }
            val second = "What exactly would it do?"
            val third = "Are you sure it is a good idea?"
            val fourth = "Climb the Wall"
            story.choice2.text = second
            story.action2 = second
            story.choice3.text = third
            story.action3 = third
            story.choice4.text = fourth
            story.action4 = fourth
        }
    }

    fun throwMixture(){
        functions.hideAll()
        story.storyText = "You throw the Mixture at the wall, nothing happens." +
                "\n-Roomvar this isn't Working! You yell."  +
                "\n-Here have this Torch it should do th.. Ah!!!"  +
                "\nYou see that something struck him, you can't see what." +
                "He drops the torch and turns back to fight what sounds like a Goblin." +
                "\nThe Torch lands directly on the splashed explosive mixture creating a fireball" +
                " and throws you back hitting your head on a metal, losing your consciousness"
        story.mainStory.text = story.storyText
        functions.saveHealth("No death",-3)
        mixture = false
        val first = "Continue"
        val action = "ContinueToChapter1"
        story.choice4.visibility = View.VISIBLE
        story.choice4.text  = first
        story.action4 = action
        mixturethrown = true
    }
}

