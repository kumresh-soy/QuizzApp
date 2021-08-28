package com.example.quizzapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : AppCompatActivity(), View.OnClickListener{
    var SUM = 0
    private var mCurrentPosition:Int = 0
    private var mQuestionsList: ArrayList<Questions>? = null
    private var mSelectedOptionPosition: Int = 0
//    private val ll = LinkedListSave<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        mQuestionsList = Constant.getQuestions()

        setQuestion()
        btn_one.setOnClickListener(this)
        btn_two.setOnClickListener(this)
        btn_three.setOnClickListener(this)
        btn_four.setOnClickListener(this)


        btn_next.setOnClickListener {
            if (mSelectedOptionPosition == mQuestionsList!![mCurrentPosition-1].answer){
                SUM++
            }
            if (mCurrentPosition >= mQuestionsList!!.size){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("sum",SUM)
                startActivity(intent)
                finish()
            }else{
                setQuestion()
            }
        }


    }
    private fun setQuestion(): Questions{
        mCurrentPosition++
        defaultOptionsView()

        val question = mQuestionsList!![mCurrentPosition-1]

        if (mCurrentPosition == mQuestionsList!!.size){
            btn_next.text = "Get Result"
        }

        progress_bar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/"+progress_bar.max
        tv_question.text = question.question
        btn_one.text = question.optionOne
        btn_two.text = question.optionTwo
        btn_three.text = question.optionThree
        btn_four.text = question.optionFour

        return question
    }
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, btn_one)
        options.add(1, btn_two)
        options.add(2, btn_three)
        options.add(3, btn_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.round_border_btn
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_one -> {
               selectedOptionView(btn_one, 1)
            }
            R.id.btn_two -> {
               selectedOptionView(btn_two, 2)
            }
            R.id.btn_three -> {
                selectedOptionView(btn_three, 3)
            }
            R.id.btn_four -> {
                selectedOptionView(btn_four, 4)
            }
        }
    }

    private fun selectedOptionView(tb:TextView,selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tb.setTextColor(Color.parseColor("#363A43"))
        tb.setTypeface(tb.typeface, Typeface.BOLD)
        tb.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_btn
        )
    }
}