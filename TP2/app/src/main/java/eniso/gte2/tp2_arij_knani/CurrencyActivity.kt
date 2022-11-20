package eniso.gte2.tp2_arij_knani

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.gte2.tp2_arij_knani.databinding.ActivityCurrencyBinding

class CurrencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_currency)
        val binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnDinar.setOnClickListener {

            binding.btnDinar.setBackgroundColor(Color.DKGRAY)
            binding.btnEuro.setBackgroundColor(Color.LTGRAY)
            if (binding.myed.text.isEmpty()){
                Toast.makeText(this,"empty", Toast.LENGTH_LONG).show()
            }
            else {


                val i= Intent(this,ConversionActivity::class.java)
                i.putExtra("montant",binding.myed.text.toString().toFloat())
                i.putExtra("sens","DT en Euro")
                startActivity(i)

                /*val nb= binding.myed.text.toString().toFloat()
                binding.mytv.text="${nb/3.2}"*/
            }

        }

        binding.btnEuro.setOnClickListener {

            binding.btnDinar.setBackgroundColor(Color.LTGRAY)
            binding.btnEuro.setBackgroundColor(Color.DKGRAY)
            if (binding.myed.text.isEmpty()){
                Toast.makeText(this,"empty", Toast.LENGTH_LONG).show()
            }
            else {


                val i= Intent(this,ConversionActivity::class.java)
                i.putExtra("montant",binding.myed.text.toString().toFloat())
                i.putExtra("sens","Euro en DT")
                startActivity(i)
                /*val nb= binding.myed.text.toString().toFloat()
                binding.mytv.text="${nb*3.2}"*/

            }


        }

    }
}