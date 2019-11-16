package com.example.colorview_codelab

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var boxOne: TextView
    lateinit var boxTwo: TextView
    lateinit var boxThree: TextView
    lateinit var boxFour: TextView
    lateinit var boxFive: TextView
    lateinit var rootLayout: View
    lateinit var redButton: Button
    lateinit var greenButton: Button
    lateinit var yellowButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boxOne = tv_box_one
        boxTwo = tv_box_two
        boxThree = tv_box_three
        boxFour = tv_box_four
        boxFive = tv_box_five
        rootLayout = constraint_layout
        redButton = btn_red
        greenButton = btn_green
        yellowButton = btn_yellow
        setClickListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.tv_box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tv_box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.tv_box_three -> view.setBackgroundColor(Color.BLUE)
            R.id.tv_box_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.tv_box_five -> view.setBackgroundColor(Color.BLUE)
            R.id.btn_red -> tv_box_three.setBackgroundResource(R.color.my_red)
            R.id.btn_green -> tv_box_five.setBackgroundResource(R.color.my_green)
            R.id.btn_yellow -> tv_box_four.setBackgroundResource(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setClickListeners() {
        val clickableViews: List<View> =
            listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, rootLayout, redButton, greenButton, yellowButton )
        clickableViews.forEach { it ->
            it.setOnClickListener {
                makeColored(it)
            }
        }
    }
}
