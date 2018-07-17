package `in`.eyehunt.androidbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //OnClickListener button
        button2.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"OnClickListener",Toast.LENGTH_LONG).show()
        })
    }

    // OnClick method button
    fun likeMe(view : View){
        Toast.makeText(this,"ONclick Like",Toast.LENGTH_LONG).show()
    }
}
