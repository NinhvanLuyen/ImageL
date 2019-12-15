package luyen.ninh.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import luyen.ninh.myapplication.lib.LLImageView
import luyen.ninh.myapplication.lib.callback.LoadImageCallback

class ImageListAdapter(private val mImages: MutableList<ImageModel>) :
    ListAdapter<ImageModel, ImageListAdapter.ItemViewHolder>(ImageModelItemCallback()) {
    init {
        submitList(mImages)
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: LLImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.imageView.loadImage(mImages[position], object : LoadImageCallback {
            override fun onLoading() {

            }

            override fun onSuccess() {

            }

            override fun onFail() {

            }

        })
    }
}

class ImageModelItemCallback : DiffUtil.ItemCallback<ImageModel>() {
    override fun areItemsTheSame(oldItem: ImageModel, newItem: ImageModel): Boolean =
        oldItem?.path == newItem?.path || oldItem.src == newItem.src


    override fun areContentsTheSame(oldItem: ImageModel, newItem: ImageModel): Boolean =
        oldItem?.path == newItem?.path || oldItem.src == newItem.src
}
