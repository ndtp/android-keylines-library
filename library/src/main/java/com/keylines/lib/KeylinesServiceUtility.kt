package com.keylines.lib

import android.content.ComponentName
import android.content.Intent

/**
 * Utility class to send messages to the Keylines app
 */
object KeylinesServiceUtility {
    private const val ACTION_UPDATE_KEYLINES = "com.keylines.lib.action.UPDATE_KEYLINES"
    private const val DATA_KEYLINES = "data_keylines"

    /**
     * Send a message to the Keylines service to update the keylines shown. This will start the service
     * if it is not already running
     *
     * @param data a [KeylinesData] object containing the desired keylines
     */
    fun updateKeylines(data: KeylinesData): Intent {
        return Intent().apply {
            component = ComponentName(
                "com.keylines.app",
                "com.keylines.app.KeylinesBroadcastReceiver"
            )
            putExtra(DATA_KEYLINES, data)
            action = ACTION_UPDATE_KEYLINES
        }
    }
}