package com.robberphex.impl2;

import com.robberphex.Plugin;

public interface PluginProvider {
    static Plugin provider() {
        return new PluginImpl2();
    }
}
