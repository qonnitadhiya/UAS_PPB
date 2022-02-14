package qonnita.uas_ppb_qonnitadhiya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import qonnita.uas_ppb_qonnitadhiya.databinding.CardItemBinding


class CardViewHolder (
    private val cardItemBinding: CardItemBinding,
    private val clickListener: ProdukClickListener
) : RecyclerView.ViewHolder(cardItemBinding.root)
{
    fun bindProduk(produk: Produk){
        cardItemBinding.cover.setImageResource(produk.cover)
        cardItemBinding.title.text = produk.title

        cardItemBinding.cardView.setOnClickListener {
            clickListener.onClick(produk)
        }
    }
}