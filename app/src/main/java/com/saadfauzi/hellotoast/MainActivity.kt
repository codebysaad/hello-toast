package com.saadfauzi.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.saadfauzi.hellotoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, resources.getString(R.string.message), Toast.LENGTH_SHORT).show()
            }

            btnCount.setOnClickListener {
                mCount++
                tvCount.text = mCount.toString()
            }
        }
    }
}