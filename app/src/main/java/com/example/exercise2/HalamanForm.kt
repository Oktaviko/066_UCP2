package com.example.exercise2

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun HalamanForm(
    onSubmitButtonClick: (MutableList<String>)-> Unit
){
    var namaTxt by rememberSaveable {
        mutableStateOf("")
    }
    var nimTxt by rememberSaveable {
        mutableStateOf("")
    }
    var konsenTxt by rememberSaveable {
        mutableStateOf("")
    }
    var judulTxt by remember {
        mutableStateOf("")
    }
}