import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private val _text = MutableLiveData("0")
    val text: LiveData<String> get() = _text

    public fun onButton1Click() {
        updateText(+1)
    }

    public fun onButton2Click() {
        updateText(-1)
    }

        private fun updateText(value: Int) {
        val currentValue = _text.value?.toIntOrNull() ?: 0
        _text.value = (currentValue + value).toString()
    }
}
