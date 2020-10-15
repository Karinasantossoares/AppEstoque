package com.example.appestoque.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appestoque.R
import kotlinx.android.synthetic.main.activity_tela_login.*

class TelaLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        btn_enter.setOnClickListener {
            val loginDig = et_login.text.toString()
            val senhaDig = et_senha.text.toString()
            val intent = Intent(this, EscolherOpcaoActivity::class.java)
            if(loginDig == "admin" && senhaDig == "123")
                startActivity(intent)
                }

        }
    }
