package com.example.xando

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.WHITE
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button1 : Button
    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private lateinit var button4 : Button
    private lateinit var button5 : Button
    private lateinit var button6 : Button
    private lateinit var button7 : Button
    private lateinit var button8 : Button
    private lateinit var button9 : Button
    private lateinit var newbutton : Button
    private lateinit var refbutton : Button
    private lateinit var player1 : TextView
    private lateinit var player2 : TextView
    private var activePlayer =  1
    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()

    var nik  = 0
    var bak = 0

//    var gameActive = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()


    }





    @RequiresApi(Build.VERSION_CODES.M)
    override fun onClick(clickedView: View?) {

//        if(!gameActive)
//            return

        if(clickedView is Button){
            var buttonNumber = 0
            when(clickedView.id){
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
                R.id.refbutton -> refresh()
                R.id.newbutton -> newmatch()


            }
            if(buttonNumber != 0){
                playGame(clickedView , buttonNumber)
            }

        }

    }

     private fun playGame(clickedview: Button, buttonNumber: Int) {
        if (activePlayer == 1){
            clickedview.text = "X"
            clickedview.setBackgroundColor(Color.WHITE)
            activePlayer = 2
            firstPlayer.add(buttonNumber)
        }
        else{
            clickedview.text = "O"
            clickedview.setBackgroundColor(Color.DKGRAY)
            activePlayer = 1
            secondPlayer.add(buttonNumber)
        }

        clickedview.isEnabled = false
        check()





    }

    private fun check() {
        var winnerPlayer = 0


        if(firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1

        }
        if(secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)){
            winnerPlayer = 2

        }
        if(winnerPlayer == 1){
            Toast.makeText(this, "X is WINNER!", Toast.LENGTH_SHORT).show()
            buttondis()

            nik += 1
            player1.text = "$nik"



        }
        if (winnerPlayer == 2) {
            Toast.makeText(this, "O is WINNER!", Toast.LENGTH_SHORT).show()
            buttondis()
            bak += 1
            player2.text = "$bak"


        }





    }


    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.M)
    private fun refresh(){


        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true





        firstPlayer = ArrayList<Int>()
        secondPlayer = ArrayList<Int>()

        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""

        button1.setBackgroundColor(R.color.teal_200)
        button2.setBackgroundColor(R.color.teal_200)
        button3.setBackgroundColor(R.color.teal_200)
        button4.setBackgroundColor(R.color.teal_200)
        button5.setBackgroundColor(R.color.teal_200)
        button6.setBackgroundColor(R.color.teal_200)
        button7.setBackgroundColor(R.color.teal_200)
        button8.setBackgroundColor(R.color.teal_200)
        button9.setBackgroundColor(R.color.teal_200)


        activePlayer = 1
//        gameActive = true
    }




    @SuppressLint("SetTextI18n")
    private fun newmatch(){
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true

        firstPlayer = ArrayList<Int>()
        secondPlayer = ArrayList<Int>()

        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""

        player1.text = "player1-"; "$nik"
        player2.text = "player2-"; "$bak"


    }

//    private fun draw1(){
//        button1.isClickable = false
//        button2.isClickable = false
//        button3.isClickable = false
//        button4.isClickable = false
//        button5.isClickable = false
//        button6.isClickable = false
//        button7.isClickable = false
//        button8.isClickable = false
//        button9.isClickable = false
//
//
//
//        Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show()
//
//    }


    private fun buttondis(){
       button1.isEnabled =false
       button2.isEnabled =false
       button3.isEnabled =false
       button4.isEnabled =false
       button5.isEnabled =false
       button6.isEnabled =false
       button7.isEnabled =false
       button8.isEnabled =false
       button9.isEnabled =false
    }



    private fun init(){
        button1 = findViewById(R. id. button1)
        button2 = findViewById(R. id. button2)
        button3 = findViewById(R. id. button3)
        button4 = findViewById(R. id. button4)
        button5 = findViewById(R. id. button5)
        button6 = findViewById(R. id. button6)
        button7 = findViewById(R. id. button7)
        button8 = findViewById(R. id. button8)
        button9 = findViewById(R. id. button9)
        refbutton = findViewById(R. id. refbutton)
        newbutton = findViewById(R. id. newbutton)
        player1 = findViewById(R. id. player1)
        player2 = findViewById(R. id. player2)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        refbutton.setOnClickListener(this)
        newbutton.setOnClickListener(this)


    }




}