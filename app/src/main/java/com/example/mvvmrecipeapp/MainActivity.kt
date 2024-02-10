package com.example.mvvmrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmrecipeapp.ui.theme.MVVMRecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMRecipeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HappyMealPage()
                }
            }
        }
    }
}

@Composable
fun HappyMealPage(){
    Column(
        //verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFCAD8E6))

        ){
        Image(
            painter = painterResource(id = R.drawable.happy_meal),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(350.dp)
                .padding(top = 16.dp)
                .clip(RoundedCornerShape(20.dp))

        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
            ){
        Text(text ="Happy Meal",
            color = Color.Black, // Set your desired text color
            fontSize = 20.sp, // Set your desired font size
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.CenterVertically)
        )

            Text(text ="$3.99",
            color = Color.Red, // Set your desired text color
            //fontSize = 15.sp, // Set your desired font size
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.CenterVertically)
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.CenterHorizontally),
            //colors = ButtonColors(containerColor = Color.Black,
            //    contentColor =Color.White,
            //    disabledContainerColor = Color.Green,
            //    disabledContentColor= Color.Gray)
        ) {
            Text(text = "Order Now")
        }
}
}
@Preview(showBackground = true)
@Composable
fun HappyMealPagePreview() {
    HappyMealPage()
}
@Composable
fun MyComposable() {
    Text(
        text = "Happy Meal",
        modifier = Modifier.padding(20.dp),
        color = Color.Black, // Set your desired text color
        fontSize = 20.sp, // Set your desired font size
        fontWeight = FontWeight.Bold // Set your desired font weight
    )
}