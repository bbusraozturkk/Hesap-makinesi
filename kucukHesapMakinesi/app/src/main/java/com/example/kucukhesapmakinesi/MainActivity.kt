package com.example.kucukhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView

lateinit var editTextNumber2 :EditText
lateinit var editTextNumber :EditText
lateinit var textView :TextView



class MainActivity : AppCompatActivity() {



    var sayi1 : Int?=null
    var sayi2 : Int?=null
    var sonuc : Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumber = findViewById(R.id.editTextNumber)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        textView = findViewById(R.id.textView)

    }
    fun topla (view:View){
        sayi1 = editTextNumber.text.toString().toIntOrNull()//editTextNumber adlı bir EditText bileşeninden metin alır.
        // Bu metni sayıya çevirmeye çalışır (toIntOrNull() kullanılarak). Eğer metin bir sayıya çevrilemiyorsa, toIntOrNull()
        // null dönecektir.
        sayi2 = editTextNumber2.text.toString().toIntOrNull()

        if(sayi1==null){
            textView.text= "Birinci sayı alanı boş"
        } else if(sayi2==null){
            textView.text= "ikinci sayı alanı boş"
        }else{
            sonuc = sayi1!!+sayi2!!// !! değerin null olmadığını belirtmek için kullanılır
            textView.text="Sonuç: $sonuc"
        }

    }
    fun cikar (view:View){
        sayi1 = editTextNumber.text.toString().toIntOrNull()
        sayi2 = editTextNumber2.text.toString().toIntOrNull()

        if(sayi1==null){
            textView.text= "Birinci sayı alanı boş"
        } else if(sayi2==null){
            textView.text= "ikinci sayı alanı boş"
        }else{
            sonuc = sayi1!!-sayi2!!
            textView.text="Sonuç: $sonuc"
        }

    }
    fun carp (view:View){
        sayi1 = editTextNumber.text.toString().toIntOrNull()
        sayi2 = editTextNumber2.text.toString().toIntOrNull()

        if(sayi1==null){
            textView.text= "Birinci sayı alanı boş"
        } else if(sayi2==null){
            textView.text= "ikinci sayı alanı boş"
        }else{
            sonuc = sayi1!!*sayi2!!
            textView.text="Sonuç: $sonuc"
        }

    }
    fun bol (view:View){
        sayi1 = editTextNumber.text.toString().toIntOrNull()
        sayi2 = editTextNumber2.text.toString().toIntOrNull()

        if(sayi1==null){
            textView.text= "Birinci sayı alanı boş"
        } else if(sayi2==null){
            textView.text= "ikinci sayı alanı boş"
        }else{
            sonuc = sayi1!!/sayi2!!
            textView.text="Sonuç: $sonuc"
        }
    }
}