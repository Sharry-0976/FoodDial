package com.example.fooddial.presentation.common

import java.lang.StringBuilder
import java.util.concurrent.TimeUnit

fun Double.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return kotlin.math.round(this * multiplier) / multiplier
}

fun Long.getTimeInMins(): String {
    var millis = this
    require(millis >= 0) { "Less than a minute" }
    val days: Long = TimeUnit.MILLISECONDS.toDays(millis)
    millis -= TimeUnit.DAYS.toMillis(days)
    val hours: Long = TimeUnit.MILLISECONDS.toHours(millis)
    millis -= TimeUnit.HOURS.toMillis(hours)
    val minutes: Long = TimeUnit.MILLISECONDS.toMinutes(millis)
    millis -= TimeUnit.MINUTES.toMillis(minutes)
    val sb = StringBuilder(64)
    if (hours > 0) {
        sb.append(hours)
        sb.append(" Hr ")
    }
    sb.append(minutes)
    sb.append(" Min ")
    return sb.toString()
}
