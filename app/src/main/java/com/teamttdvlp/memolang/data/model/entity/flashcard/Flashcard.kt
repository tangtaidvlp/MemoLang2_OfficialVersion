package com.teamttdvlp.memolang.data.model.entity.flashcard

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.teamttdvlp.memolang.view.helper.quickLog
import java.io.Serializable

@Entity(tableName = "flashcard")
data class Flashcard (

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0,

    @NonNull
    var setOwner : String,

    @NonNull
    var text : String,

    @NonNull
    var translation : String,

    @NonNull
    var frontLanguage : String,

    @NonNull
    var backLanguage : String,

    var example : String = "",

    var meanOfExample : String = "",

    var type : String = "",

    var pronunciation : String = "//") : Serializable {

    init {
        text = text.trim()
        setOwner = setOwner.trim()
        if (setOwner == "") quickLog("Set Owner can not be null. Please check and fix code properly")
        text = text.trim()
        translation = translation.trim()
        example = example.trim()
        meanOfExample = meanOfExample.trim()
        type = type.trim()
    }

}