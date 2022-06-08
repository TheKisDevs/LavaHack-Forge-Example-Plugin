package the.kis.devs.example.module;

import com.kisman.cc.features.module.Category;
import com.kisman.cc.features.module.Module;
import com.kisman.cc.util.chat.cubic.ChatUtility;
import com.kisman.cc.util.render.customfont.CustomFontUtil;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TestModule extends Module
{
    public TestModule()
    {
        super("ExampleModule", "Test", Category.MISC);
    }

    @Override
    public void onEnable(){
        super.onEnable();
        if(mc.player == null || mc.world == null) {
            return;
        }

        ChatUtility.info().printClientModuleMessage("Enable event");
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if(mc.player == null || mc.world == null) {
            return;
        }

        ChatUtility.info().printClientModuleMessage("Disable event");
    }

    @Override
    public void update() {
        super.update();
        if(mc.player == null || mc.world == null) {
            return;
        }

        ChatUtility.info().printClientModuleMessage("ClientTick event");
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Text event) {
        CustomFontUtil.drawStringWithShadow("Hello from ExampleModule!", 100, 100, -1);
    }
}