package com.projetos.todolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var appName: TextView
    lateinit var listName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appName = findViewById<TextView>(R.id.txt_title)
        listName = findViewById<TextView>(R.id.txt_subtitle)
        var swShowHide: Switch
        val sw1 = findViewById<CheckBox>(R.id.checkBox1)
        val sw2 = findViewById<CheckBox>(R.id.checkBox2)
        val sw3 = findViewById<CheckBox>(R.id.checkBox3)
        val sw4 = findViewById<CheckBox>(R.id.checkBox4)
        val sw5 = findViewById<CheckBox>(R.id.checkBox5)
        val sw6 = findViewById<CheckBox>(R.id.checkBox6)
        val sw7 = findViewById<CheckBox>(R.id.checkBox7)
        val sw8 = findViewById<CheckBox>(R.id.checkBox8)
        val switch = findViewById<Switch>(R.id.sw_showHide)

        swShowHide = findViewById<TextView>(R.id.sw_showHide) as Switch
        swShowHide.text = "Esconder concluídos"


        appName.text = "TO-DO List"
        listName.text = "Lista de compras"


        val tasks = mutableListOf<String>(
            "Pão",
            "Arroz",
            "Macarrão",
            "Biscoito",
            "Extrato de tomate",
            "Feijão",
            "Chocolate",
            "Carne"
        )

        sw1.text = tasks[0]
        sw2.text = tasks[1]
        sw3.text = tasks[2]
        sw4.text = tasks[3]
        sw5.text = tasks[4]
        sw6.text = tasks[5]
        sw7.text = tasks[6]
        sw8.text = tasks[7]

        sw1.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
               if (p1) {
                   Toast.makeText(applicationContext, "Você marcou ${sw1.text}", Toast.LENGTH_SHORT).show()
               } else {
                   Toast.makeText(applicationContext, "Você desmarcou ${sw1.text}", Toast.LENGTH_SHORT).show()
               }
            }
        })

        sw2.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    Toast.makeText(applicationContext, "Você marcou ${sw2.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Você desmarcou ${sw2.text}", Toast.LENGTH_SHORT).show()
                }
            }
        })

        sw3.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    Toast.makeText(applicationContext, "Você marcou ${sw3.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Você desmarcou ${sw3.text}", Toast.LENGTH_SHORT).show()
                }
            }
        })

        sw4.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    Toast.makeText(applicationContext, "Você marcou ${sw4.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Você desmarcou ${sw4.text}", Toast.LENGTH_SHORT).show()
                }
            }
        })

        sw5.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    Toast.makeText(applicationContext, "Você marcou ${sw5.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Você desmarcou ${sw5.text}", Toast.LENGTH_SHORT).show()
                }
            }
        })

        sw6.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    Toast.makeText(applicationContext, "Você marcou ${sw6.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Você desmarcou ${sw6.text}", Toast.LENGTH_SHORT).show()
                }
            }
        })

        sw7.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    Toast.makeText(applicationContext, "Você marcou ${sw7.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Você desmarcou ${sw7.text}", Toast.LENGTH_SHORT).show()
                }
            }
        })

        sw8.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1) {
                    Toast.makeText(applicationContext, "Você marcou ${sw8.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Você desmarcou ${sw8.text}", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }
}