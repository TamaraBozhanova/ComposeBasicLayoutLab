package com.tamarabozhanova.composebasiclayoutlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tamarabozhanova.composebasiclayoutlab.ui.theme.ComposeBasicLayoutLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicLayoutLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    TextField(
        value = "Search",
        onValueChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )},
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.background
        ),
        placeholder = {
            Text(text = stringResource(id = R.string.placeholder_search))
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(56.dp)
    )
}

@Composable
fun AlignYourBodyElement(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.ab1_inversions),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.ab1_inversions)
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun SearchBarPreview() {
    ComposeBasicLayoutLabTheme() {
        SearchBar(Modifier.padding(8.dp))
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicLayoutLabTheme {
        Greeting("Android")
    }
}