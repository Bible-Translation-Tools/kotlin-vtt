package org.bibletranslationtools.vtt

import java.io.File

fun main() {
    val file = File("/Users/joe/Desktop/test.vtt")
    val bytes = file.readBytes()
    

    val cues = CuesList()
    val parser = VTTParser().parse(bytes, 0, bytes.size, OutputOptions.allCues(), cues)
    println("what")

}

class CuesList: Consumer<CuesWithTiming> {
    val items = arrayListOf<CuesWithTiming>()
    override fun accept(t: CuesWithTiming) {
        items.add(t)
    }

    fun toList(): List<CuesWithTiming> {
        return items
    }
}