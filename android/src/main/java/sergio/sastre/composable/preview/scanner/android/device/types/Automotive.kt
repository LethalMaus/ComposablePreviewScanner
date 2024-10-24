package sergio.sastre.composable.preview.scanner.android.device.types

import sergio.sastre.composable.preview.scanner.android.device.domain.Device
import sergio.sastre.composable.preview.scanner.android.device.domain.Dimensions
import sergio.sastre.composable.preview.scanner.android.device.domain.GetDeviceByIdentifier
import sergio.sastre.composable.preview.scanner.android.device.domain.Identifier
import sergio.sastre.composable.preview.scanner.android.device.domain.Orientation.LANDSCAPE
import sergio.sastre.composable.preview.scanner.android.device.domain.Orientation.PORTRAIT
import sergio.sastre.composable.preview.scanner.android.device.domain.Shape.NORMAL
import sergio.sastre.composable.preview.scanner.android.device.domain.Type.CAR
import sergio.sastre.composable.preview.scanner.android.device.domain.Unit.PX

enum class Automotive(
    override val device: Device
): GetDeviceByIdentifier<Automotive> {

    AUTOMOTIVE_1024DP_LANDSCAPE(
        Device(
            id = Identifier.AUTOMOTIVE_1024DP_LANDSCAPE,
            dimensions = Dimensions(
                width = 1024f,
                height = 768f,
                unit = PX
            ),
            densityDpi = 160,
            orientation = LANDSCAPE,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_1080DP_LANDSCAPE(
        Device(
            id = Identifier.AUTOMOTIVE_1080DP_LANDSCAPE,
            dimensions = Dimensions(
                width = 1080f,
                height = 600f,
                unit = PX
            ),
            densityDpi = 120,
            orientation = LANDSCAPE,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_1408DP_LANDSCAPE(
        Device(
            id = Identifier.AUTOMOTIVE_1408DP_LANDSCAPE,
            dimensions = Dimensions(
                width = 1408f,
                height = 792f,
                unit = PX
            ),
            densityDpi = 160,
            orientation = LANDSCAPE,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_1408DP_LANDSCAPE_WITH_GOOGLE_PLAY(
        Device(
            id = Identifier.AUTOMOTIVE_1408DP_LANDSCAPE_WITH_GOOGLE_PLAY,
            dimensions = Dimensions(
                width = 1408f,
                height = 792f,
                unit = PX
            ),
            densityDpi = 160,
            orientation = LANDSCAPE,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_DISTANT_DISPLAY(
        Device(
            id = Identifier.AUTOMOTIVE_DISTANT_DISPLAY,
            dimensions = Dimensions(
                width = 1080f,
                height = 600f,
                unit = PX
            ),
            densityDpi = 120,
            orientation = LANDSCAPE,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_DISTANT_DISPLAY_WITH_GOOGLE_PLAY(
        Device(
            id = Identifier.AUTOMOTIVE_DISTANT_DISPLAY_WITH_GOOGLE_PLAY,
            dimensions = Dimensions(
                width = 1080f,
                height = 600f,
                unit = PX
            ),
            densityDpi = 120,
            orientation = LANDSCAPE,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_PORTRAIT(
        Device(
            id = Identifier.AUTOMOTIVE_PORTRAIT,
            dimensions = Dimensions(
                width = 800f,
                height = 1280f,
                unit = PX
            ),
            densityDpi = 120,
            orientation = PORTRAIT,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_LARGE_PORTRAIT(
        Device(
            id = Identifier.AUTOMOTIVE_LARGE_PORTRAIT,
            dimensions = Dimensions(
                width = 1280f,
                height = 1606f,
                unit = PX
            ),
            densityDpi = 160,
            orientation = PORTRAIT,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),

    AUTOMOTIVE_ULTRAWIDE(
        Device(
            id = Identifier.AUTOMOTIVE_ULTRAWIDE,
            dimensions = Dimensions(
                width = 3904f,
                height = 1320f,
                unit = PX
            ),
            densityDpi = 240,
            orientation = LANDSCAPE,
            shape = NORMAL,
            chinSize = 0,
            type = CAR
        )
    ),
}