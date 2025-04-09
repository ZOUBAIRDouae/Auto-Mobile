package com.example.viewmodel



import kotlinx.coroutines.flow.MutableStateFlow
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow


class CompteurViewModel : ViewModel() {
    private val _compteur = MutableStateFlow(0)
    val compteur: StateFlow<Int> = _compteur

    fun incrementer() {
        _compteur.value++
    }
}