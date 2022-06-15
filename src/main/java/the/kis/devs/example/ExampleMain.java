package the.kis.devs.example;

import com.kisman.cc.features.plugins.Plugin;
import the.kis.devs.api.features.hud.HudModuleAPI;
import the.kis.devs.api.features.hud.HudModuleManagerAPI;
import the.kis.devs.api.features.module.ModuleAPI;
import the.kis.devs.api.features.module.ModuleManagerAPI;
import the.kis.devs.example.module.TestHudModule;
import the.kis.devs.example.module.TestModule;

@SuppressWarnings("unused")
public class ExampleMain implements Plugin {
    private final ModuleAPI testModule = new TestModule();
    private final HudModuleAPI testHudModule = new TestHudModule();

    @Override
    public void load() {
        ModuleManagerAPI.getModules().add(testModule);
        HudModuleManagerAPI.getModules().add(testHudModule);
    }

    @Override
    public void unload() {
        ModuleManagerAPI.getModules().remove(testModule);
        HudModuleManagerAPI.getModules().remove(testHudModule);
    }
}

