package com.appdevmhr.dpi_ft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appdevmhr.dpi_ft.ui.theme.DPIFTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DPIFTTheme {

                Screen(
                    title = "Department Of Food",
                    data = "Dhaka Polytechnic Institute offers a diploma program in Food Technology, which focuses on providing students with the necessary knowledge and skills required for food processing and preservation. The program aims to equip students with the latest technology and practices used in the food industry.\n" +
                            "\n" +
                            "The Food Technology program at Dhaka Polytechnic Institute covers various topics such as food chemistry, food microbiology, food preservation, food processing, food packaging, food quality control, and food safety. Students also learn about the various equipment and machinery used in the food industry and their maintenance.\n" +
                            "\n" +
                            "The program curriculum includes both theoretical and practical training, which enables students to develop their knowledge and skills in food technology. Students are also required to complete an internship in a food industry setting to gain real-world experience.\n" +
                            "\n" +
                            "Upon graduation, students can pursue careers in various fields such as food processing, food packaging, quality control, research and development, and food safety. The Food Technology program at Dhaka Polytechnic Institute prepares students for a successful career in the food industry.\n" +
                            "\n" +
                            " \n" +
                            "\n"
                )
            }
        }
    }
}


@Composable
fun Screen(
    title: String,
    data: String
) {
    val scr = rememberScrollState()
    Surface(
        modifier = Modifier
            .verticalScroll(scr)
            .fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {

        Column {
            Text(
                style = TextStyle(
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                ),
                text = title,
            )
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.at),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            GreetingDPICST(data = data)
        }

    }
}

@Composable
fun GreetingDPICST(data: String, modifier: Modifier = Modifier) {
    Text(
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold
        ),
        textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
        text = data,
        modifier = modifier
    )
}