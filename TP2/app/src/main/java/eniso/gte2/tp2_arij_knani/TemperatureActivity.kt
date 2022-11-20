package eniso.gte2.tp2_arij_knani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.gte2.tp2_arij_knani.databinding.ActivityTemperatureBinding



class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_temperature)
        val binding = ActivityTemperatureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myrg.setOnCheckedChangeListener { group, checkedId ->
            if (binding.myedt.text.isEmpty()){
                Toast.makeText(this,"Empty",Toast.LENGTH_LONG).show()
            }
            else {
                val t=binding.myedt.text.toString().toFloat()
                var res=0.0F
                when(checkedId){
                    binding.sens1.id -> res= ((9*t)/5)+32
                    binding.sens2.id -> res=  (5*(t-32))/9
                }
                if (binding.arrondir.isChecked())
                    res= kotlin.math.ceil(res)
                binding.restv.text="${res}"


            }

        }




    }
}