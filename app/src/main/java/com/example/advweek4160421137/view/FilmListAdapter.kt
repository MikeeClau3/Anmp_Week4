package com.example.advweek4160421137.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.advweek4160421137.databinding.FragmentStudentListBinding
import com.example.advweek4160421137.model.Student


class FilmListAdapter(val studentList:ArrayList<Student>)
    : RecyclerView.Adapter<FilmListAdapter.StudentViewHolder>() { //isinya view holder
    class StudentViewHolder(val binding: FragmentStudentListBinding)
        : RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = FragmentStudentListBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return StudentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
//        holder.binding.txtID.text = studentList[position].id
//        holder.binding.txtName.text = studentList[position].name
//        holder.binding.btnDetail.setOnClickListener{
//            val action = StudentListFragmentDirections.actionStudentDetailFragment()
//            Navigation.findNavController(it).navigate(action)
//        }
    }

    fun updateStudentList(newStudentList: ArrayList<Student>) {
        studentList.clear()
        studentList.addAll(newStudentList)
        notifyDataSetChanged()
    }
}
