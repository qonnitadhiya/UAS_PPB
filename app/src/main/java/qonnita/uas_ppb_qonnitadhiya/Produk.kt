package qonnita.uas_ppb_qonnitadhiya

var produkList = mutableListOf<Produk>()

val PRODUK_ID_EXTRA = "produkExtra"

class Produk (
    var cover: Int,
    var title: String,
    var description: String,
    val id: Int? = produkList.size

)