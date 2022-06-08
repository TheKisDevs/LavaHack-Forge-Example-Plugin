package the.kis.devs.example.module;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import the.kis.devs.api.features.hud.HudModuleAPI;
import the.kis.devs.api.util.render.customfont.CustomFontUtilAPI;

/**
 * @author _kisman_
 * @since 15:18 of 08.06.2022
 */
public class TestHudModule extends HudModuleAPI {
    public TestHudModule() {
        super("ExampleHudModule",  "Just a example hud module ;7", true);
        setX(100);
        setY(120);
        setW(20);
        setH(20);
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Text event) {
        CustomFontUtilAPI.drawStringWithShadow("Hello from ExampleHudModule!", getX(), getY(), -1);
    }
}
