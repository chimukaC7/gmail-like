package info.androidhive.gmail.anim;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

/**
 * Created by Techgeek n Gamerboy on 20-Sep-17.
 */

public class AnimationUtils {


//    public static void animate(RecyclerView.ViewHolder holder){
//        ObjectAnimator animatorTranslateY = ObjectAnimator.ofFloat(holder,itemView,"translationY",0, 100);
//        animatorTranslateY.setDuration(1000);
//        animatorTranslateY.start();
//    }

    public static void animate(RecyclerView.ViewHolder holder, boolean goesDown){

        YoYo.with(Techniques.Landing)
                .duration(2000)
                .playOn(holder.itemView);

//        ObjectAnimator animatorTranslateY=ObjectAnimator.ofFloat(holder.itemView,"translationY",goesDown==true?300:-300,0);
//        animatorTranslateY.setDuration(1000);
//        animatorTranslateY.start();

    }

    public static void animateToolbar(View containerToolbar){

    }
}
