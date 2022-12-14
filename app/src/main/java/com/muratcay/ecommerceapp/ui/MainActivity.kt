package com.muratcay.ecommerceapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muratcay.ecommerceapp.R
import com.muratcay.ecommerceapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}