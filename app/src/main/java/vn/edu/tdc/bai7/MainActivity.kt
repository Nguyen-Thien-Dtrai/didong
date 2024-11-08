package vn.edu.tdc.bai7

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var edtNhapKyTu: EditText
    private lateinit var btnDemSoKyTu: Button
    private lateinit var tvKetQua:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        SetControl()
        SetEnvent()

    }
    private fun SetControl(){
        edtNhapKyTu = findViewById(R.id.edtNhapKyTu)
        btnDemSoKyTu = findViewById(R.id.btnDemSoKyTu)
        tvKetQua = findViewById(R.id.tvKetQua)
    }
    private fun DemSoKyTu(){
        val input = edtNhapKyTu.text.toString()
        if(input == null){
            tvKetQua.text = "Vui lòng nhập ký tự"
            return
        }
        val words = input.trim().split("\\s+".toRegex())
        val result = words.count{it.isNotEmpty()}
        tvKetQua.text = "Kết quả đếm được là: $result"
    }
    private fun SetEnvent(){
        btnDemSoKyTu.setOnClickListener{
            DemSoKyTu()
        }
    }
}