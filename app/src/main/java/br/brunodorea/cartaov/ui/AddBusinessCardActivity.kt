package br.brunodorea.cartaov.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.brunodorea.cartaov.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    private fun insertListeners() {
        binding.btnConfirm.setOnClickListener{

        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}