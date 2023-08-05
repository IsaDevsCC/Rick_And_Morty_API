package com.example.compose1.data.remote

import com.example.compose1.data.remote.dto.DataModelDTO

interface RemoteDataSource {

    suspend fun getAllData() : List<DataModelDTO>
}