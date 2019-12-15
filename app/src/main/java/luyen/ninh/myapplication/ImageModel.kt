package luyen.ninh.myapplication

/**
 * Created by luyen_ninh on 12/15/19.
 */
data class ImageModel(var path: String?) {
    var src:Int? = null
    constructor(src: Int) : this(null){
        this.src = src
    }
}