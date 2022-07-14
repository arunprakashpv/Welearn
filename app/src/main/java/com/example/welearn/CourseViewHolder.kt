package com.example.welearn


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    var courseImage : ImageView
    var courseName : TextView

    init{
        courseImage = itemView.findViewById(R.id.course_image)
        courseName = itemView.findViewById(R.id.course_name)
    }
}
