package com.example.exercise2

import androidx.lifecycle.ViewModel
import com.example.exercise2.data.OrderUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel(){
    private val _stateUI = MutableStateFlow(OrderUIState())
    val stateUI : StateFlow<OrderUIState> = _stateUI.asStateFlow()


    fun setContact(listData : MutableList<String>){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = listData[0],
                nim = listData[1],
                konsen = listData[2],
                judul = listData[3]
            )
        }
    }

    fun setDosen1 (Dosen1 : String){
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dosen1 = Dosen1)}
    }
    fun setDosen2 (Dosen2 : String){
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dosen2 = Dosen2)}
    }
}