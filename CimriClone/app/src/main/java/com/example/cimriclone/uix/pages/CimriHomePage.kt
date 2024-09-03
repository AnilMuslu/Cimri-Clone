package com.example.cimriclone.uix.pages

import android.app.Activity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cimriclone.R
import com.example.cimriclone.data.entity.Categories
import com.example.cimriclone.ui.theme.Black
import com.example.cimriclone.ui.theme.CimriBlue
import com.example.cimriclone.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CimriHomePage(){
    val searchTf = remember { mutableStateOf("") }
    val selectedItem = remember { mutableStateOf(0) }
    val categoryList = remember { mutableStateListOf<Categories>() }
    
    LaunchedEffect(key1 = true) {
        val c1 = Categories(1,"Elektronik Eşya","mobile_phone")
        val c2 = Categories(2,"Ev, Yaşam, Ofis","home_life")
        val c3 = Categories(3,"Anne, Bebek, Oyuncak","baby")
        val c4 = Categories(4,"Saat, Moda, Takı","fashion")
        val c5 = Categories(5,"Kitap, Müzik, Hobi","book")
        val c6 = Categories(6,"Spor, Outdoor","sport")
        val c7 = Categories(7,"Sağlık, Bakım, Kozmetik","health_care")
        val c8 = Categories(8,"Oto, Bahçe, Yapı Market","garden_tools")
        val c9 = Categories(9,"Petshop","petshop")
        categoryList.add(c1)
        categoryList.add(c2)
        categoryList.add(c3)
        categoryList.add(c4)
        categoryList.add(c5)
        categoryList.add(c6)
        categoryList.add(c7)
        categoryList.add(c8)
        categoryList.add(c9)
    }
    
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = White,
                content = {
                    NavigationBarItem(
                        selected = selectedItem.value == 0,
                        onClick = { selectedItem.value = 0 },
                        icon = { Icon(painter = painterResource(id = R.drawable.home_icon), contentDescription = "")},
                        label = { Text(text = "Anasayfa")})
                    NavigationBarItem(
                        selected = selectedItem.value == 1,
                        onClick = { selectedItem.value = 1 },
                        icon = { Icon(painter = painterResource(id = R.drawable.categories_icon), contentDescription = "")},
                        label = { Text(text = "Kategoriler")})
                    NavigationBarItem(
                        selected = selectedItem.value == 2,
                        onClick = { selectedItem.value = 2 },
                        icon = { Icon(painter = painterResource(id = R.drawable.account_icon), contentDescription = "")},
                        label = { Text(text = "Hesabım")})
                }
            )
        }
    ){ paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(White),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .size(124.dp, 36.dp),
                    colors = CardDefaults.cardColors(CimriBlue),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Image(painter = painterResource(id = R.drawable.cimri_button),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth())
                }
                Card(
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .size(124.dp, 36.dp),
                    colors = CardDefaults.cardColors(White),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Image(painter = painterResource(id = R.drawable.cimri_markette_button),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth())
                }
                Card(
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .size(124.dp, 36.dp),
                    colors = CardDefaults.cardColors(White),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Image(painter = painterResource(id = R.drawable.cimri_finans_button),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth())
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = searchTf.value,
                    onValueChange = {searchTf.value = it},
                    placeholder = { Text(text = "Ürün, marka veya kategori ara")},
                    leadingIcon = { Icon(painter = painterResource(id = R.drawable.search_icon), contentDescription = "")},
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = CimriBlue,
                        focusedBorderColor = CimriBlue,
                        containerColor = White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(White, shape = MaterialTheme.shapes.small)
                        .clip(MaterialTheme.shapes.small)
                        .padding(8.dp)
                )
            }

            Image(painter = painterResource(id = R.drawable.cimri_ads), contentDescription = "",
                modifier = Modifier
                    .size(500.dp, 200.dp)
                    .padding(start = 8.dp, end = 8.dp))
            
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Kategorileri Keşfet", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize(),
                columns = GridCells.Fixed(3)
            ) {
                items(
                    count = categoryList.count(),
                    itemContent = {
                        val category = categoryList[it]
                        Card(
                            modifier = Modifier
                                .padding(all = 8.dp)
                                .size(100.dp, 100.dp),
                            colors = CardDefaults.cardColors(White),
                            border = BorderStroke(1.dp, Color.Gray)
                        ) {
                            Column(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                val activity = (LocalContext.current as Activity)
                                Image(bitmap = ImageBitmap.imageResource(
                                    id = activity.resources.getIdentifier(
                                        category.image,
                                        "drawable",
                                        activity.packageName
                                    )
                                ),
                                    contentDescription = "",
                                    modifier = Modifier.fillMaxWidth())
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.Top,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(text = "${category.name}", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}