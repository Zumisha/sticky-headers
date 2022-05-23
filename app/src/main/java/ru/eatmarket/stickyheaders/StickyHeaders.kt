package ru.eatmarket.stickyheaders

import android.view.View

interface StickyHeaders {
    fun isStickyHeader(position: Int): Boolean
    interface ViewSetup {
        /**
         * Adjusts any necessary properties of the `holder` that is being used as a sticky header.
         *
         * [.teardownStickyHeaderView] will be called sometime after this method
         * and before any other calls to this method go through.
         */
        fun setupStickyHeaderView(stickyHeader: View)

        /**
         * Reverts any properties changed in [.setupStickyHeaderView].
         *
         * Called after [.setupStickyHeaderView].
         */
        fun teardownStickyHeaderView(stickyHeader: View)

        fun onPinStickyHeader(stickyHeader: View)
        fun onUnpinStickyHeader(stickyHeader: View)
    }
}