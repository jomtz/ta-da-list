package com.jomartinez.tadalist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.jomartinez.tadalist.databinding.ActivityMainBinding
import com.jomartinez.tadalist.ui.NewTaskFragment
import com.jomartinez.tadalist.ui.TaskViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]

        binding.floatingActionButton.setOnClickListener(){

        }
    }
}