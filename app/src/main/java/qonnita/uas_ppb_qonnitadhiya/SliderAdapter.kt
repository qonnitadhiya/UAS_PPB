package qonnita.uas_ppb_qonnitadhiya

import android.os.Parcel
import android.os.Parcelable
import com.smarteist.autoimageslider.SliderViewAdapter
import android.view.ViewGroup
import android.view.View
import android.view.LayoutInflater

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import qonnita.uas_ppb_qonnitadhiya.SliderAdapter.*

class SliderAdapter(var images: IntArray) : SliderViewAdapter<SliderAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.slider_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(viewHolder: Holder, position: Int) {
        viewHolder.imageView.setImageResource(images[position])
    }

    override fun getCount(): Int {
        return images.size
    }

    inner class Holder(itemView: View) : ViewHolder(itemView) {
        var imageView: ImageView

        init {
            imageView = itemView.findViewById(R.id.image_view)
        }
    }
}