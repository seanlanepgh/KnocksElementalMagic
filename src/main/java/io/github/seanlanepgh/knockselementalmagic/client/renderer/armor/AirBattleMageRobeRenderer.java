package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.AirBattleMageModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceBattleMageModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.AirBattleMageArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceBattleMageArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AirBattleMageRobeRenderer extends GeoArmorRenderer<AirBattleMageArmor> {
    public AirBattleMageRobeRenderer() {
        super(new AirBattleMageModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
