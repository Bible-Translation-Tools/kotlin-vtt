package org.bibletranslationtools.vtt

import java.io.File

fun main() {
    val file = File("/Users/joe/Desktop/test.vtt")
    val bytes = file.readBytes()


    val cues = VTTParser().parse(file)
    println(cues.size)
}
