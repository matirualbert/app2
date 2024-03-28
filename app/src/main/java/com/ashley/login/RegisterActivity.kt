package com.ashley.login

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashley.login.ui.theme.LoginTheme
import java.util.jar.Attributes.Name

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Name()
                }
            }
        }
    }
}
@Composable
fun Name() {
    var name by remember { mutableStateOf("") }

    var email by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }

    var confirm by remember { mutableStateOf("") }

    val context= LocalContext.current
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .background(Color.Red)) {
        Text(text = "Sign Up",
            color= Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
        )
        Image(painter = painterResource(id =  R.drawable.img),
            contentDescription ="makeup" )
        OutlinedTextField(
            value =name ,
            onValueChange = {name=it},
            leadingIcon = { Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "name")},
            label = { Text(text = "Enter name")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),

            )

        OutlinedTextField(
            value =email,
            onValueChange ={email=it},
            leadingIcon = { Icon(imageVector =Icons.Default.Email ,
                contentDescription ="email" )},
            label = { Text(text = "Enter email")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 9.dp),
            keyboardActions = KeyboardActions(),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )
        OutlinedTextField(
            value =password,
            onValueChange ={password=it},
            leadingIcon = { Icon(
                imageVector =Icons.Default.Lock ,
                contentDescription = "password")},
            label = { Text(text = "Enter password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 9.dp),
            keyboardActions = KeyboardActions(),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )
        OutlinedTextField(
            value =confirm,
            onValueChange ={confirm=it},
            leadingIcon = {Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "confirm"
            )},
            label = { Text(text = "Confirm password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 9.dp),
            keyboardActions = KeyboardActions(),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Login",
                fontSize = 22.sp)
        Button(onClick ={
            val intent=Intent(context,MainActivity::class.java)
            context.startActivity(intent)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Click to login")


        }
        }

    }

}

@Preview
@Composable
private fun Nameprev() {
    Name()

}