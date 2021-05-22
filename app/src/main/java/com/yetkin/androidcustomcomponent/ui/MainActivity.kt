package com.yetkin.androidcustomcomponent.ui

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yetkin.androidcustomcomponent.databinding.ActivityMainBinding
import com.yetkin.androidcustomcomponent.util.extension.toastMessage

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        context = this

        binding.apply {
            itemCall.setOnClickListener { "Call Click".toastMessage(context) }
            itemMessage.setOnClickListener { "Message Click".toastMessage(context) }
            itemVideoCall.setOnClickListener { "Video Call Click".toastMessage(context) }
        }
    }
}