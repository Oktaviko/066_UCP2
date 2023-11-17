package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercise2.ui.theme.Exercise2Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    pilihanDosen: List<String>,
    onSelectionChanged: (String) -> Unit,
    onSubmitButtonClick: (MutableList<String>)-> Unit,
    modifier : Modifier = Modifier
){
    var dosenYgDipilih by remember {mutableStateOf("")}
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

    var listDataTxt : MutableList<String> = mutableListOf(namaTxt, nimTxt, konsenTxt, judulTxt)

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        Text(text = "Formulir Pengajuan Skripsi",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.padding(15.dp))
        OutlinedTextField(value = namaTxt, onValueChange = {namaTxt = it},
            label = {
                Text(text = "Nama Mahasiswa")
            })
        Spacer(modifier = Modifier.padding(7.dp))
        OutlinedTextField(value = nimTxt, onValueChange = {nimTxt = it},
            label = {
                Text(text = "NIM")
            })
        Spacer(modifier = Modifier.padding(7.dp))
        OutlinedTextField(value = konsenTxt, onValueChange = {konsenTxt = it},
            label = {
                Text(text = "Konsentrasi")
            })
        Spacer(modifier = Modifier.padding(7.dp))
        OutlinedTextField(value = judulTxt, onValueChange = {judulTxt = it},
            label = {
                Text(text = "Judul Skripsi")
            })
        Spacer(modifier = Modifier.padding(20.dp))
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                modifier = Modifier.padding(16.dp)
            ){
                Column(
                    modifier = Modifier
                ){
                    Text(text = "Dosen Pembimbing 1")
                    pilihanDosen.forEach { item ->
                        Row(
                            modifier = Modifier.selectable(
                                selected = dosenYgDipilih == item,
                                onClick = {
                                    dosenYgDipilih = item
                                    onSelectionChanged(item)
                                }
                            ),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            RadioButton(selected = dosenYgDipilih == item, onClick = {
                                dosenYgDipilih = item
                                onSelectionChanged(item)
                            })
                            Text(item)
                        }
                    }
                }
                Column(
                    modifier = Modifier
                ){
                    Text(text = "Dosen Pembimbing 2")
                    pilihanDosen.forEach { item ->
                        Row(
                            modifier = Modifier.selectable(
                                selected = dosenYgDipilih == item,
                                onClick = {
                                    dosenYgDipilih = item
                                    onSelectionChanged(item)
                                }
                            ),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            RadioButton(selected = dosenYgDipilih == item, onClick = {
                                dosenYgDipilih = item
                                onSelectionChanged(item)
                            })
                            Text(item)
                        }
                    }
                }
            }
        }
    }
}
