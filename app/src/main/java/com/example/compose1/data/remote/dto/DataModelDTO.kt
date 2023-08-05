package com.example.compose1.data.remote.dto

import com.squareup.moshi.Json

data class ApiStructure (
    @Json(name = "info")
    val info: Info,
    @Json(name = "results")
    val results: List<DataModelDTO>
)

data class Info(
    @Json(name = "count") val count : Int,
    @Json(name = "pages") val id : Int,
    @Json(name = "next") val name : String,
    @Json(name = "prev") val status : String?,
)

data class DataModelDTO (
    @Json(name = "id") val id : Int,
    @Json(name = "name") val name : String?,
    @Json(name = "status") val status : String?,
    @Json(name = "species") val species : String?,
    @Json(name = "gender") val gender : String?,
    @Json(name = "origin") val origin : List<Origins>?,
    @Json(name = "location") val location : List<Locations>?,
    @Json(name = "image") val image : String?,
    //@Json(name = "id") val id : Int,
)

data class Origins (
    @Json(name = "name") val name : String?,
    @Json(name = "url") val url : String?
)

data class Locations (
    @Json(name = "name") val name : String?,
    @Json(name = "url") val url : String?
)
