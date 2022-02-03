package arevalosalazar.cesar.appanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    Animation rotacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen=(ImageView) findViewById(R.id.imageView);

    }

    public void animacion(View v){
        rotacion = AnimationUtils.loadAnimation(this, R.anim.tween);
        rotacion.reset();
        imagen.startAnimation(rotacion);
    }
}