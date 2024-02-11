package com.abhicoding.youtube.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.abhicoding.youtube.home.videoList

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    // TODO: Implement Home Screen

    val videoItem = remember {
        videoList
    }
    val coroutineScope = rememberCoroutineScope()


}