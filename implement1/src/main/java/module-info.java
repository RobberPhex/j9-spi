import com.robberphex.impl1.PluginImpl1;

module com.robberphex.impl1 {
    requires com.robberphex.interfacex;
    exports com.robberphex.impl1;
    provides com.robberphex.Plugin with PluginImpl1;
}