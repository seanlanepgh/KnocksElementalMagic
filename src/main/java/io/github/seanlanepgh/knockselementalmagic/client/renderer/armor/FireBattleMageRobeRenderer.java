package io.github.seanlanepgh.knockselementalmagic.client.renderer.armor;

import io.github.seanlanepgh.knockselementalmagic.client.model.armor.FireBattleMageModel;
import io.github.seanlanepgh.knockselementalmagic.client.model.armor.IceBattleMageModel;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.FireBattleMageArmor;
import io.github.seanlanepgh.knockselementalmagic.core.items.armor.IceBattleMageArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FireBattleMageRobeRenderer extends GeoArmorRenderer<FireBattleMageArmor> {
    public FireBattleMageRobeRenderer() {
        super(new FireBattleMageModel());

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