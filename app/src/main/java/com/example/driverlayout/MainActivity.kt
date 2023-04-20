package com.example.driverlayout

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.GravityCompat
import com.example.driverlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            navigationId.setNavigationItemSelectedListener {
                when(it.itemId) {

                    R.id.item1 -> {
                        Toast.makeText(this@MainActivity, "Hello item1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item2 -> {
                        Toast.makeText(this@MainActivity, "Hello item2", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item3 -> {
                        Toast.makeText(this@MainActivity, "Hello item3", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item4 -> {
                        Toast.makeText(this@MainActivity, "Hello item4", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item5 -> {
                        Toast.makeText(this@MainActivity, "Hello item5", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item6 -> {
                        Toast.makeText(this@MainActivity, "Hello item6", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item7 -> {
                        Toast.makeText(this@MainActivity, "Hello item7", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item8-> {
                        Toast.makeText(this@MainActivity, "Hello item8", Toast.LENGTH_SHORT).show()
                    }
                }
                driwer.closeDrawer(GravityCompat.START)
                true
            }
            openId.setOnClickListener {
                driwer.openDrawer(GravityCompat.START)
            }
        }
    }
}