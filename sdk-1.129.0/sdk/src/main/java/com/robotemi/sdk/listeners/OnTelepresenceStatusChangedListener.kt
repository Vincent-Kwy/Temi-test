package com.robotemi.sdk.listeners

import com.robotemi.sdk.telepresence.CallState

@Deprecated("sessionId is no longer available from startTelepresence return value")
abstract class OnTelepresenceStatusChangedListener(var sessionId: String) {

    /**
     * Called when Telepresence status was changed.
     *
     */
    abstract fun onTelepresenceStatusChanged(callState: CallState)
}
