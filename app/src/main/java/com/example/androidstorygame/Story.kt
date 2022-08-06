package com.example.androidstorygame

class Story(val story: MainMenu) {

    fun beginning(){
        story.mainStory.setText("Trying to catch your breath you hear a  voice. " +
        "\n-That was something." +
        "\nYou look up, and barely see a"+
        " silhouette of a person. You recognize the voice it's Roomvar." +
        "\n-Roomvar? Is that you?" +
        "\n-Ofcourse not. He laughs, while rummaging trough his satchel." +
        "\n-You are going to need this, mix it with your Mana Potion and throw it at the Wall")
        story.choice1.setText("Mix the liquid with your Potion")
        story.action1 = "Mix the liquid with your Potion"
        story.choice2.setText("What exactly would it do?")
        story.action2 = "What exactly would it do?"
        story.choice3.setText("Are you sure it is a  good idea?!")
        story.action3 = "Are you sure it is a good idea?"
        story.choice4.setText("No, i'll think of something else")
        story.action4 = "No, i'll think of something else"
    }

    fun mixLiquid(){
        story.mainStory.setText("You start mixing your Mana Potion with the unkown Liquid " +
        "and it has no reaction. You look at Roomvar with doubt, he wouldn't trick you right? Why would he do that?")
        story.editor
    }
}

