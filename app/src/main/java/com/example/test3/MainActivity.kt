package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun signin(view: View) {

     val logintext : TextView = findViewById(R.id.logintext)
     val passtext:  TextView = findViewById(R.id.passtext)
     val login = logintext.text.toString()
     val password = passtext.text.toString()
     val intent: Intent = Intent(this@MainActivity, MainActivity2::class.java)
        if (login.toString().equals("admin")&&(password.toString().equals("admin"))) {
        intent.putExtra("login",login)
            intent.putExtra("password",password)
            startActivity(intent)

        }



    }
}