package ibrahim.aytimur.degiskensabitler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Değişken ve Sabitler
        /*
        var : Değişen değerler için
        val : Sabit, değişmeyen değerler için
         */
        var sayi1:Int=6
        var sayi2:Int=5
        var sonuc:Int=0
        sonuc = sayi1 + sayi2

        var adi:String="İbrahim"
        var soyadi:String="Aytimur"
        adi="Betül"
        soyadi="Özen Akyol"
        Toast.makeText(applicationContext,"$sonuc+$adi+$soyadi",Toast.LENGTH_SHORT).show()
    }
}
