package com.robberphex.impl2;

import com.robberphex.Plugin;

public class PluginImpl2 implements Plugin {
    @Override
    public String getName() {
        return PluginImpl2.class.getCanonicalName();
    }
}
