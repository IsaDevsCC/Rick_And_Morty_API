package com.example.compose1.data

import com.example.compose1.data.remote.RemoteDataSource
import com.example.compose1.domain.model.DataModel

class DataRepositoryImpl(
    private val remote : RemoteDataSource
) : DataRepository {
    override suspend fun getAllData(): List<DataModel> {
        TODO("Not yet implemented")
    }

    override suspend fun insertData(list: List<DataModel>) {
        TODO("Not yet implemented")
    }

    override suspend fun editData(id: String): DataModel {
        TODO("Not yet implemented")
    }

    override suspend fun deleteData(id: String) {
        TODO("Not yet implemented")
    }

    override suspend fun searchData(id: String): DataModel {
        TODO("Not yet implemented")
    }
}