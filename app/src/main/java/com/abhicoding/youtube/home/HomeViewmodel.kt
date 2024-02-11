package com.abhicoding.youtube.home

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewmodel @Inject constructor(
    private  val homeApiService: HomeApiService
): ViewModel() {

    private  val _pageSize = mutableIntStateOf(10)
    val pageSize: Int get() = _pageSize.intValue

    private  val videoItem = mutableStateOf<VideoItem?>(null)
    val videoItemData: VideoItem? get() = videoItem.value

    private val _error = mutableStateOf<String?>(null)
    val error: String? get() = _error.value

    private val _isLoading = mutableStateOf(false)
    private val isLoading: Boolean get() = _isLoading.value

    private val _isRefreshing = mutableStateOf(false)
    private val isRefreshing: Boolean get() = _isRefreshing.value

    private  var nextPageToken: String? = null
    private  var prevPageToken: String? = null

    init {
        fetchVideos()
    }

    private fun fetchVideos(pageToken: String? = null) {
        if (isLoading) return // prevent multiple calls
        _isLoading.value = true

        viewModelScope.launch {
            try{
//                val response = homeApiService.getVideos(
//                    pageSize = pageSize,
//                    pageToken = pageToken?: nextPageToken,
//                    maxResults = _pageSize.intValue
//                )

           //     nextPageToken = response.nextPageToken

            }catch (e: Exception){
                _error.value = e.localizedMessage
            }finally {
                _isLoading.value = false
            }
        }

    }

}