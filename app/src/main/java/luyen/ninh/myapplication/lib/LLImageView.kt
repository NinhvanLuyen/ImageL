package luyen.ninh.myapplication.lib

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import luyen.ninh.myapplication.ImageModel
import luyen.ninh.myapplication.lib.callback.LoadImageCallback


/**
 * Created by luyen_ninh on 12/15/19.
 */
class LLImageView : AppCompatImageView {
    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
    }

    private var resource: Int = 0

    fun loadImage(resource: Int, callback: LoadImageCallback) {
        //Todo: showPlaceHolder
        resource.let {

            callback.onLoading()
            //Todo: showLoading
            setImageResource(it)
            //Todo: hideLoading
            callback.onSuccess()
        }
    }

    fun loadImage(model: ImageModel, callback: LoadImageCallback) {
        //Todo: showPlaceHolder
        model.src?.let {

            callback.onLoading()
            //Todo: showLoading
            setImageResource(it)
            //Todo: hideLoading
            callback.onSuccess()
        }
    }


}