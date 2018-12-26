package com.itretina.tictactoe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun buttonClicked(view:View){
        val selectedButton = view as Button
        var cellId = 0

        when(selectedButton.id){
            R.id.button1 -> cellId = 1
            R.id.button2 -> cellId = 2
            R.id.button3 -> cellId = 3
            R.id.button4 -> cellId = 4
            R.id.button5 -> cellId = 5
            R.id.button6 -> cellId = 6
            R.id.button7 -> cellId = 7
            R.id.button8 -> cellId = 8
            R.id.button9 -> cellId = 9

        }
//        Toast.makeText(this,"Button clicked.."+cellId,Toast.LENGTH_SHORT).show()
        gamePlay(cellId,selectedButton)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1

    fun gamePlay(cellId:Int,selectedButton:Button){

        if(activePlayer == 1)
        {
            selectedButton.text = "X"
            selectedButton.setTextColor(Color.WHITE)
            selectedButton.setBackgroundColor(Color.DKGRAY)
            player1.add(cellId)
            activePlayer = 2
        }else{
            selectedButton.text = "O"
            selectedButton.setBackgroundColor(Color.CYAN)
            player2.add(cellId)
            activePlayer = 1
        }
        selectedButton.isEnabled = false
    }
    
}
