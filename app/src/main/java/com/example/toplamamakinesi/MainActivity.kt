package com.example.toplamamakinesi

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toplamamakinesi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var design: ActivityMainBinding
    private var number1 = 0
    private var number2 = 0
    private var entry = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = ActivityMainBinding.inflate(layoutInflater)

        design.textView.setText(entry.toString())

        design.button0.setOnClickListener {
            try {
                entry = (entry.toString() + "0").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button1.setOnClickListener {
            try {
                entry = (entry.toString() + "1").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button2.setOnClickListener {
            try {
                entry = (entry.toString() + "2").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button3.setOnClickListener {
            try {
                entry = (entry.toString() + "3").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button4.setOnClickListener {
            try {
                entry = (entry.toString() + "4").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button5.setOnClickListener {
            try {
                entry = (entry.toString() + "5").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button6.setOnClickListener {
            try {
                entry = (entry.toString() + "6").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button7.setOnClickListener {
            try {
                entry = (entry.toString() + "7").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button8.setOnClickListener {
            try {
                entry = (entry.toString() + "8").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.button9.setOnClickListener {
            try {
                entry = (entry.toString() + "9").toInt()
            } catch (e: NumberFormatException) {
                Snackbar.make(design.root, "Çok büyük oldu bu sayı! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                entry = 0
            }
            design.textView.setText(entry.toString())
        }

        design.buttonPlus.setOnClickListener {
            try {
                number1 = entry + number1
                entry = 0
                design.textView.setText(entry.toString())
            } catch(e: Exception) {
                Snackbar.make(design.root, "Toplayamadım! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                number1 = 0
                entry = 0
            }
        }

        design.buttonEqual.setOnClickListener {
            try {
                number1 = number1 + entry
                design.textView.setText(number1.toString())
                entry = 0
            } catch(e: Exception) {
                Snackbar.make(design.root, "Toplayamadım! O yüzden sıfırladım. :)", Snackbar.LENGTH_SHORT).show()
                number1 = 0
                entry = 0
            }
        }

        design.buttonAC.setOnClickListener {
            number1 = 0
            number2 = 0
            entry = 0
            design.textView.setText(entry.toString())
        }

        setContentView(design.root)
    }
}