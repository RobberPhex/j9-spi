import com.robberphex.impl2.PluginProvider;

module com.robberphex.impl2 {
    requires com.robberphex.interfacex;
    exports com.robberphex.impl2;
    provides com.robberphex.Plugin with PluginProvider;
}