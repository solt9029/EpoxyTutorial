@EpoxyDataBindingLayouts({R.layout.item})
@PackageModelViewConfig(rClass = R.class)
@PackageEpoxyConfig(
        requireAbstractModels = true,
        requireHashCode = true,
        implicitlyAddAutoModels = true
)
package com.example.shiode.epoxytutorial;

import com.airbnb.epoxy.EpoxyDataBindingLayouts;
import com.airbnb.epoxy.PackageModelViewConfig;
import com.airbnb.epoxy.PackageEpoxyConfig;