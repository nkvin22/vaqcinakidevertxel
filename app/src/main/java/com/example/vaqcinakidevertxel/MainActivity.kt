package com.example.vaqcinakidevertxel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    private lateinit var yes: CheckBox
    private lateinit var no: CheckBox
    private lateinit var name: EditText
    private lateinit var send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar:  ActionBar? = supportActionBar
        actionBar?.hide()

        yes = findViewById(R.id.yes)
        no = findViewById(R.id.no)
        name= findViewById(R.id.pasuxi)
        send= findViewById(R.id.gagzavna)



        send.setOnClickListener {


            if (yes.isChecked && no.isChecked) {

            Toast.makeText(this, "აირჩიეთ ერთ-ერთი პასუხი", Toast.LENGTH_LONG).show()

            }

            else if (yes.isChecked && name.text.toString().isEmpty()){

                name.error = "შეიყვანეთ ვაქცინის დასახელება"}


            else if(no.isChecked && name.text.toString().isNotEmpty()){

                Toast.makeText(this, "თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_LONG).show()

            }

            else if(name.text.toString().any {it.isDigit()}) {

                name.error = "შეიყვანეთ სწორი დასახელება"
            }

            else if(yes.isChecked && name.text.toString().isNotEmpty()){

                Toast.makeText(this, "მონაცემები გადაგზავნილია", Toast.LENGTH_SHORT).show()
            }




        }





    }
}