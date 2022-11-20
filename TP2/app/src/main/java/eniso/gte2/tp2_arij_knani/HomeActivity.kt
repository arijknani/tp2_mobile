package eniso.gte2.tp2_arij_knani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import eniso.gte2.tp2_arij_knani.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_home)

        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.monnaie.setOnClickListener {
            val i=Intent(this,CurrencyActivity::class.java)
            startActivity(i)
        }

        binding.temperature.setOnClickListener {
            val i=Intent(this,TemperatureActivity::class.java)
            startActivity(i)
        }

    }
}