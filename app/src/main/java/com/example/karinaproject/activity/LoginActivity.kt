package com.example.karinaproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.karinaproject.R
import kotlinx.android.synthetic.main.activity_tela_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        btn_enter.setOnClickListener {
            val loginDig = et_login.text.toString()
            val senhaDig = et_senha.text.toString()
            val intent = Intent(this, ListaEmpresaActivity::class.java)
            if(loginDig == "adimin" && senhaDig == "123")
                startActivity(intent)
                }

        }
    }
