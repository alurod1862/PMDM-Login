package com.example.pmdm_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pmdm_login.logic.LoginViewModel
import com.example.pmdm_login.ui.theme.PMDMLoginTheme
import com.example.pmdm_login.logic.login

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val loginViewModel = LoginViewModel()
            PMDMLoginTheme {
                    login(loginViewModel)
            }

        }
    }
}

