package org.bibletranslationtools.vtt

fun isLinebreak(c: Int): Boolean {
    return c == '\n'.code || c == '\r'.code
}

fun fromUtf8Bytes(bytes: ByteArray): String {
    return String(bytes, Charsets.UTF_8)
}

fun fromUtf8Bytes(bytes: ByteArray, offset: Int, length: Int): String {
    return String(bytes, offset, length, Charsets.UTF_8)
}

fun splitAtFirst(value: String, regex: String): Array<String> {
    return value.split(regex.toRegex(), limit = 2).toTypedArray()
}

fun split(value: String, regex: String): Array<String> {
    return value.split(regex.toRegex()).toTypedArray()
}