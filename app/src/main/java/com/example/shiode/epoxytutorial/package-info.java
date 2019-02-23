@EpoxyDataBindingLayouts({R.layout.item, R.layout.progress_bar})
@PackageModelViewConfig(rClass = R.class)
@PackageEpoxyConfig(
        requireAbstractModels = true,
        requireHashCode = true,
        implicitlyAddAutoModels = true
)
package com.example.shiode.epoxytutorial;

import com.airbnb.epoxy.EpoxyDataBindingLayouts;
import com.airbnb.epoxy.PackageEpoxyConfig;
import com.airbnb.epoxy.PackageModelViewConfig;