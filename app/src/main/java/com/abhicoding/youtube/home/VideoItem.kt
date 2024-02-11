package com.abhicoding.youtube.home

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VideoItem(
    val id: String = "DefaultId",
    val title: String,
    val channel: String,
    val description: String,
    val thumbnailUrl: String,
    val videoUrl: String,
    val publishedDate: String
) : Parcelable

val videoList = listOf(
    VideoItem(
        id = "Id1",
        title = "Title1",
        channel = "Channel1",
        description = "Description1",
        thumbnailUrl = "t1",
        videoUrl = "v1",
        publishedDate = "08/02/2024"
    ),
    VideoItem(
        id = "Id2",
        title = "Title2",
        channel = "Channel2",
        description = "Description2",
        thumbnailUrl = "t2",
        videoUrl = "v2",
        publishedDate = "08/02/2024"
    ),
    VideoItem(
        id = "Id3",
        title = "Title3",
        channel = "Channel3",
        description = "Description3",
        thumbnailUrl = "t3",
        videoUrl = "v3",
        publishedDate = "08/02/2024"
    )
)
