package com.teamttdvlp.memolang.data.model.entity.flashcard

import androidx.annotation.IntDef
import androidx.room.Entity
import java.io.Serializable
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

const val FLASHCARD_WIDE_HEIGHT_RATE: Float = 32f / 23f
const val HEIGHT_NORMAL = 0
const val HEIGHT_WIDE = 1

@Entity
class CardProperty : Serializable {

    @IntDef(value = [HEIGHT_NORMAL, HEIGHT_WIDE])
    @Retention(RetentionPolicy.SOURCE)
    annotation class HeightOption

    @HeightOption
    var heightOption = HEIGHT_NORMAL

    var frontSideHasImage = true

    var backSideHasImage = true

    var frontSideHasText = true

    var backSideHasText = true

    override fun toString(): String {
        return """Front 
            | - Text: $frontSideHasText
            | - Image: $frontSideHasImage
            | Back:
            | - Text: $backSideHasText
            | - Image: $backSideHasImage
        """.trimMargin()
    }
}