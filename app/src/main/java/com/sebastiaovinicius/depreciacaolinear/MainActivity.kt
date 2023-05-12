package com.sebastiaovinicius.depreciacaolinear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sebastiaovinicius.depreciacaolinear.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       if(v.id==R.id.button_calculate){

           var valorNovo=binding.editTextValorNovo.text.toString().toDouble()
           var valorResidual=binding.editTextValorResidual.text.toString().toDouble()
           var vidaUtil=binding.editTextVidaUtil.text.toString().toDouble()
           var depreciacaoAnualLinear = (valorNovo - valorResidual)/vidaUtil

           binding.textViewDepreciacaoAnual.text=depreciacaoAnualLinear.toString()
       }
    }
}