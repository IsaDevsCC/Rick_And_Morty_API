package com.example.compose1.data.remote

import com.example.compose1.data.remote.dto.DataModelDTO
import retrofit2.http.GET

interface ClienAPI {

    @GET("")
    suspend fun getAllData() : List<DataModelDTO>


}