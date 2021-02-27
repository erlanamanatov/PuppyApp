/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
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
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.PuppyList
import com.example.androiddevchallenge.ui.theme.MyTheme
import kotlin.random.Random

const val rotationRange = 10

@ExperimentalFoundationApi
@Composable
fun Puppies(
    puppies: List<Puppy>,
    onPuppyClick: (Int) -> Unit
) {
    Scaffold(
        topBar = {
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
                        PuppyItem(
                            puppy = puppy,
                            onClick = {
                                onPuppyClick(it)
                            }
                        )
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
