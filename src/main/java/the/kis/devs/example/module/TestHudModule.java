package the.kis.devs.example.module;

import com.kisman.cc.features.hud.HudModule;
import com.kisman.cc.util.render.customfont.CustomFontUtil;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author _kisman_
 * @since 15:18 of 08.06.2022
 */
public class TestHudModule extends HudModule {
    public TestHudModule() {
        super("ExampleHudModule", true);
        setX(100);
        setY(120);
        setW(20);
        setH(20);
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Text event) {
        CustomFontUtil.drawStringWithShadow("Hello from ExampleHudModule!", getX(), getY(), -1);
    }
}
