package com.example.Business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.Business_card.ui.theme.Business_cardTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_cardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun BusinessCardWithIcon(){
    Column(Modifier.fillMaxWidth()) {
        BusinessCardMainWidgetInfo(fullName ="Kaio Santos" , title = "Programmer", modifier = Modifier.weight(1f))

        Column(Modifier.weight(.2f).fillMaxWidth()) {
            ContactFormWidget("(xx) xxxxx-xxxx")
            ContactFormWidget("@ProfessionalEmail.com")
            ContactFormWidget("@ProfessionalBackupEmail.com")

        }
    }
}

@Composable
fun BusinessCardMainWidgetInfo(fullName: String, title: String, modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Icon(
            Icons.Rounded.AccountBox,
            contentDescription = null,
            Modifier
                .size(100.dp)

        )
        Text(fullName, fontSize = 28.sp)
        Text(title, fontSize = 22.sp)
    }
}

@Composable
fun ContactFormWidget(value: String){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(
                bottom = 5.dp,
                start = 15.dp,
                end = 15.dp
            ), horizontalArrangement = Arrangement.SpaceEvenly
    ){
        Icon(
            Icons.Rounded.Phone,
            contentDescription = null,
            Modifier
                .size(25.dp)
                .weight(.3f)
        )
        Text(modifier = Modifier.weight(.8f), text = value, textAlign = TextAlign.End, fontSize = 18.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardWithIcon()
}