package com.reynn.novels
import android.content.Context
import android.content.SharedPreferences

class SharedPref(context: Context) {
    private val read: SharedPreferences = context.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)
    private val write: SharedPreferences.Editor = read.edit()

    fun setData(key: String, value: Any?){
        when(value) {
            is Boolean -> write.putBoolean(key, value)
            is Float -> write.putFloat(key, value)
            is Int -> write.putInt(key, value)
            is Long -> write.putLong(key, value)
            is String -> write.putString(key, value)

        }

        write.commit()
    }

    fun getBoolean(key: String, default: Boolean = false) = read.getBoolean(key, default)
    fun getFloat(key: String, default: Float = 0f) = read.getFloat(key, default)
    fun getInt(key: String, default: Int = 0) = read.getInt(key, default)
    fun getLong(key: String, default: Long = 0L) = read.getLong(key, default)
    fun getString(key: String, default: String? = null) = read.getString(key, default)

    companion object {
        const val GRID_LAYOUT = "grid_layout"
        const val WRITTER = "writter"
        const val APP_NAME = "app_name"
        const val COLUMN = "column"
        const val THEME = "theme"
        const val ITEM =  "item"
        const val CONTENT = "content"
    }

    var gridLayout: Boolean
        set(value) = setData(GRID_LAYOUT, value)
        get() = getBoolean(GRID_LAYOUT)

    var writter: Boolean
        set(value) = setData(WRITTER,value)
        get() = getBoolean(WRITTER)

    var appName: String?
        set(value) = setData(APP_NAME,value)
        get() = getString(APP_NAME)

    var column: Int
        set(value) = setData(COLUMN,value)
        get() = getInt(COLUMN)

    var theme: Boolean
        set(value) = setData(THEME, value)
        get() = getBoolean(THEME)

    var item: Boolean
        set(value) = setData(ITEM,value)
        get() = getBoolean(ITEM)

    var content: Int
        set(value) = setData(CONTENT,value)
        get() = getInt(CONTENT)

}