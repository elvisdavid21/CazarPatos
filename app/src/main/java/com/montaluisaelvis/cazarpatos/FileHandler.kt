package com.montaluisaelvis.cazarpatos

interface FileHandler {
    abstract val EncryptedSharedPreferences: Any
    abstract val MasterKeys: Any
    abstract val SHAREDINFO_FILENAME: String

    fun SaveInformation(datosAGrabar:Pair<String,String>)
    fun ReadInformation():Pair<String,String>
}
