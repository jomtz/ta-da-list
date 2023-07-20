package com.jomartinez.tadalist.ui.tasklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jomartinez.tadalist.databinding.FragmentTaskListBinding
import com.jomartinez.tadalist.ui.TaskViewModel


class TaskListFragment : Fragment() {

    private lateinit var taskViewModel: TaskViewModel

    private lateinit var binding: FragmentTaskListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTaskListBinding.inflate(layoutInflater, container, false)

        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(context, "Button Listener", LENGTH_SHORT).show()
        }
        return binding.root
    }






}