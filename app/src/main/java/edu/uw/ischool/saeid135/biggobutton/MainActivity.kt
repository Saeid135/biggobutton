package edu.uw.ischool.saeid135.biggobutton

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.uw.ischool.saeid135.biggobutton.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var btn : Button
    private var value : Int = 1
    private val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            if (value == 1) {
                btn.text = "You have pushed me $value time!"
                value = value + 1
            }
            else {
                btn.text = "You have pushed me $value times!"
                value = value + 1
            }
        }
    }
}

