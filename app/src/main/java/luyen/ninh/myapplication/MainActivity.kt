package luyen.ninh.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val llManager = LinearLayoutManager(this)
        llManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = llManager
        val data = mutableListOf<ImageModel>()
        for (i in 1..100) {
            if (i % 2 == 0)
                data.add(ImageModel(R.drawable.src1))
            else
                data.add(ImageModel(R.drawable.src2))

        }
        val adapter = ImageListAdapter(data)
        recyclerView.adapter = adapter
    }

}
