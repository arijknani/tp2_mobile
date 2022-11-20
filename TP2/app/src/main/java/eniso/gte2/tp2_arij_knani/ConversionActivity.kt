package eniso.gte2.tp2_arij_knani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.gte2.tp2_arij_knani.databinding.ActivityConversionBinding


class ConversionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_convertion)
        val binding = ActivityConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val montant= intent.getFloatExtra("montant",0.0F)
        val sens=intent.getStringExtra("sens")

        binding.mym.text ="$montant"
        binding.mys.text=sens

        binding.btnconv.setOnClickListener {
            if (sens =="DT en Euro"){
                Toast.makeText(
                    this,
                    "l'equivalent de $montant DT en Euro est : ${montant/3.2}",
                    Toast.LENGTH_LONG).show()
            }
            else if (sens == "Euro en DT"){
                Toast.makeText(
                    this,
                    "l'equivalent de $montant Euro en DT est : ${montant*3.2}",
                    Toast.LENGTH_LONG).show()

            }
        }



    }
}