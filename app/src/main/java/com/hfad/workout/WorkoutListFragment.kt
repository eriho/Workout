package com.hfad.workout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.ListFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

/**
 * A simple [Fragment] subclass.
 */
class WorkoutListFragment : ListFragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var names = arrayOfNulls<String>(workouts.size)
        for (i in 0..workouts.size) {
            names[i] = workouts[i].name
        }

        val adapter : ArrayAdapter<String> = ArrayAdapter<String>(
            inflater.context, android.R.layout.simple_list_item_1, names)

        listAdapter = adapter
        return super.onCreateView(inflater, container, savedInstanceState)
        }
}



