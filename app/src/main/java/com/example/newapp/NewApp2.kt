package com.example.newapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.newapp.databinding.ActivityNewApp2Binding
import kotlin.random.Random

class NewApp2 : AppCompatActivity(), View.OnClickListener {

    private var binding: ActivityNewApp2Binding?=null
    private var mCurrentPosition: Int=1
    private var mQuestionList:ArrayList<Question>?=null
    private var mSelectedOptionPosition: Int=0
    private var musername:String?=null
    private var correctanswers: Int=0
    private var progressBar:ProgressBar? = null
    private  var tvprogress:TextView? =null
    private  var tvquestion:TextView? =null
    private  var tvoptionone:TextView? =null
    private  var tvoptiontwo:TextView? =null
    private  var tvoptionthree:TextView? =null
    private  var tvoptionfour:TextView? =null
    private var btnSubmit:Button?=null
    private var btnfinishInstent:Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_app2)
        binding= ActivityNewApp2Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        musername=intent.getStringExtra(Constants.User_Name)


        tvquestion=findViewById(R.id.tvquestion)
        progressBar=findViewById(R.id.progressBar)
        tvprogress=findViewById(R.id.tvprogress)
        tvoptionone=findViewById(R.id.tvoptionone)
        tvoptiontwo=findViewById(R.id.tvoptiontwo)
        tvoptionthree=findViewById(R.id.tvoptionthree)
        tvoptionfour=findViewById(R.id.tvoptionfour)
        btnSubmit=findViewById(R.id.btnsubmit)

        tvoptionone?.setOnClickListener(this)
        tvoptiontwo?.setOnClickListener(this)
        tvoptionthree?.setOnClickListener(this)
        tvoptionfour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)
        btnfinishInstent?.setOnClickListener(this)


        mQuestionList=Constants.getQuestions()

        SetQuestion()

        resultRedirect()

    }

    private fun resultRedirect(){
        binding?.btnfinishInstent?.setOnClickListener(View.OnClickListener { val intent = Intent(this,Result::class.java)
            intent.putExtra(Constants.User_Name,musername)
            intent.putExtra(Constants.CORRECT_ANSWER,correctanswers)
            intent.putExtra(Constants.TOTAL_QUESTION,mCurrentPosition)
            startActivity(intent)
            finish() })
    }

    private fun SetQuestion() {
        defaultOptionsView()
        val CurrentPosition= Random.nextInt(0, 20)
        val question: Question =mQuestionList!![CurrentPosition]
        progressBar?.progress = mCurrentPosition
        tvprogress?.text = "$mCurrentPosition/${progressBar?.max}"
        tvquestion?.text = question.question
        tvoptionone?.text = question.optionOne
        tvoptiontwo?.text = question.optionTwo
        tvoptionthree?.text = question.optionThree
        tvoptionfour?.text = question.optionFour


        if (mCurrentPosition ==mQuestionList!!.size){
            btnSubmit?.text="FINISH"
        }else{
            btnSubmit?.text="SUBMIT"
        }
    }

    private fun defaultOptionsView(){
        val option=ArrayList<TextView>()
        tvoptionone?.let{
            option.add(0,it)
        }
        tvoptiontwo?.let{
            option.add(1,it)
        }
        tvoptionthree?.let {
            option.add(2,it)
        }
        tvoptionfour?.let {
            option.add(3,it)
        }
        for(option in option){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(
                this,R.drawable.default_option_borer_bg
            )

        }
    }

    private fun  selectedOptionView(tv:TextView,selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition=selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(
            this,R.drawable.default_option_borer_bg
        )
    }

    override fun onClick(view: View?) {

        when(view?.id){
            R.id.tvoptionone->{
                tvoptionone?.let{
                    selectedOptionView(it,1)
                }
            }
            R.id.tvoptiontwo->{
                tvoptiontwo?.let{
                    selectedOptionView(it,2)
                }
            }
            R.id.tvoptionthree->{
                tvoptionthree?.let{
                    selectedOptionView(it,3)
                }
            }
            R.id.tvoptionfour->{
                tvoptionfour?.let{
                    selectedOptionView(it,4)
                }
            }


            R.id.btnsubmit->{
                if(mSelectedOptionPosition==0){
                    mCurrentPosition++
                    when{
                        mCurrentPosition<=mQuestionList!!.size ->{
                            SetQuestion()
                        }
                        else->{
                            val intent = Intent(this,Result::class.java)
                            intent.putExtra(Constants.User_Name,musername)
                            intent.putExtra(Constants.CORRECT_ANSWER,correctanswers)
                            intent.putExtra(Constants.TOTAL_QUESTION,mQuestionList?.size)
                            startActivity(intent)
                            finish()
                        }


                    }
                }
                else{
                    val question=mQuestionList?.get(mCurrentPosition-1)
                    if(question!!.correctAnswer!=mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_borer_bg)
                    }else{
                        answerView(question.correctAnswer,R.drawable.correct_option_borer_bg)
                        correctanswers++
                    }


                    if (mCurrentPosition==mQuestionList!!.size){
                        btnSubmit?.text="FINISH"
                    }else{
                        btnSubmit?.text="GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition=0
                }
            }

        }
    }

    private fun answerView(answer: Int,drawableView: Int){
        when(answer){
            1->{
                tvoptionone?.background=ContextCompat.getDrawable(
                    this,
                    drawableView)
            }
            2->{
                tvoptiontwo?.background=ContextCompat.getDrawable(
                    this,
                    drawableView)
            }
            1->{
                tvoptionthree?.background=ContextCompat.getDrawable(
                    this,
                    drawableView)
            }
            1->{
                tvoptionfour?.background=ContextCompat.getDrawable(
                    this,
                    drawableView)
            }
        }
    }

}













