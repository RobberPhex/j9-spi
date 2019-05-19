package com.robberphex.impl1;

import com.robberphex.Plugin;

public class PluginImpl1 implements Plugin {
    @Override
    public String getName() {
        return PluginImpl1.class.getCanonicalName();
    }
}
