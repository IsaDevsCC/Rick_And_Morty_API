package com.example.compose1.data.mappers

import com.example.compose1.data.remote.dto.DataModelDTO
import com.example.compose1.domain.model.DataModel


fun DataModelDTO.toDataModel() = DataModel (
    id = id ?: 0,
    name = name ?: "",
    status = status ?: "",
    specie = species ?: "",
    photo = image ?: "",
    gender = gender ?: "",
)


