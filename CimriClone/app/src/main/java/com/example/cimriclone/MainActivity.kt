package com.example.cimriclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cimriclone.ui.theme.CimriCloneTheme
import com.example.cimriclone.uix.pages.CimriHomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CimriCloneTheme {
                CimriHomePage()
            }
        }
    }
}

////////////
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.*
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.material3.BottomAppBar
//import androidx.compose.material3.Button
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.RectangleShape
//import androidx.compose.ui.graphics.Shape
//import androidx.compose.ui.text.font.FontWeight
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MainScreen()
//        }
//    }
//}
//
//@Composable
//fun MainScreen() {
//    Scaffold(
//        bottomBar = { BottomAppBarExample() } // BottomAppBar burada uygulanıyor
//    ) { innerPadding ->
//        Column(
//            modifier = Modifier
//                .padding(innerPadding)
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            // Üstteki butonlar
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 8.dp),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Button(
//                    onClick = { /*TODO*/ },
//                    modifier = Modifier.weight(1f).padding(end = 4.dp)
//                ) {
//                    Text(text = "cimri")
//                }
//                Button(
//                    onClick = { /*TODO*/ },
//                    modifier = Modifier.weight(1f).padding(horizontal = 4.dp)
//                ) {
//                    Text(text = "cimri markette")
//                }
//                Button(
//                    onClick = { /*TODO*/ },
//                    modifier = Modifier.weight(1f).padding(start = 4.dp)
//                ) {
//                    Text(text = "cimri finans")
//                }
//            }
//
//            // Arama barı
//            val searchText = remember { mutableStateOf(TextFieldValue("")) }
//            TextField(
//                value = searchText.value,
//                onValueChange = { searchText.value = it },
//                placeholder = { Text(text = "Ürün, marka veya kategori ara") },
//                leadingIcon = {
//                    Icon(painter = painterResource(id = R.drawable.search_icon), contentDescription = null)
//                },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.White, shape = MaterialTheme.shapes.small)
//                    .clip(MaterialTheme.shapes.small)
//                    .padding(8.dp)
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // LazyVerticalGrid ile Kategoriler
//            LazyVerticalGrid(
//                columns = GridCells.Fixed(3),
//                modifier = Modifier.fillMaxSize(),
//                contentPadding = PaddingValues(8.dp)
//            ) {
//                items(9) { index ->
//                    CategoryCard(
//                        title = "Kategori $index",
//                        imageRes = R.drawable.baby
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun BottomAppBarExample() {
//    BottomAppBar(
//        containerColor = Color.White,
//        contentColor = Color.Black,
//        //cutoutShape = RectangleShape
//    ) {
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(painter = painterResource(id = R.drawable.home_icon), contentDescription = "Anasayfa")
//        }
//        Spacer(modifier = Modifier.weight(1f, true))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(painter = painterResource(id = R.drawable.categories_icon), contentDescription = "Kategoriler")
//        }
//        Spacer(modifier = Modifier.weight(1f, true))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(painter = painterResource(id = R.drawable.account_icon), contentDescription = "Hesabım")
//        }
//    }
//}
//
//@Composable
//fun CategoryCard(title: String, imageRes: Int) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .padding(8.dp)
//            .fillMaxWidth()
//    ) {
//        Image(
//            painter = painterResource(id = imageRes),
//            contentDescription = title,
//            modifier = Modifier.size(64.dp)
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        Text(text = title, fontSize = 14.sp, fontWeight = FontWeight.Bold)
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun MainScreenPreview() {
//    MainScreen()
//}