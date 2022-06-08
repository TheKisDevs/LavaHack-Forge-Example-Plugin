package the.kis.devs.example;
import com.kisman.cc.Kisman;
import com.kisman.cc.features.hud.HudModule;
import com.kisman.cc.features.module.Module;
import com.kisman.cc.features.plugins.Plugin;
import the.kis.devs.example.module.TestHudModule;
import the.kis.devs.example.module.TestModule;

@SuppressWarnings("unused")
public class ExampleMain implements Plugin {
    private final Module testModule = new TestModule();
    private final HudModule testHudModule = new TestHudModule();

    @Override
    public void load() {
        Kisman.instance.moduleManager.modules.add(testModule);
        Kisman.instance.hudModuleManager.modules.add(testHudModule);
    }

    public void unload() {
        Kisman.instance.moduleManager.modules.remove(testModule);
        Kisman.instance.hudModuleManager.modules.remove(testHudModule);
    }
}

