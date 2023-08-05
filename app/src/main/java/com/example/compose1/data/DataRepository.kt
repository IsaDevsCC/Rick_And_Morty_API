package com.example.compose1.data

import com.example.compose1.domain.model.DataModel

interface DataRepository {

    suspend fun getAllData() : List <DataModel>
    suspend fun insertData(list : List <DataModel>)
    suspend fun editData(id : String) : DataModel
    suspend fun deleteData(id : String)
    suspend fun searchData(id : String) : DataModel
}