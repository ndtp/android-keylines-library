package com.keylines.lib

import java.io.Serializable
import java.util.*

/**
 * Keyline data object containing a set of Keylines that can be passed via intent
 */
class KeylinesData : Serializable {
    /**
     * @return the set of Keylines
     */
    val keylines = ArrayList<Keyline>()

    /**
     * Add a Keyline to the set
     *
     * @param kl keyline to add
     */
    fun addKeyline(kl: Keyline) {
        keylines.add(kl)
    }

    /**
     * Adds a Keyline to the set
     *
     * @param positionInDP Add a keyline by position (DP)
     */
    fun addKeyline(positionInDP: Float) {
        keylines.add(Keyline(positionInDP))
    }

    /**
     * Add a keyline area to the set
     *
     * @param positionInDP x position of the area in DP
     * @param widthInDP    width of the area in DP
     */
    fun addKeylineArea(positionInDP: Float, widthInDP: Float) {
        keylines.add(KeylineArea(positionInDP, widthInDP))
    }

    /**
     * Remove a keyline from the set
     *
     * @param kl the Keyline to remove
     */
    fun removeKeyline(kl: Keyline) {
        keylines.remove(kl)
    }

    /**
     * Get a Keyline by index
     *
     * @param index the Keyline to retrieve from the set
     * @return Keyline
     */
    fun getKeyline(index: Int): Keyline {
        return keylines[index]
    }

    /**
     * Describes a keyline (position)
     */
    open class Keyline(val position: Float) : Serializable

    /**
     * Describes a keyline area (position + width)
     */
    class KeylineArea(positionInDP: Float, val width: Float) : Keyline(positionInDP)
}
