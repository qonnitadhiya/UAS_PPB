package qonnita.uas_ppb_qonnitadhiya


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import qonnita.uas_ppb_qonnitadhiya.databinding.ActivityHomeBinding

class Home : AppCompatActivity() , ProdukClickListener {
    var sliderView: SliderView? = null
    var images = intArrayOf(
        R.drawable.banner1,
        R.drawable.banner2,
        R.drawable.banner3
    )
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sliderView = findViewById(R.id.image_slider)
        val sliderAdapter = SliderAdapter(images)
        sliderView?.setSliderAdapter(sliderAdapter)
        sliderView?.setIndicatorAnimation(IndicatorAnimationType.WORM)
        sliderView?.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        sliderView?.startAutoCycle()

        populateProduks()

        val homeActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,2)
            adapter = CardAdapter(produkList,homeActivity)
        }
    }

    override fun onClick(produk: Produk) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(PRODUK_ID_EXTRA,produk.id)
        startActivity(intent)
    }

    private fun populateProduks() {
        val produk1 = Produk(
            R.drawable.tas,
            title = "Bagpack",
            description = "Disini Produk Bagpack Eiger"
        )
        produkList.add(produk1)

        val produk2 = Produk(
            R.drawable.jaket,
            title = "Jacket",
            description = "Disini Produk Jacket Eiger"
        )
        produkList.add(produk2)

        val produk3 = Produk(
            R.drawable.sandal,
            title = "Slippers",
            description = "Disini Produk Sandal Eiger"
        )
        produkList.add(produk3)


        val produk4 = Produk(
            R.drawable.sepatu,
            title = "Shoes",
            description = "Disini Produk Sepatu Eiger"
        )

        produkList.add(produk4)


    }


}