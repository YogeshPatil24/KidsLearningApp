package com.mvvmmovies.kidslearningabcd.activities

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var textToSpeech: TextToSpeech
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        textToSpeech = TextToSpeech(this@MainActivity) {
            if (it == TextToSpeech.SUCCESS) {
                var tts = textToSpeech.setLanguage(Locale.ENGLISH)
            }
        }
        buttonclicks()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    private fun buttonclicks() {
        /*  binding.buttonA.setOnClickListener(this)
          binding.buttonB.setOnClickListener(this)
          binding.buttonC.setOnClickListener(this)
          binding.buttonD.setOnClickListener(this)
          binding.buttonE.setOnClickListener(this)
          binding.buttonF.setOnClickListener(this)
          binding.buttonG.setOnClickListener(this)
          binding.buttonH.setOnClickListener(this)
          binding.buttonI.setOnClickListener(this)
          binding.buttonJ.setOnClickListener(this)
          binding.buttonK.setOnClickListener(this)
          binding.buttonL.setOnClickListener(this)
          binding.buttonM.setOnClickListener(this)
          binding.buttonN.setOnClickListener(this)
          binding.buttonO.setOnClickListener(this)
          binding.buttonP.setOnClickListener(this)
          binding.buttonQ.setOnClickListener(this)
          binding.buttonR.setOnClickListener(this)
          binding.buttonS.setOnClickListener(this)
          binding.buttonT.setOnClickListener(this)
          binding.buttonU.setOnClickListener(this)
          binding.buttonV.setOnClickListener(this)
          binding.buttonW.setOnClickListener(this)
          binding.buttonX.setOnClickListener(this)
          binding.buttonY.setOnClickListener(this)
          binding.buttonZ.setOnClickListener(this)*/
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            /*   R.id.buttonA -> {
                   val s = "A for Apple"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonB -> {
                   val s = "B for Ball"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonC -> {
                   val s = "C for Cat"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonD -> {
                   val s = "D for Dog"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonE -> {
                   val s = "E for Elephant"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonF -> {
                   val s = "F for Fish"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonG -> {
                   val s = "G for Grape"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonH -> {
                   val s = "H for Hat"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonI -> {
                   val s = "I for Ice Cream"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonJ -> {
                   val s = "J for Jelly"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonK -> {
                   val s = "K for Kangaroo"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonL -> {
                   val s = "L for Lion"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonM -> {
                   val s = "M for Monkey"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonN -> {
                   val s = "N for Nest"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonO -> {
                   val s = "O for Orange"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonP -> {
                   val s = "P for Penguin"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonQ -> {
                   val s = "Q for Queen"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonR -> {
                   val s = "R for Rabbit"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonS -> {
                   val s = "S for Sun"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonT -> {
                   val s = "T for Tiger"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonU -> {
                   val s = "U for Umbrella"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonV -> {
                   val s = "V for Violin"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonW -> {
                   val s = "W for Watermelon"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonX -> {
                   val s = "X for Xylophone"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonY -> {
                   val s = "Y for Yellow"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }

               R.id.buttonZ -> {
                   val s = "Z for Zebra"
                   textToSpeech.speak(s, TextToSpeech.QUEUE_FLUSH, null)
               }*/
        }
    }
}


