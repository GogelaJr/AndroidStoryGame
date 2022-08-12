package com.example.androidstorygame

import android.view.View

class Prologue(private val story: MainMenu) {
    private val functions = Functions(story)
    private var questionMix = false
    private var questionIdea =  false
    private var checkWall = false
    private var mixture  = false
    private var mixturethrown = false
    var planUnserious = false
    var planDiscussed = false

    private val city = R.drawable.city
    private val cityDestroyed = R.drawable.destroyed_city
    private val alien = R.drawable.alien
    private val ending = R.drawable.end
    private val preChallenge = R.drawable.preend
    private val challenge = R.drawable.challenge
    private val landscape = R.drawable.landscape
    private val treeVillage = R.drawable.village
    /// Prologue
    fun beginning(){
        story.image.visibility = View.GONE
        questionIdea = false
        questionMix = false
        checkWall = false
        mixture = false
        functions.resetStats()
        functions.showAll()
        story.storyText = "Trying to catch your breath you hear a  voice. " +
                "\nThat was something." +
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
        story.image.visibility = View.INVISIBLE
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
        story.image.visibility = View.GONE
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
        story.image.visibility = View.GONE
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
        story.image.visibility = View.GONE
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
        story.image.visibility = View.GONE
        story.storyText = "You throw the Mixture at the wall, nothing happens." +
                "\n-Roomvar this isn't Working! You yell."  +
                "\n-Here have this Torch it should do th.. Ah!!!"  +
                "\nYou see that something struck him, you can't see what." +
                "He drops the torch and turns back to fight what sounds like a Goblin." +
                "\nThe Torch lands directly on the splashed explosive mixture creating a fireball" +
                " you get thrown back hitting your head on metal, losing your consciousness."
        story.mainStory.text = story.storyText
        mixture = false
        val first = "Continue"
        val action = "ContinueToChapter1"
        story.choice4.visibility = View.VISIBLE
        story.choice4.text  = first
        story.action4 = action
        mixturethrown = true
    }
    fun climbWall(){
        story.image.visibility = View.GONE
        functions.hideAll()
        functions.resetAction()
        story.storyText = "You grab one of the Bricks, while putting your foot on the other,  slowly pushing yourself upwards." +
                " You are trying to keep the pace.\nYou never were a good climber, knowing that you stop a few times on  your way to catch your breath." +
                "\nYou almost reach the ledge, where Roomvar is waiting for you.\nHe extends his hand towards you, to help you up."  +
                "\nYou grab his hand, and feel his strength, slowly pulling you up." +
                "\nSuddenly you feel something warm dripping from his arm, you see that he's bleeding. You see him clinching his teeth and losing grip." +
                "\nYou look at Roomvar, laying motionless on the ledge, while you are falling back down, finally you hit the bottom feeling a hard thump."
        story.mainStory.text = story.storyText
        val first = "Continue"
        val action = "ContinueToChapter1"
        story.choice4.visibility = View.VISIBLE
        story.choice4.text  = first
        story.action4 = action
    }

    fun chapter1(){
        functions.saveGame(1)
        functions.reloadCheckpoint()
        functions.showAll()
        functions.resetAction()
        story.image.visibility = View.GONE
        story.storyText = "You jump out of your bedroll, you scan your surroundings, realising it was a bad dream." +
                "\nYou look at Roomvar, he's sitting by the window, looking at the horizon." +
                "\nIts still dark inside, but you can tell it's already getting brighter outside."
        story.mainStory.text = story.storyText
        val first = "Approach the Window and look outside."
        val second = "Check your Backpack"
        val third  = "Ask Roomvar if he got some rest"
        val fourth = "Lay on the bedroll"
        story.choice1.text = first
        story.action1 = first
        story.choice2.text = second
        story.action2 = second
        story.choice3.text = third
        story.action3 = third
        story.choice4.text = fourth
        story.action4 = fourth
    }

    fun chapter1_1(){

        functions.showAll()
        functions.resetAction()
        story.storyText = "You slowly Approach the Window, Roomvar looks at you, slightly smiling and pointing towards the horizon with a nod." +
                "\nYou see its dawn, however it's not long until everybody wakes up. " +
                "You hear birds chirping, you can see the Nameless Sea in the distance, but you always wondered, why was it called a Sea, " +
                "when it has no outlets. It was corrupted some time ago, you can see emitting magenta colored lights from the lake. Beautiful you think." +
                "\nRoomvar breaks the silence" +
                "\n-It's something isn't it?" +
                "\n-Anyways, about the contract, any ideas about the plan?"
        story.mainStory.text = story.storyText
        val first = "Discuss the contract"
        val second = "Let's discuss it on our way"
        val third = "A Simple Delivery Contract"
        val fourth = "Improvisation is the key"
        story.choice1.text = first
        story.action1 = first
        story.choice2.text = second
        story.action2 = second
        story.choice3.text = third
        story.action3 = third
        story.choice4.text =fourth
        story.action4 = fourth
    }
    fun chapter1_2(){
        functions.showAll()
        functions.resetAction()
        story.storyText = "You look at your backpack, its where you left it, untouched." +
                "You see a your scrolls next to it, few potions, silver coins and a dagger." +
                "\n-Had a bad dream? So did I, it kept me up all night. " +
                "Here, have some water to calm down a bit" +
                "\nYou drink the cold river water from Roomvar's leather canteen, which has the initials C.K. engraved " +
                "you've known Roomvar for a long time, but everytime you asked him about the initials, he avoided the question. " +
                "\n-We should really get a plan of what we are going to do once we are there. Roomvar takes out the contract out of his satchel"
        story.mainStory.text = story.storyText
        val first = "You're right we should"
        val second = "Can't we do it on our way?"
        val third = "Go in take the thing get out Simple as that"
        val fourth = "I'm tired let's just improvise"
        story.choice1.text = first
        story.action1 = first
        story.choice2.text = second
        story.action2  = second
        story.choice3.text = third
        story.action3 = third
        story.choice4.text = fourth
        story.action4 = fourth
    }
    fun chapter1_3(){
        functions.showAll()
        functions.resetAction()
        story.storyText = "-Did you get any rest?" +
                "\n-I had a nightmare, just like you did, it kept me awake all night long. Sadly we also ran out of the Honey brew, so I went on and scouted the surroundings." +
                "\n-At least you did something useful. You can see Roomvar smiling." +
                "\n-Mind if we discussed what our next step is? You sense that Roomvar is uneasy. He was always cautious with planning." +
                " Especially after leaving the Paladin ranks on his own will, because of higher ranking officers and how they barely cared about their men."
        story.mainStory.text = story.storyText
        val first =  "Right, we should discuss everything we know so far"
        val second = "We can do it on our way to the city"
        val third = "Nothing to discuss, its a simple contract"
        val fourth = "It never goes as planned, We should improvise"
        story.choice1.text = first
        story.action1 = first
        story.choice2.text = second
        story.action2 = second
        story.choice3.text = third
        story.action3 = third
        story.choice4.text = fourth
        story.action4 = fourth
    }
    fun chapter1_4(){
        functions.showAll()
        functions.resetAction()
        story.storyText="I should get some rest, you think to yourself and lay back down." +
                "\nAfter a few minutes Roomvar wakes you up." +
                "\n-Sorry for waking you up, but we really should discuss the plan." +
                "\nYou try to ignore him, but he keeps talking." +
                "\n-I might have accidentally burned one of your scrolls while i was trying to light up the Candle." +
                "\nYou jump from up from anger realising that Roomvar is joking. " +
                "He loves getting on peoples nerves, but always tries to make them also laugh."
        story.mainStory.text = story.storyText
        val first = "Now that I am awake, we can discuss the plan"
        val second = "I hate you for a reason, but let's discuss it once we're on the road"
        val third = "Go in, beat them up, take the stuff and leave. Easy"
        val fourth = "Why don't we just improvise?"
        story.choice1.text = first
        story.action1 = first
        story.choice2.text = second
        story.action2 = second
        story.choice3.text = third
        story.action3 = third
        story.choice4.text = fourth
        story.action4 = fourth
    }
    fun chapter1_DiscussPlan(){
        functions.showAll()
        functions.resetAction()
    }
    fun chapter1_DiscussOnRoad(){
        functions.showAll()
        functions.resetAction()
    }
    fun chapter1_DiscussionUnserious(){
        functions.showAll()
        functions.resetAction()
    }
}

