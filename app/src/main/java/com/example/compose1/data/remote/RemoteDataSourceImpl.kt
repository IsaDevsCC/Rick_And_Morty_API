package com.example.compose1.data.remote

import com.example.compose1.data.remote.dto.DataModelDTO

class RemoteDataSourceImpl(
    private val api : ClienAPI
) : RemoteDataSource {
    override suspend fun getAllData(): List<DataModelDTO> = api.getAllData()

}