package com.example.androidstorygame

class Prologue(private val story: MainMenu) {
    private val functions = Functions(story)
    var questionMix = false
    var questionIdea =  false
    fun beginning(){
        functions.resetStats()
        functions.showAll()
        story.storyText = "Trying to catch your breath you hear a  voice. " +
                "\n-That was something." +
                "\nYou look up, and barely see a"+
                " silhouette of a person. You recognize the voice it's Roomvar." +
                "\n-Roomvar? Is that you?" +
                "\n-Ofcourse not. He laughs, while rummaging trough his satchel." +
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
        story.action1 = "Mix the liquid with your Potion"
        /// Finish Function



    }
    fun oneTwo(){
        functions.showAll()
        functions.resetAction()
        story.storyText = "-What Exactly should i expect from it, if i mix them? You ask." +
                "\n-I thought you knew a bit of Alchemy. Roomvar sighs." +
                "\n-It will create an explosion if it is thrown at any physical object, so do not try to throw it at a spirit! He laughs."
        story.mainStory.text = story.storyText
        if(questionIdea){
            functions.hideButton1()
            functions.hideButton2()
            val first = "Mix the liquid with your Potion"
            val second = "No, I'll think of something else"
            story.choice3.text = first
            story.action3 = first
            story.choice4.text = second
            story.action4 = second
            questionMix = true
        }
        else{
            functions.hideButton1()
            val first = "Mix the liquid with your Potion"
            val second = "Are you sure it is a good idea?"
            val third = "No, I'll think of something else"
            story.choice2.text = first
            story.action2 = first
            story.choice3.text = second
            story.action3 = second
            story.choice4.text = third
            story.action4 = third
            questionMix = true
        }
    }
    fun oneThree(){
        functions.showAll()
        functions.resetAction()
        story.storyText = "-Are you sure about it? Roomvar notices doubt in your voice." +
                "\n-I am, worked for me plenty of times. You can't tell if Roomvar is joking or not"
        story.mainStory.text = story.storyText
        if(questionMix){
            functions.hideButton1()
            functions.hideButton2()
            val first = "Mix the liquid with your potion"
            val second = "No, I'll think of something else"
            story.choice3.text = first
            story.action3 = first
            story.choice4.text = second
            story.action4 = second
            questionIdea = true
        }
        else{
            functions.hideButton1()
            val first = "Mix the liquid with your potion"
            val second = "What exactly would it do?"
            val third = "No, I'll think of something else"
            story.choice2.text = first
            story.action2 = first
            story.choice3.text = second
            story.action3 = second
            story.choice4.text = third
            story.action4 = third
            questionIdea = true
        }
    }
    fun oneFour(){
        functions.showAll()
        functions.resetAction()
        story.storyText= "No, there should be another way out of here. You think to yourself." +
                "\nYou look around  and see some bricks, that are slightly pushed outwards." +
                "\nAfter inspecting them, you realise they can be climbed."
        story.mainStory.text = story.storyText
        if(questionMix and questionMix){
            functions.hideButton1()
            functions.hideButton2()
            val first = "Mix the liquid with your Potion"
            val second = "Climb the Wall"
            story.choice3.text = first
            story.action3 = first
            story.choice4.text = second
            story.action4 = second
        }
        else if(questionMix){
            functions.hideButton1()
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
        else if(questionIdea){
            functions.hideButton1()
            val first = "Mix the liquid with your Potion"
            val second = "What exactly would it do?"
            val third = "Climb the Wall"
            story.choice2.text = first
            story.action2 = first
            story.choice3.text = second
            story.action3 = second
            story.choice4.text = third
            story.action4 = third
        }
        else{

            val first = "Mix the liquid with your Potion"
            val second = "What exactly would it do?"
            val third = "Are you sure it is a good idea?"
            val fourth = "Climb the Wall"
            story.choice1.text = first
            story.action1 = first
            story.choice2.text = second
            story.action2 = second
            story.choice3.text = third
            story.action3 = third
            story.choice4.text = fourth
            story.action4 = fourth
        }
    }
}

