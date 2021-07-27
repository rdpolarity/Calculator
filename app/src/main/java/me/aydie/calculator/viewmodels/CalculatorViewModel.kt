package me.aydie.calculator.viewmodels

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel(), Observable {
    private val _answer = MutableLiveData<Int>()
    val answer : LiveData<Int>
        get() = _answer

    @Bindable
    val firstNumber = MutableLiveData("1")

    @Bindable
    val secondNumber = MutableLiveData("2")

    val isAddMode = MutableLiveData(true)

    init {
        calculateAnswer()
    }

    fun calculateAnswer() {
        _answer.value = if (isAddMode.value == true) firstNumber.value?.toInt()?.plus(secondNumber.value?.toInt() ?: 0)
        else firstNumber.value?.toInt()?.minus(secondNumber.value?.toInt() ?: 0)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

}