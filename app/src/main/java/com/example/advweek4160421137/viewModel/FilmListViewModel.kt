package com.example.advweek4160421137.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advweek4160421137.model.Student

class FilmListViewModel: ViewModel() {
    val studentsLD = MutableLiveData<ArrayList<Student>>() //live data yang berjenis ArrayListofStudent
    //kenapa bikin arraylist? karena recylcler view kita punya adapter yang minta arraylist
    val loadingLD = MutableLiveData<Boolean>()
    val studentLoadErrorLD = MutableLiveData<Boolean>()

    //view model biasanya punya function yang menghasilkan data
    fun refresh() {
        Log.d("CEKMASUK", "masukvolley")

    }

}
