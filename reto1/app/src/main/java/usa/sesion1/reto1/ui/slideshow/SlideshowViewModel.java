package usa.sesion1.reto1.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Talleres & Almacen");
    }

    public LiveData<String> getText() {
        return mText;
    }
}