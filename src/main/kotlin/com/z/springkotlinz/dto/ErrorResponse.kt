package com.z.springkotlinz.dto

import java.time.LocalDateTime

data class ErrorResponse(val title: String = "Bad Request", val message:String, val dataTime: LocalDateTime = LocalDateTime.now())