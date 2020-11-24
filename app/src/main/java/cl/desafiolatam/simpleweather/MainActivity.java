package cl.desafiolatam.simpleweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import cl.desafiolatam.simpleweather.databinding.ActivityMainBinding;
import cl.desafiolatam.simpleweather.model.Weather;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Weather weather = new Weather ("Punta Arenas","10-Jun-2020","17°","C");
        binding.setWeather(weather);

    }
}