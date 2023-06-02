package ru.bignerd.googlemap

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.bignerd.googlemap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val geoUriString = "google.streetview:cbll=59.939448,30.328264&cbp=1,99.56,,1,2.0&mz=19"
            val geoUri:Uri = Uri.parse(geoUriString)
            val mapInten = Intent(Intent.ACTION_VIEW,geoUri)
            if(mapInten.resolveActivity(packageManager) != null){
                startActivity(mapInten)
            }
        }
    }
}