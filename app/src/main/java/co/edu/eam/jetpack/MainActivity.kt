package co.edu.eam.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.eam.jetpack.ui.theme.JetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalData(name = "Mariana", name1= "Sebastian")
        }
    }
    @Composable
    private fun PersonalData(name: String, name1:String){
        MaterialTheme(){
            Column(modifier = Modifier.padding(20.dp, 30.dp)) {
                Image(painter = painterResource(R.drawable.img),
                    contentDescription = "Desde jetpack",
                    modifier = Modifier.height(100.dp))
                Text(text = "$name y $name1", style = MaterialTheme.typography.titleLarge)
                Text(text = "Ingeniería de Software")
                Text(text = "Construcción de Apps moviles")
                Text(text = "VII")
            }
        }

    }

    @Preview
    @Composable
    fun PreviewPersonalData(){
        PersonalData(name = "Mariana Portela", name1= "Sebastian Arce")
    }
}

