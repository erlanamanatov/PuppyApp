package com.example.androiddevchallenge.ui.screens

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.NavigateBefore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PuppyList
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@ExperimentalAnimationApi
@SuppressLint("RestrictedApi")
@Composable
fun PuppyDetailed(
    puppyId: Int,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val puppy = remember { PuppyList.getById(puppyId) }
    Box(modifier = modifier.fillMaxSize()) {
        PuppyDetailContent(puppy = puppy)
        Box(
            modifier = Modifier
                .padding(8.dp)
                .clip(CircleShape)
                .background(
                    MaterialTheme.colors.surface.copy(alpha = 0.6f)
                )
        ) {
            IconButton(
                onClick = {
                    onBackClick()
                }
            ) {
                Icon(
                    tint = MaterialTheme.colors.onSurface,
                    imageVector = Icons.Filled.NavigateBefore,
                    contentDescription = "Navigate before"
                )
            }
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun PuppyDetailContent(
    modifier: Modifier = Modifier,
    puppy: Puppy
) {
    Column(
        modifier = modifier
            .padding(bottom = 8.dp)
            .verticalScroll(rememberScrollState()),
    ) {
        Image(
            painter = painterResource(id = puppy.image),
            contentDescription = "PuppyImage",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Column(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 4.dp
                )
        ) {
            Text(
                puppy.name,
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Bold,
            )
            AboutSection(puppy = puppy)
            puppy.description?.let { description ->
                Text(
                    description,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
        }
    }

}

@ExperimentalAnimationApi
@Composable
fun AboutSection(
    modifier: Modifier = Modifier,
    puppy: Puppy
) {
    var expanded by remember { mutableStateOf(false) }
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    expanded = !expanded
                },
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                puppy.location?.let {
                    Text(text = it, style = MaterialTheme.typography.body2)
                }
                Text(
                    buildAnnotatedString {
                        append(puppy.breed)
                        append(" • ${puppy.sex}")
                    },
                    style = MaterialTheme.typography.body2
                )
            }
            if (expanded) {
                Icon(
                    Icons.Default.ExpandLess, contentDescription = "Collapse",
                    tint = MaterialTheme.colors.onSurface
                )
            } else {
                Icon(
                    Icons.Default.ExpandMore, contentDescription = "Expand",
                    tint = MaterialTheme.colors.onSurface
                )
            }
        }
        AnimatedVisibility(visible = expanded) {
            DetailedCharacteristics(puppy = puppy)
        }
    }
}

@Composable
fun DetailedCharacteristics(
    puppy: Puppy,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        with(puppy) {
            color?.let {
                DetailsTextBody2("color", it)
            }
            age?.let {
                DetailsTextBody2("age", it)
            }
            size?.let {
                DetailsTextBody2("size", it)
            }
            characteristics?.let {
                DetailsTextBody2("characteristics", it)
            }
            health?.let {
                DetailsTextBody2("health", it)
            }
        }
    }
}

@Composable
private fun DetailsTextBody2(label: String, text: String) {
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light
            )
        ) {
            append("$label : ")
        }
        append(text)
    }, style = MaterialTheme.typography.body2)
}


@ExperimentalAnimationApi
@Preview("Puppy Detailed Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun PuppyExamplePreview() {
    MyTheme() {
        Box(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
        ) {
            PuppyDetailed(puppyId = 2, {})
        }
    }
}

@ExperimentalAnimationApi
@Preview("Puppy Detailed Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun PuppyExamplePreviewDark() {
    MyTheme(darkTheme = true) {
        Box(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
        ) {
            PuppyDetailed(puppyId = 3, {})
        }
    }
}
