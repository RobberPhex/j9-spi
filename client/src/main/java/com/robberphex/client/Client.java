package com.robberphex.client;

import com.robberphex.Plugin;

import java.util.ServiceLoader;

class Client {

    public static void main(String[] args) {
        ServiceLoader<Plugin> loader = ServiceLoader.load(Plugin.class);
        for (Plugin plugin : loader) {
            System.out.println(plugin.getClass().getCanonicalName());
        }
    }
}