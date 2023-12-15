package com.example.funfactsapp.ui

import androidx.lifecycle.ViewModel

class FactsViewModel : ViewModel() {


    fun generateRandomFact(selectedAnimal: String): String {
        return if (selectedAnimal == "Dog") {
            getDogFacts().random()
        } else
            getCatFacts().random()
    }

    fun getDogFacts(): List<String> {
        val dogFacts = listOf(
            "Did you know that dogs have a favorite Netflix show? It's called 'Bark Mirror'—they binge-watch it when you're not home.",
            "Dogs have a secret talent for finding the only muddy puddle in a 10-mile radius, especially right after a bath.",
            "Ever notice that your dog thinks 'fetch' is a solo sport? They bring the ball back, but only to show off their excellent retrieving skills, not for you to throw it again.",
            "Dogs believe that the best way to express excitement is by spinning in circles until they get dizzy. Who needs a dance floor?",
            "Dogs have a special ability to sense when you're about to eat something delicious. That's when they become expert beggars and master the art of puppy eyes.",
            "If your dog could talk, their favorite phrase would be 'Are we there yet?'—even if you just left the house for a walk around the block.",
            "Dogs think that vacuum cleaners are their mortal enemies, sent to destroy all the interesting smells on the floor.",
            "A dog's idea of 'helping' with gardening involves digging up your newly planted flowers and proudly presenting them to you as a gift.",
            "Dogs have a unique take on personal space. Their philosophy is 'If I can sit on you, you're close enough.'",
            "Why did the dog sit in the shade? Because he didn't want to be a hot dog!"
        )
        return dogFacts
    }

    fun getCatFacts(): List<String> {
        val catFacts = listOf(
            "Did you know that cats can make over 100 different sounds, yet they still ignore you when you call their name? It's like having a furry teenager in the house.",
            "Cats have a natural talent for yoga. They can sleep in the weirdest positions and still wake up looking graceful.",
            "Ever wonder why your cat knocks things off tables? It's not gravity; it's their way of testing if the laws of physics still apply.",
            "Cats believe that the best alarm clock is a strategically placed paw on your face at 3 AM. Who needs sleep anyway?",
            "Cats have a secret plan to take over the world. Just try to tell me they aren't plotting something when they stare at the wall for no apparent reason.",
            "A cat's favorite hobby is sitting on your laptop keyboard and pretending it's helping you work. Productivity level: negative.",
            "Cats invented the art of the slow blink to hypnotize humans into giving them more treats. It's a feline superpower.",
            "If cats had a motto, it would be 'I do what I want, when I want, and you can't stop me.'",
            "Cats are the only creatures that can simultaneously ignore you and make you feel guilty about it. Skilled emotional manipulators.",
            "Why did the cat sit on the computer? To keep an eye on the mouse!"
        )
        return catFacts
    }

}