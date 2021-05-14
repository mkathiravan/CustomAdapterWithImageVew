package net.kathir.customadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import net.kathir.customadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.placeholder = R.drawable.ic_placeholder
        binding.error = R.drawable.ic_error

        binding.url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSc8zcpSvVsD-37sSrNYY5K5VyHQj5Z6jKYZA&usqp=CAU"
    }
}