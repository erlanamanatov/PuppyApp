package com.example.androiddevchallenge.ui.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.PuppyList
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import kotlin.random.Random

const val rotationRange = 10

@ExperimentalFoundationApi
@Composable
fun Puppies(
    puppies: List<Puppy>,
    onPuppyClick: (Int) -> Unit
) {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    "Puppies",
                    color = MaterialTheme.colors.onSurface,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 34.sp
                )
            },
            backgroundColor = MaterialTheme.colors.background,
            elevation = 0.dp
        )
    },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp)
            ) {
                LazyVerticalGrid(GridCells.Fixed(2)) {
                    items(puppies) { puppy ->
                        PuppyItem(puppy = puppy,
                            onClick = {
                                onPuppyClick(it)
                            })
                    }
                }
            }
        }
    )
}


@Composable
fun PuppyItem(
    modifier: Modifier = Modifier,
    puppy: Puppy,
    onClick: (Int) -> Unit
) {
    val rotationAngle = remember { rotationRange * (Random.nextFloat() - 0.5f) }
    Box(
        modifier = modifier
            .padding(4.dp)
            .rotate(rotationAngle)
    ) {
        Card(
            shape = RoundedCornerShape(6.dp),
            elevation = 6.dp,
            modifier = Modifier
                .padding(6.dp)
                .clickable { onClick(puppy.id) },
        ) {
            Column(modifier = Modifier.padding(4.dp)) {
                Image(
                    painter = painterResource(id = puppy.image),
                    contentDescription = "Puppy image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(4.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Text(
                    text = puppy.name,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.primaryVariant
                )
                Text(
                    text = puppy.breed,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.caption
                )
            }
        }
    }
}

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        Surface(color = MaterialTheme.colors.background) {
            Puppies(puppies = PuppyList.data, onPuppyClick = {})
        }
    }
}
