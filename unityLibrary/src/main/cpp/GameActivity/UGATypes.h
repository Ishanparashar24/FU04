#pragma once

#include <stdint.h>

namespace Unity
{
    struct Range
    {
        int32_t start;
        int32_t length;

        Range()
            : start(0)
            , length(0)
        {
        }

        Range(int32_t start, int32_t length)
            : start(start)
            , length(length)
        {
        }
    };

    // See: https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/view/WindowInsets.java#1409
    enum InsetsType : int
    {
        StatusBars,
        NavigationBars,
        CaptionBar,
        IME,
        SystemGestures,
        MandatorySystemGestures,
        TappableElement,
        DisplayCutout
    };
}
