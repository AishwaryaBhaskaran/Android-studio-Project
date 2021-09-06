package com.example.myapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {
    lateinit var sp:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sp=getSharedPreferences("myfile1",MODE_PRIVATE)
        editTextTextPersonName2.setText(sp.getString("keyusername",""))
        editTextTextPassword.setText(sp.getString("keypass",""))
        button4.setOnClickListener() {
            /*if (saveLoginCheckBox.isChecked()) {
                var username = editTextTextPersonName2.text.toString()
                var editor = sp.edit()
                editor.putString("keyusername", username)
                editor.commit()
                //editTextTextPersonName2.setText("")
                var password = editTextTextPassword.text.toString()
                editor = sp.edit()
                editor.putString("keypass", password)
                editor.commit()
                //editTextTextPassword.setText("")
            }
            else
            {
                editTextTextPersonName2.setText(" ")
                editTextTextPassword.setText(" ")
            }*/
            var i= Intent(this,SecondActivity::class.java)
            startActivity(i)
        }


        button5.setOnClickListener(){

            var i= Intent(this,RegisterActivity::class.java)
            startActivity(i)

        }

    }
}