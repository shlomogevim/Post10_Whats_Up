package com.sg.post10_whats_up

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import coil.load
import com.github.florent37.viewanimator.ViewAnimator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView_backGround.load(R.drawable.whatup_pho)

        Handler().postDelayed({
            creatAnimation()
        },10000)

    }

    private fun creatAnimation() {
        ViewAnimator
            .animate(textView)
            .alpha(1f)
            .translationX(-50f,0f)
            .duration(5000)
            .thenAnimate(textView2)
            .translationX(5000f,0f)
            .alpha(1f)
            .duration(5000)
            .thenAnimate(textView3)
            .translationX(-500f,0f)
            .alpha(1f)
            .duration(5000)
            .thenAnimate(textView4)
            .translationX(500f,0f)
            .alpha(1f)
            .duration(5000)
            .start()

    }
}



/* ViewAnimator
           .animate(lotusImage)
           .alpha(0f, 1f)

           .onStart {
               guidTxt.text = "Inhaile ... Exhale"
           }
           .decelerate()
           .duration(1000)
           .thenAnimate(lotusImage)
           .scale(0.02f, 1.5f, 0.02f)
           .rotation(360f)
           .repeatCount(5)
           .accelerate()
           .duration(5000)
           .onStop {
               guidTxt.text = "Good Job"
               lotusImage.scaleX = 1f
               lotusImage.scaleY = 1f

               pref.sessions=pref.sessions+1
               pref.breath=pref.breath+1
               pref.setDate(System.currentTimeMillis())

               val handler= Handler()
               val countDownTimer= Runnable {
                   startActivity(Intent(this@MainActivity,MainActivity::class.java))
                   finish()
               }
               handler.postDelayed(countDownTimer,100)
           }
           .start()
   }*/

/* Handler().postDelayed({

           textView.animate().translationY(-1400f).setDuration(2700).setStartDelay(0)
           lottie.animate().translationX(2000f).setDuration(2900)
       },5000)*/


/* background_Id.scale=0f
Handler().postDelayed({
    background_Id.scale=1f
},4000)

}*/

/*
private fun startAnimaion() {
    ViewAnimator
        .animate(background_Id)
        .alpha(0f, 1f)
        .duration(20000)
        .start()

}*/
