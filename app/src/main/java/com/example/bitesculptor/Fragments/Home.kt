package com.example.bitesculptor.Fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.bitesculptor.R

class Home : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrayslide=ArrayList<SlideModel>()
        arrayslide.add(SlideModel(R.drawable.banner1,ScaleTypes.FIT))
        arrayslide.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        arrayslide.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))
        arrayslide.add(SlideModel(R.drawable.banner4, ScaleTypes.FIT))
        arrayslide.add(SlideModel(R.drawable.banner5, ScaleTypes.FIT))
        arrayslide.add(SlideModel(R.drawable.banner6, ScaleTypes.FIT))

        val imageSLider=view.findViewById<ImageSlider>(R.id.image_slider)
        imageSLider?.setImageList(arrayslide)
        imageSLider?.setImageList(arrayslide,ScaleTypes.FIT)
        imageSLider.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {

            }

            override fun onItemSelected(position: Int) {
                val itempostion=arrayslide[position]
                Toast.makeText(activity,"Item selected $position",Toast.LENGTH_SHORT).show()
            }
        })
    }


}