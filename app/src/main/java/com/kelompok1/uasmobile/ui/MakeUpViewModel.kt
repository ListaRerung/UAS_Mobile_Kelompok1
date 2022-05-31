package com.kelompok1.uasmobile.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kelompok1.uasmobile.network.*
import kotlinx.coroutines.launch

class MakeUpViewModel: ViewModel() {
    private val _listeyebrow = MutableLiveData<List<Eyebrow>>()
    val listeyebrow: LiveData<List<Eyebrow>> = _listeyebrow

    private val _eyebrow = MutableLiveData<Eyebrow>()
    val eyebrow: LiveData<Eyebrow> = _eyebrow

    private val _listeyeliner = MutableLiveData<List<eyeliner>>()
    val listeyeliner: LiveData<List<eyeliner>> = _listeyeliner

    private val _eyeliner = MutableLiveData<eyeliner>()
    val eyeliner: LiveData<eyeliner> = _eyeliner

    private val _listeyeshadow = MutableLiveData<List<eyeshadow>>()
    val listeyeshadow: LiveData<List<eyeshadow>> = _listeyeshadow

    private val _eyeshadow = MutableLiveData<eyeshadow>()
    val eyeshadow: LiveData<eyeshadow> = _eyeshadow

    fun getDataEyebrow(){
        viewModelScope.launch {
            try {
//                _listeyebrow.value = MakeUpApi.retrofitServiceApi.etDataEyebrow("https://makeup-api.herokuapp.com/api/v1/products.json?product_type=eyebrow")
                _listeyebrow.value = MakeUpApi.retrofitServiceApi.getDataEyebrow("eyebrow")
                Log.d("berhasil", _listeyebrow.value.toString())
            } catch (e: Exception){
                Log.d("error", e.printStackTrace().toString())
            }
        }
    }
    fun getEyeliner(){
        viewModelScope.launch {
            try {
                _listeyeliner.value = MakeUpApi.retrofitServiceApi.getDataEyeliner("eyeliner")
            } catch (e: Exception){
                Log.d("error", e.printStackTrace().toString())
            }
        }
    }
    fun getEyeshadow(){
        viewModelScope.launch {
            try {
                _listeyeshadow.value = MakeUpApi.retrofitServiceApi.getDataEyeshadow("eyeshadow")
            } catch (e: Exception){
                Log.d("error", e.printStackTrace().toString())
            }
        }
    }
    fun onEyebrowClicked(eyebrow: Eyebrow){
        _eyebrow.value = eyebrow
    }
    fun onEyelinerClicked(eyeliner: eyeliner){
        _eyeliner.value = eyeliner
    }
    fun onEyeshadowClicked(eyeshadow: eyeshadow){
        _eyeshadow.value = eyeshadow
    }
}