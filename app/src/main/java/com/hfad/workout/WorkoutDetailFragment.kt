package com.hfad.workout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class WorkoutDetailFragment : Fragment() {

    private var workoutId : Long = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false)
    }

    override fun onStart(){
        super.onStart()
        val view : View? = view

        if (view != null) {

            val title: TextView = view.findViewById(R.id.textTitle) as TextView
            val workout: Workout = workouts[workoutId.toInt()]
            title.text = workout.name
            val description: TextView = view.findViewById(R.id.textDescription) as TextView
            description.text = workout.description
        }

    }


    fun setWorkout(id:Long){
        this.workoutId = id
    }

}
